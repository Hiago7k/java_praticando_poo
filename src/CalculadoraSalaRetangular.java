public class CalculadoraSalaRetangular implements CalculoGeometrico {


    @Override
    public double calcularArea(double base, double altura) {
        double area = 0;
        area = area + base * altura;
        return  area;
    }
}
