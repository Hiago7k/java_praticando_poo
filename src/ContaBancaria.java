public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    public String titular;


    public void depositar(int valor){
        saldo = saldo + valor;
    }

    public void exibeSaldo(){
        System.out.println(saldo);
    }
}
