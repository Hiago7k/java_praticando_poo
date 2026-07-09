class Main{
    static void main() {
        ContaBancaria contaBradesco = new ContaBancaria();
        contaBradesco.setTitular("Hiago Mendes");
        contaBradesco.setNumeroConta(23412);
        contaBradesco.setSaldo(1500);

//        System.out.println("Informações da conta");
//        System.out.println(contaBradesco.getSaldo());
//        System.out.println(contaBradesco.getNumeroConta());
//        System.out.println(contaBradesco.getTitular());

        idadePessoa pessoa1 = new idadePessoa();
        pessoa1.setNome("Hiago Mendes");
        pessoa1.setIdade(13);
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("idade: " + pessoa1.getIdade());


    }
}

