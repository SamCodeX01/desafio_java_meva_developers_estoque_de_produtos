public class Instrumentos extends Produtos {
    private String tipo;

    public Instrumentos(String nomeProduto, double preço, int qtdEstoque, String tipo) {
        super(nomeProduto, preço, qtdEstoque);
        this.tipo = tipo;
    }

    //GETTERS
    public String getTipo() {
        return tipo;
    }

    //SETTERS
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
