import java.util.ArrayList;
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
                            "4 - Produtos
                            "5 - Roupas
                            """);
                    System.out.print("Digite uma opção: ");
                    int op = sc.nextInt();

                    switch (op) {
                        case 1:
                            System.out.println("****Você escolheu adicionar Alimentos!****");
                            String nomeProduto;
                            double precoProduto;
                            int qtdEstoque;
                            //função adicionar produtos
                            Scanner scanner = new Scanner(System.in);
                            System.out.print("Digite o produto: ");
                            nomeProduto = scanner.next();
                            System.out.print("Digite o preço do produto: ");
                            precoProduto = scanner.nextDouble();
                            System.out.print("Digite quantos adicionar ao estoque: ");
                            qtdEstoque = scanner.nextInt();

                            Produtos p = new Produtos(nomeProduto, precoProduto, qtdEstoque);
                            GerenciarProdutos.adicionarProdutos(p);
                            break;
                        case 2:
                            System.out.println("");
                            //"2 - Buscar produtos por código.
                            break;
                        case 3:
                            System.out.println("");
                            //"3 - Remover produtos do estoque.
                            break;
                        case 4:
                            System.out.println("");
                            //"4 - Atualizar quantidade de produtos
                            break;
                        case 5:
                            System.out.println("");
                            //"5 - Listar produtos em estoque.
                            break;
                    }

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