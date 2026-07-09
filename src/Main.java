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
//        System.out.println("Nome: " + pessoa1.getNome());
//        System.out.println("idade: " + pessoa1.getIdade());

        Produto perifericos = new Produto();
        perifericos.setNome("Teclado");
        perifericos.setPreco(199);
//        System.out.println("Anuncio periferico: " + perifericos.getNome() + " valor " + perifericos.getPreco());
        perifericos.aplicaDesconto(10); // 10%
//        System.out.println("Valor do produto após o desconto " + perifericos.getNome() + " valor " + perifericos.getPreco());

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Rafael");
        aluno1.setNota(8);
        aluno1.setNota(4);
        aluno1.caclMedia();
        System.out.println("Informações Final Escola");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Notas: " + aluno1.getNota());
        System.out.println("Media final: " + aluno1.getMedia());
    }
}

