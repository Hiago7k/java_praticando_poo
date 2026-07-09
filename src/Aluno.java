public class Aluno {
    private String nome;
    private double Nota;
    private int totalDeNotas = 0;
    private double media = 0;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(double Nota) {
        this.Nota = Nota;
        totalDeNotas++;
    }

    public double caclMedia(){
        media =  (Nota + Nota) / totalDeNotas;
        return  media;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return Nota;
    }

    public int getTotalDeNotas() {
        return totalDeNotas;
    }

    public double getMedia() {
        return media;
    }
}
