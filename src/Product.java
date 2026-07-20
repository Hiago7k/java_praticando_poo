public class Product implements  Vendavel{
    private String nome;
    private int quantidade = 23;
    private double valor = 199.0;
    private double desconto = 0;

    @Override
    public void calcularPrecoFinal() {
        double valorFinal = 0;
        valorFinal = valorFinal + (valor * quantidade) - desconto;
        System.out.println("Valor final a ser pago: " + valorFinal); // 4,439

    }
}
