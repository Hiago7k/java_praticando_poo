public class BankAccount {
    private double saldo = 5000;

    public void Sacar(double valor){
        if(valor <= saldo) {
            saldo =+  - valor;
            System.out.println("Valor de " + valor + " sacado com sucesso" );
            System.out.println("Seu saldo atual é de " + saldo);
        }else {
            System.out.println("Saldo insuficiente");
        }
    }


    public void Depositar(double valor){
        if (valor > 0){
            saldo =+ + valor;
            System.out.println("Deposito de " + valor + " realizado");
            System.out.println("Saldo atual " + saldo);
        }else {
            System.out.println("Valor invg
    }
}
