public class Pessoa {
    private String nome;
    private int idade;


    public void PessoasInfo(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Dados da pessoa: " + nome + " " + idade;
    }
}
