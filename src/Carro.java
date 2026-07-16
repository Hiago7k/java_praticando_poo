public class Carro {

    private String modelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public void definirModelo(String modelo){
        this.modelo = modelo;
    }

    public void DefinirPreco(double precoAno1, double precoAno2, double precoAno3){
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    public void ExibirInfo(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço ano 1: " + precoAno1);
        System.out.println("Preço ano 2: " + precoAno2);
        System.out.println("Preço ano 3: " + precoAno3);
        System.out.println("Menor preço: " + calcularMenorPreco);
        System.out.println("Maior preço: " + calcularMaiorPreco);
    }
    private double calcularMenorPreco(){
        double menorPreco = precoAno1;
        if(precoAno2 > menorPreco){
            menorPreco = precoAno2;
        }

        if(precoAno3 < menorPreco){
            menorPreco = precoAno3;
        }
        return menorPreco;
    }
}