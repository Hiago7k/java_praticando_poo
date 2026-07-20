public class ProdutoFisico  implements  Calculavel{
    private double desconto = 0;
    private double taxaAdicional = 20;
    private double preco = 100;

    @Override
    public double calcularPrecoFinal() {
        return preco = (preco + taxaAdicional)  - desconto;
    }
}
