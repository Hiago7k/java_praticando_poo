public class ConversorTemparatura implements ConvertorTemps {
    @Override
    public void celsiusParaFahrenheit(double tempC) {
    double fahrenheit = (tempC * 2) + 30;
    System.out.println("Temperatura de Graus Celsius para Fahrenheit é " + fahrenheit);
    }

    @Override
    public void fahrenheitParaCelsius(double tempF) {
        double celsius =  (tempF - 32) / 2;
        System.out.println("Temperatura de Fahrenheit para Graus Celsius é " + celsius);
    }
}
