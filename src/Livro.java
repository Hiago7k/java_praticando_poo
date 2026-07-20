public class Livro implements Calculavel {
    private double desconto = 10;
    private double taxaAdicional = 0;
    private double preco = 100;

    @Override
    public double calcularPrecoFinal() {
        return preco = (preco + taxaAdicional)  - desconto;
    }
}
