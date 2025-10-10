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