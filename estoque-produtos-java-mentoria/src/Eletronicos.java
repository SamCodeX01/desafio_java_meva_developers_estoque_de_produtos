
public  class Eletronicos extends Produtos  {
    private int garantiaMeses;

    //CONSTRUTOR
    public Eletronicos(String nomeProduto, double preco, int qtdEstoque, int garantiaMeses){
        super(nomeProduto, preco, qtdEstoque);
        this.garantiaMeses = garantiaMeses;
    }

    //GETTERS
    public int getGarantiaMeses(){
        return garantiaMeses;
    }

    //SETTERS
    public void setGarantiaMeses(int garantiaMeses){
        this.garantiaMeses = garantiaMeses;
    }


}