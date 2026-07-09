public class Produto {
    private String nome;
    private double preco;
    private double descontoMax = 0;

    public void aplicaDesconto(int desconto){
        descontoMax = preco * desconto / 100;
        preco = preco - descontoMax;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
