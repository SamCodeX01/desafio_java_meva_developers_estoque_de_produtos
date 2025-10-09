import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Digite uma opção: ");
            int opcao = sc.nextInt();

                if(opcao != 4){

                }


            switch (opcao){

            }



            System.out.println("*** Adicione um produto *** ");

            System.out.print("Adicione um código: ");
            int codigo = sc.nextInt();

            System.out.print("Adicione um Produto: ");
            String nomeProduto = sc.next();

            System.out.print("Adicione um Preço: ");
            double preco = sc.nextDouble();

            System.out.print("Adicione a qtd de estoque: ");
            int qtdEstoque = sc.nextInt();

            Produtos p1 = new Produtos(codigo, nomeProduto, preco, qtdEstoque);
        }



        }

}