public class Service implements  Vendavel{
    private String tipo;
    private double valor = 5;
    private double precoPorHora = 100;
    private double desconto = 10;

    @Override
    public void calcularPrecoFinal() {
        double valorFinal = 0;
        valorFinal = valorFinal + (valor * precoPorHora) - desconto; //
        System.out.println("Valor final a ser pago: " + valorFinal); // 490
    }
}
