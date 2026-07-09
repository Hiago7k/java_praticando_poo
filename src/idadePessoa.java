public class idadePessoa {
    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        if (idade >= 18) {
            System.out.println("ë maior de idade");
        } else {
            System.out.println("ë menor de idade");
        }
        return idade;
    }
}
