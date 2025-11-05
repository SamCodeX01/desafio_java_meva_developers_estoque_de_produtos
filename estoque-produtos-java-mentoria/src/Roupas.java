
    public class Roupas extends Produtos{
        private String tamanho;
        private String cor;

        public Roupas(String nomeProduto, double preço, int qtdEstoque, String tamanho, String cor) {
            super(nomeProduto, preço, qtdEstoque);
            this.tamanho = tamanho;
            this.cor = cor;
        }

        public String getTamanho() {
            return tamanho;
        }
        public String getCor() {
            return cor;
        }
        public void setTamanho(String tamanho) {
            this.tamanho = tamanho;
        }
        public void setCor(String cor) {
            this.cor = cor;
        }
}
