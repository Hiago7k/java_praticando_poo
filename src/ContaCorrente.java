public class ContaCorrente extends BankAccount {


    public void cobrarTarifaMensal(){
        System.out.println("Cobrando taria mensal de R$ 50.00");
        saldo = saldo - 50;
        System.out.println("Seu depois da tarifa mensal é de " + saldo);
    }


}
