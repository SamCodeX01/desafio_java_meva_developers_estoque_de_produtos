import java.util.ArrayList;
import java.util.List;

public class GerenciarProdutos {

        static List<Produtos> listaDeProdutos = new ArrayList<>();

        public static void adicionarProdutos(Produtos produtos){
            listaDeProdutos.add(produtos);

            System.out.println("\nProduto adicionado com sucesso!");
        }

//        public void removerProdutos(Produtos produtos){
//            this.listaDeProdutos.remove(produtos);
//            System.out.println("Produto removido com sucesso!");
//        }

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

}

