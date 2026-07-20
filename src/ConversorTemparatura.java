public class ConversorTemparatura implements ConvertorTemps {
    @Override
    public void celsiusParaFahrenheit(double tempC) {
    double fahrenheit = (tempC * 2) + 30;
    }

    @Override
    public void fahrenheitParaCelsius(double tempF) {
        double celsius =  (tempF - 32) / 2;
    }
}
