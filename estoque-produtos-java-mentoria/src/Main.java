import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*5. Faltam atributos específicos:
Alimentos: dataFabricacao, dataVencimento

Eletronicos: garantiaMeses

Roupas: tamanho, cor

Instrumentos: tipo*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Produtos p = new Produtos("TEste 1", 1,1);
        p.emitirSom();



        while (true) {
            System.out.println("""
                    \n***************|MENU|*************** 
                         "1 - Adicionar Produto. 
                         "2 - Buscar produtos por código.
                         "3 - Remover produtos do estoque.
                         "4 - Atualizar quantidade de produtos
                         "5 - Listar produtos em estoque.
                         "6 - Sair");
                    """);
            System.out.print("Digite uma opção: ");
            int opcao = sc.nextInt();

            if (opcao == 6) {
                break;
            }

            switch (opcao) {
                case 1: System.out.println("Você escolheu a opção 1 - Adicionar Produto.");

                    System.out.println("Escolha o tipo do produto que deseja adicionar");
                    System.out.println("""
                            
                            "1 - Alimentos
                            "2 - Eletrônicos
                            "3 - Instrumentos
                            "4 - Roupas
                            """);
                    System.out.print("Digite uma opção: ");
                    int op = sc.nextInt();

                    switch (op) {
                        case 1:
                            System.out.println("****Você escolheu adicionar Alimentos!****");
                            String nomeAlimento, dataFabricacaoAlimento, dataVencimentoAlimento;
                            double precoAlimento;
                            int qtdEstoqueAlimento;

                            Scanner scanner = new Scanner(System.in);

                            System.out.print("Digite o nome do alimento: ");
                                nomeAlimento = scanner.next();
                            System.out.print("Digite o preço do produto: ");
                                precoAlimento = scanner.nextDouble();
                            System.out.print("Digite quantos adicionar ao estoque: ");
                                qtdEstoqueAlimento = scanner.nextInt();
                            System.out.print("Digite a data de Fabricação: ");
                                dataFabricacaoAlimento = scanner.next();
                            System.out.print("Digite a data de vencimento: ");
                                dataVencimentoAlimento = scanner.next();

                            Alimentos alimentos = new Alimentos(nomeAlimento, precoAlimento, qtdEstoqueAlimento, dataFabricacaoAlimento, dataVencimentoAlimento);
                            GerenciarProdutos.adicionarProdutos(alimentos);
                            break;

                        case 2:
                            System.out.println("****Você escolheu adicionar Eletrônicos!****");
                            String nomeEletronico;
                            double precoEletronico;
                            int qtdEstoqueEletronico;
                            //int garantiaMeses

                            Scanner scan = new Scanner(System.in);
                            System.out.print("Digite o nome do produto: ");
                            nomeEletronico = scan.next();
                            System.out.print("Digite o preço do produto: ");
                            precoEletronico = scan.nextDouble();
                            System.out.print("Digite quantos adicionar ao estoque: ");
                            qtdEstoqueEletronico = scan.nextInt();
                            System.out.print("Digite a garantia em meses: ");
                            int garantiaMeses = scan.nextInt();

//                          Eletronicos eletro = new Eletronicos("TEste 1", 1,1,1);

                            Eletronicos eletronicos = new Eletronicos(nomeEletronico, precoEletronico, qtdEstoqueEletronico, garantiaMeses);
                            GerenciarProdutos.adicionarProdutos(eletronicos);
                            break;
                        case 3:
                            System.out.println("****Você escolheu adicionar Instrumentos!****");
                            String nomeInstrumentos;
                            double precoInstrumentos;
                            int qtdEstoqueInstrumentos;

                            Scanner s = new Scanner(System.in);
                            System.out.print("Digite o produto: ");
                            nomeInstrumentos = s.next();
                            System.out.print("Digite o preço do produto: ");
                            precoInstrumentos = s.nextDouble();
                            System.out.print("Digite quantos adicionar ao estoque: ");
                            qtdEstoqueInstrumentos = s.nextInt();

                           // Instrumentos instrumentos = new Instrumentos(nomeInstrumentos, precoInstrumentos, qtdEstoqueInstrumentos);
                            //GerenciarProdutos.adicionarProdutos(instrumentos);
                            break;
                        case 4:
                            System.out.println("****Você escolheu adicionar Roupas!****");
                            String nomeRoupa;
                            double precoRoupa;
                            int qtdEstoqueRoupa;

                            Scanner sca = new Scanner(System.in);

                            System.out.print("Digite o produto: ");
                            nomeRoupa = sca.next();
                            System.out.print("Digite o preço do produto: ");
                            precoRoupa = sca.nextDouble();
                            System.out.print("Digite quantos adicionar ao estoque: ");
                            qtdEstoqueRoupa = sca.nextInt();

                           // Roupas roupas = new Roupas(nomeRoupa, precoRoupa, qtdEstoqueRoupa);
                           // GerenciarProdutos.adicionarProdutos(roupas);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("*****Você escolheu a opção 2 - Buscar produtos por código.*****");
                    System.out.print("Digite o código do produto a ser buscado: ");
                    int codProd = sc.nextInt();
                    GerenciarProdutos.buscarCodigo(codProd);
                    break;
                case 3:
                    System.out.println("****Você escolheu a opção 3 - Remover produtos do estoque.*****");
                    System.out.print("Digite o produto a ser removido: ");
                    String prodRemov = sc.next();
                   // GerenciarProdutos.removerProdutos(prodRemov);
                    break;
                case 4:
                    System.out.println("Você escolheu a opção 4 - Atualizar quantidade de produtos");
                    break;
                case 5:
                    System.out.println("Você escolheu a opção 5 - Listar produtos em estoque");
                    GerenciarProdutos.listarProdutos();
                    break;

//                    System.out.println("Função Adicionar");
//                    System.out.println("\n*** Adicione um produto *** ");
//
//                    System.out.print("Adicione um Produto: "); String nomeProduto = sc.next();
//                    System.out.print("Adicione um Preço: "); double preco = sc.nextDouble();
//                    System.out.print("Adicione a qtd de estoque: "); int qtdEstoque = sc.nextInt();
//                    GerenciarProdutos.adicionarProdutos(new Produtos(nomeProduto, preco, qtdEstoque));
//
//                    GerenciarProdutos.adicionarProdutos(new Eletronicos(nomeProduto, preco, qtdEstoque, garantiaMeses));
//                   double preço, int qtdEstoque, int garantiaMeses
            }
        }
    }
}