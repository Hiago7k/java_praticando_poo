public class BankAccount {
    private double saldo;

    public void Sacar(double valor){

        if(valor <= saldo) {
            saldo = +saldo - valor;
            System.out.println("Valor de " + valor + " sacado com sucesso" );
            System.out.println("Seu saldo atual é de " + saldo);
        }else {
            System.out.println("Saldo insuficiente");
        }

    }
}
