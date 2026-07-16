class Main{
    static void main() {

    BankAccount contaHiago = new BankAccount();
    System.out.println(contaHiago.consultarSaldo());
    contaHiago.Sacar(100);
    contaHiago.Depositar(1000);

    System.out.println("Saldo apos todas as operacoes "+ contaHiago.consultarSaldo());


    }
}

