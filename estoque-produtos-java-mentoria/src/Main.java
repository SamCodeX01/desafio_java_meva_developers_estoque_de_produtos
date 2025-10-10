import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("""
                 ("\n***MENU***") 
                 
                      "1 - Adicionar Produto. 
                      "2 - Buscar produtos por código.
                      "3 - Remover produtos do estoque
                      "4 - Atualizar quantidade de produtos
                      "5 - Listar produtos em estoque.
                      "6 - Sair");
                    """);
            System.out.print("Digite uma opção: "); int opcao = sc.nextInt();

            if(opcao == 6){
                break;
            }

            switch (opcao) {
                case 1:
                    switch (opcao) {
                        case 1://Instrumentos, objeto - implentar listarProdutos()
                    }


                    System.out.println("Função Adicionar");
                    System.out.println("\n*** Adicione um produto *** ");

                    System.out.print("Adicione um Produto: "); String nomeProduto = sc.next();
                    System.out.print("Adicione um Preço: "); double preco = sc.nextDouble();
                    System.out.print("Adicione a qtd de estoque: "); int qtdEstoque = sc.nextInt();
                    GerenciarProdutos.adicionarProdutos(new Produtos(nomeProduto, preco, qtdEstoque));

                    GerenciarProdutos.adicionarProdutos(new Eletronicos(nomeProduto, preco, qtdEstoque, garantiaMeses));
//                    double preço, int qtdEstoque, int garantiaMeses



                    break;

                case 2:
                    System.out.println("Função Buscar");
                case 3:
                    System.out.println("Função Remover");
                    break;
                case 4:
                    System.out.println("Função Atualizar");
                    break;
                case 5:
                    System.out.println("Função Listar");
                    GerenciarProdutos.listarProdutos();
                    break;
            }





            }

        }





}