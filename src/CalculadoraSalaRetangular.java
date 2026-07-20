public class CalculadoraSalaRetangular implements CalculoGeometrico {

    @Override
    public double calcularArea(double base, double altura) {
        double area = 0;
        area = area + base * altura;
        return  area;
    }

    @Override
    public double calcularPerimetro(double base, double altura) {
        double perimetro = 0;
        perimetro = perimetro + (base + altura) * 2;
        return  perimetro;
    }
}
