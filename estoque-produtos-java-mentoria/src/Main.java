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
                            String nomeAlimento;
                            double precoAlimento;
                            int qtdEstoqueAlimento;

                            Scanner scanner = new Scanner(System.in);

                            System.out.print("Digite o produto: ");
                            nomeAlimento = scanner.next();
                            System.out.print("Digite o preço do produto: ");
                            precoAlimento = scanner.nextDouble();
                            System.out.print("Digite quantos adicionar ao estoque: ");
                            qtdEstoqueAlimento = scanner.nextInt();

                            Alimentos alimentos = new Alimentos(nomeAlimento, precoAlimento, qtdEstoqueAlimento);
                            //public Alimentos(String nomeProduto, double preço, int qtdEstoque, String dataFabricacao, String dataVencimento){
                            GerenciarProdutos.adicionarProdutos(alimentos);
                            break;
                        case 2:
                            System.out.println("****Você escolheu adicionar Eletrônicos!****");
                            String nomeEletronico;
                            double precoEletronico;
                            int qtdEstoqueEletronico;
                            //int garantiaMeses

                            Scanner scan = new Scanner(System.in);
                            System.out.print("Digite o produto: ");
                            nomeEletronico = scan.next();
                            System.out.print("Digite o preço do produto: ");
                            precoEletronico = scan.nextDouble();
                            System.out.print("Digite quantos adicionar ao estoque: ");
                            qtdEstoqueEletronico = scan.nextInt();

                            Produtos produt = new Produtos(nomeEletronico, precoEletronico, qtdEstoqueEletronico);
                            GerenciarProdutos.adicionarProdutos(produt);
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

                            Produtos prod = new Produtos(nomeInstrumentos, precoInstrumentos, qtdEstoqueInstrumentos);
                            GerenciarProdutos.adicionarProdutos(prod);
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

                            Produtos produ = new Produtos(nomeRoupa, precoRoupa, qtdEstoqueRoupa);
                            GerenciarProdutos.adicionarProdutos(produ);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Você escolheu a opção 2 - Buscar produtos por código.");
                    break;
                case 3:
                    System.out.println("Você escolheu a opção 3 - Remover produtos do estoque.");
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