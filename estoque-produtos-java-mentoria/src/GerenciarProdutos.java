import java.util.ArrayList;
import java.util.List;

public class GerenciarProdutos {
        static List<Produtos> listaDeProdutos = new ArrayList<>();

        public String adicionarProdutos(Produtos produtos){
            this.listaDeProdutos.add(produtos);
            return "Produto adicionado com sucesso!";
        }

        public void removerProdutos(Produtos produtos){
            this.listaDeProdutos.remove(produtos);
            System.out.println("Produto removido com sucesso!");
        }

        public static void listarProdutos(){
            for(Produtos p: listaDeProdutos){
                System.out.println("Lista de Produtos abaixo: " + p);
            }
        }

}
