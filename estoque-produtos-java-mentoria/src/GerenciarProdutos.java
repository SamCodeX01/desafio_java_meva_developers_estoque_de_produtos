import javax.swing.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class GerenciarProdutos {

        static List<Produtos> listaDeProdutos = new ArrayList<>();

        public static void adicionarProdutos(Produtos produtos){
            listaDeProdutos.add(produtos);

            System.out.println("\nProduto adicionado com sucesso!");
        }

        public static void removerProdutos(int cod){
            for(Produtos p: listaDeProdutos){
                if(cod == p.getCodigo()){
                 listaDeProdutos.remove(p);  // ← Remove o OBJETO p, não o código
                 System.out.println("Produto removido com sucesso!");
                 System.out.println("Código: " + cod);
                 System.out.println("Produto: " + p.getNomeProduto());
                 return; // Sai do método após remover
                }
            }
            System.out.println("Produto não encontrado Código: " + cod);
        }

       public static void buscarProdutos(int cod){
            for(Produtos p: listaDeProdutos){
                if(cod == p.getCodigo()){
                    System.out.println(p.getCodigo());
                    System.out.println(p.getNomeProduto());
                    System.out.println(p.getPreço());
                    System.out.println(p.getQtdEstoque());

                    if(p instanceof Alimentos){
                        System.out.println("Fabricação: " + ((Alimentos) p).getDataFabricacao());
                        System.out.println("Data de Vencimento: " + ((Alimentos) p).getDataVencimento());
                    }
                    if(p instanceof Eletronicos){
                        System.out.println("Garantia em Meses: " + ((Eletronicos) p).getGarantiaMeses());
                    }
                    if(p instanceof Instrumentos){
                        System.out.println("Tipo do instrumento: " + ((Instrumentos) p).getTipo());
                    }
                    if(p instanceof Roupas){
                        System.out.println("Tamanho: " + ((Roupas) p).getTamanho());
                        System.out.println("Cor: " + ((Roupas) p).getCor());
                    }
                    System.out.println("==========================");
                    return;
                }

            }
           System.out.println("Produto não encontrado! Código: " + cod);

       }

        public static void listarProdutos(){
            for(Produtos p: listaDeProdutos){
                System.out.println("------------------------");
                System.out.println("Código: " + p.getCodigo());
                System.out.println("Nome do Produto: " + p.getNomeProduto());
                System.out.println("Preço: " + p.getPreço());
                System.out.println("Estoque: " + p.getQtdEstoque());

                //Verifica o tipo específico do produto
                if(p instanceof Alimentos){//Se p for uma instância de Alimentos, se p pertence à família Alimentos, verifica se o produto p é da classe Alimentos
                    Alimentos alimento = (Alimentos) p; //Uma variável do tipo Alimentos chamada 'alimento', que recebe o casting (Alimentos) que converte o p em Alimentos"
                    System.out.println("Data de Fabricação: " + alimento.getDataFabricacao());
                    System.out.println("Data de Vencimento: " + alimento.getDataVencimento());
                    System.out.println("Tipo: Alimento ");
                }

                if(p instanceof Eletronicos){
                    Eletronicos eletronicos = (Eletronicos) p; //(Eletronicos) força o p a virar um Eletronicos
                    System.out.println("Meses de garantia: " + eletronicos.getGarantiaMeses());
                    System.out.println("Tipo: Eletrônico");
                }
                if(p instanceof Instrumentos){
                    Instrumentos instrumentos = (Instrumentos) p;
                    System.out.println("Tipo do Instrumento: " + instrumentos.getTipo());
                    System.out.println("Tipo: Instrumento");
                }
                if(p instanceof Roupas){
                    Roupas roupas = (Roupas) p;
                    System.out.println("Tamanho da Roupa: " + roupas.getTamanho());
                    System.out.println("Cor da Roupa: " + roupas.getCor());
                    System.out.println("Tipo: Roupa");
                }
                System.out.println("------------------------");

            }
        }

        /*3) Atualizar quantidade de produtos em estoque: O sistema deve permitir a
    atualização da quantidade de produtos em estoque, seja para adicionar ou remover unidades.*/

    public static void atualizarQtdEstoque(int cod, int valorInserir){
        for(Produtos p: listaDeProdutos){
            if(cod == p.getCodigo()){
                int estoqueTotal = p.getQtdEstoque() + valorInserir;
                p.setQtdEstoque(estoqueTotal); //Atualiza o estoque no objeto
                System.out.println("Estoque atualizado com sucesso!");
                System.out.println("Você " + (valorInserir >= 0 ? "Inseriu": "removeu") + " um produto");
                System.out.println("Você atualizou em " + valorInserir + " o estoque de " + p.getNomeProduto() + ".");
                System.out.println("Quantidade Total do Estoque de " + p.getNomeProduto() + ": " + estoqueTotal + " unidades.");
                return;
            }
        }
        System.out.println("Produto não encontrado! " + cod);
    }

    public static int lerInteiro(Scanner sc) {
        while (true) {
            if (!sc.hasNextInt()) {
                System.out.print("Digite apenas números inteiros: ");
                sc.next();//Limpa o buffer
                continue;
            }
            int valor = sc.nextInt();
            sc.nextLine(); //limpa o buffer
            return valor;
        }
    }

        public static double lerDouble(Scanner sc) {
            while (true) {
                if (!sc.hasNextDouble()) {
                    System.out.print("Digite um valor numérico válido: ");
                    sc.next(); // Limpa o buffer
                    continue;
                }
                double valor = sc.nextDouble();
                sc.nextLine(); // Limpa o buffer do enter
                return valor;
            }
        }
    }


