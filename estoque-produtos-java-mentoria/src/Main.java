import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

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
                    if(!sc.hasNextInt()){
                        System.out.println("\n***Erro! Digite apenas números inteiros!*** ");
                        sc.next(); //limpa o buffer
                        continue;
                    }

                int opcao = sc.nextInt();

                sc.nextLine();// limpa o buffer inválido

                if (opcao < 1 || opcao > 6) {
                    System.out.println("\n*****Atenção!!! Digite uma opção de 1 a 6*****");
                    continue; //volta para o inicio do loop
                }

                if (opcao == 6) {
                    break; //se opcao for igual a 6 saia do loop
                }

                switch (opcao) {
                    case 1:
                        System.out.println("Você escolheu a opção 1 - Adicionar Produto.\n");
                        System.out.println("Escolha o tipo do produto que deseja adicionar");
                        System.out.println("""
                                "1 - Alimentos
                                "2 - Eletrônicos
                                "3 - Instrumentos
                                "4 - Roupas
                                """);
                        System.out.print("Digite uma opção: ");
                            if(!sc.hasNextInt()){
                                System.out.println("\n***Erro! Digite um número de 1 a 4!*** ");
                                sc.next();//Limpa o buffer
                                continue;
                            }

                        int op = sc.nextInt();

                        switch (op) {
                            case 1:
                                System.out.println("\n****Você escolheu adicionar Alimentos!****\n");
                                String nomeAlimento, dataFabricacaoAlimento, dataVencimentoAlimento;
                                double precoAlimento;
                                int qtdEstoqueAlimento = 0;

                                System.out.print("Digite o nome do alimento: ");
                                    nomeAlimento = sc.next();
                                System.out.print("Digite o preço do produto: ");
                                    precoAlimento = GerenciarProdutos.lerDouble(sc);
                                System.out.print("Digite quantos adicionar ao estoque: ");
                                    qtdEstoqueAlimento = GerenciarProdutos.lerInteiro(sc);
                                System.out.print("Digite a data de Fabricação: ");
                                    dataFabricacaoAlimento = sc.next();
                                System.out.print("Digite a data de vencimento: ");
                                    dataVencimentoAlimento = sc.next();

                                Alimentos alimentos = new Alimentos(nomeAlimento, precoAlimento, qtdEstoqueAlimento, dataFabricacaoAlimento, dataVencimentoAlimento);
                                GerenciarProdutos.adicionarProdutos(alimentos);
                                break;
                            case 2:
                                System.out.println("****Você escolheu adicionar Eletrônicos!****");
                                String nomeEletronico;
                                double precoEletronico;
                                int qtdEstoqueEletronico, garantiaMeses;

                                System.out.print("Digite o nome do produto: ");
                                    nomeEletronico = sc.next();
                                System.out.print("Digite o preço do produto: ");
                                    precoEletronico = sc.nextDouble();
                                System.out.print("Digite quantos adicionar ao estoque: ");
                                    qtdEstoqueEletronico = sc.nextInt();
                                System.out.print("Digite o tempo de garantia em meses: ");
                                    garantiaMeses = sc.nextInt();

                                Eletronicos eletronicos = new Eletronicos(nomeEletronico, precoEletronico, qtdEstoqueEletronico, garantiaMeses);
                                GerenciarProdutos.adicionarProdutos(eletronicos);
                                break;
                            case 3:
                                System.out.println("\n****Você escolheu adicionar Instrumentos!****\n");
                                String nomeInstrumento, tipoInstrumento;
                                double precoInstrumento;
                                int qtdEstoqueInstrumento;

                                System.out.print("Digite o produto: ");
                                    nomeInstrumento = sc.next();
                                System.out.print("Digite o preço do produto: ");
                                    precoInstrumento = sc.nextDouble();
                                System.out.print("Digite quantos adicionar ao estoque: ");
                                    qtdEstoqueInstrumento = sc.nextInt();
                                System.out.print("Digite o tipo do Instrumento: ");
                                   tipoInstrumento = sc.next();

                                Instrumentos instrumentos = new Instrumentos(nomeInstrumento, precoInstrumento, qtdEstoqueInstrumento, tipoInstrumento);
                                GerenciarProdutos.adicionarProdutos(instrumentos);
                                break;
                            case 4:
                                System.out.println("\n****Você escolheu adicionar Roupas!****\n");
                                String nomeRoupa, corRoupa;
                                float precoRoupa, tamanhoRoupa;
                                int qtdEstoqueRoupa;

                                System.out.print("Digite o produto: ");
                                    nomeRoupa = sc.next();
                                System.out.print("Digite o preço do produto: ");
                                    precoRoupa = sc.nextFloat();
                                System.out.print("Digite quantos adicionar ao estoque: ");
                                    qtdEstoqueRoupa = sc.nextInt();
                                System.out.print("Digite quantos adicionar ao estoque: ");
                                    tamanhoRoupa = sc.nextFloat();
                                System.out.print("Digite quantos adicionar ao estoque: ");
                                    corRoupa = sc.next();

                                Roupas roupas = new Roupas(nomeRoupa, precoRoupa, qtdEstoqueRoupa, tamanhoRoupa, corRoupa);
                                GerenciarProdutos.adicionarProdutos(roupas);
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("\nVocê escolheu a opção 2 - Buscar produtos por código.");
                        System.out.print("Digite o código do produto a ser buscado: ");
                        int cod = sc.nextInt();
                        GerenciarProdutos.buscarProdutos(cod);
                        break;
                    case 3:
                        System.out.println("****Você escolheu a opção 3 - Remover produtos do estoque.****");
                        System.out.print("\nDigite o código do produto a ser removido: ");
                        int codRemover = sc.nextInt();
                        GerenciarProdutos.removerProdutos(codRemover);
                        break;
                    case 4:
                        System.out.println("\nVocê escolheu a opção 4 - Atualizar quantidade de produtos");
                        System.out.print("\nDigite o código do produto em que deseja atualizar no estoque: ");
                        int codAtualizar = sc.nextInt();
                        System.out.print("\nDigite a quantidade a ser atualizada no estoque: ");
                        int qtdAtualizar = sc.nextInt();
                        GerenciarProdutos.atualizarQtdEstoque(codAtualizar, qtdAtualizar);
                        break;
                    case 5:
                        System.out.println("\nVocê escolheu a opção 5 - Listar produtos em estoque");
                        GerenciarProdutos.listarProdutos();
                        break;
                }
        }
        sc.close(); //fecha o scanner
    }
}