
    public class Roupas extends Produtos{
        private double tamanho;
        private String cor;

        public Roupas(String nomeProduto, double preço,
                      int qtdEstoque, double tamanho, String cor) {
            super(nomeProduto, preço, qtdEstoque);
            this.tamanho = tamanho;
            this.cor = cor;
        }

        public double getTamanho() {
            return tamanho;
        }
        public String getCor() {
            return cor;
        }
        public void setTamanho(float tamanho) {
            this.tamanho = tamanho;
        }
        public void setCor(String cor) {
            this.cor = cor;
        }
}
