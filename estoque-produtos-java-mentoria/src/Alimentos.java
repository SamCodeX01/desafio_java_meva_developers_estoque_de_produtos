public class Alimentos extends Produtos{
    private String dataFabricacao;
    private String dataVencimento;

    public Alimentos(String nomeProduto, double preço, int qtdEstoque, String dataFabricacao, String dataVencimento){
        super(nomeProduto, preço, qtdEstoque); //super() chama o construtor da superclasse. Permitindo acessar seus construtores, métodos e atributos.
        this.dataFabricacao = dataFabricacao;
        this.dataVencimento = dataVencimento;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }
    public String getDataVencimento() {
        return dataVencimento;
    }
    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }
    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

/*
Explicação:
super() → chama o construtor da classe pai
    super.toString() → chama o método toString() da classe pai
Dica para o toString() da classe Alimentos:
No método toString() da classe Alimentos, você pode chamar super.toString()
 para incluir as informações da classe pai e adicionar os atributos específicos.
*/
//
//    @Override
//    public String toString() {
//        return super.toString() + "Alimentos{" +
//                "dataFabricacao='" + dataFabricacao + '\'' +
//                ", dataVencimento='" + dataVencimento + '\'' +
//                '}';
//    }
}
