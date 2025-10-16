import java.util.ArrayList;
import java.util.List;

public class GerenciarProdutos {

        static List<Produtos> listaDeProdutos = new ArrayList<>();

        public static void adicionarProdutos(Produtos produtos){
            listaDeProdutos.add(produtos);

            System.out.println("Produto adicionado com sucesso!");
        }

        public static void removerProdutos(Produtos produtos){
            listaDeProdutos.remove(produtos);
            System.out.println("Produto " + produtos + " removido com sucesso!");
        }
//  public static void removerProdutos(Produtos produtos){
//            listaDeProdutos.remove(produtos);
//            System.out.println("Produto " + produtos + " removido com sucesso!");
//        }

        public static void listarProdutos(){
            for(Produtos p: listaDeProdutos){
//                if (p.getTipo().equals("alimento")) {
                    System.out.println("Lista de Produtos abaixo: ");
                    System.out.print("Código: " + p.getCodigo());
                    System.out.print("Produto: " + p.getNomeProduto());
                    System.out.print("Preço: " + p.getPreço());
                    System.out.print("Estoque: " + p.getQtdEstoque());
//                }

//                if (p.getTipo().equals("eletronico")) {
                    System.out.println("Lista de Produtos abaixo: ");
                    System.out.print("Código: " + p.getCodigo());
                    System.out.print("Produto: " + p.getNomeProduto());
                    System.out.print("Preço: " + p.getPreço());
                    System.out.print("Estoque: " + p.getQtdEstoque());
//                }


            }
        }

    // Método estático que busca um produto pelo código na lista
    public static Produtos buscarCodigo(int codigoBusca) {
            for (Produtos p : listaDeProdutos) { //p faz referencia aos objetos instanciados da classe Produtos
                if (p.getCodigo() == codigoBusca) {// Verifica se o código do produto atual é igual ao código buscado
                    return p; // Retorna o produto encontrado
                }
            }
            return null; // Retorna null se nenhum produto for encontrado

    }

}


/*

public class Main {
    public static void main(String[] args) {

        List<Produtos> produtosss = new ArrayList<>();
        produtosss.add(new Instrumentos("Violino", 6));
        produtosss.add(new Instrumentos("Flauta", 2));
        produtosss.add(new Comida("Pudim", 2));

        for(Produtos p: produtosss){
//            System.out.println(p.nome);
//            System.out.println(p.qtd);
            p.tocar();
        }

    }
}


public interface Produtos {

    public void tocar();
}



public class Produtosss implements Produtos{
    public String nome;
    public int qtd;

    public Produtosss(String nome, int qtd) {
        this.nome = nome;
        this.qtd = qtd;
    }

    public void tocar(){
        System.out.println("Tocando instrumento!");
    }




public class Instrumentos implements Produtos{
    public String nome;
    public int qtd;

    public Instrumentos(String nome, int qtd) {
        this.nome = nome;
        this.qtd = qtd;
    }

    @Override
    public void tocar() {
        System.out.println("TOCANDO INSTRUMENTOS!");
    }
}


}







*/