public class ConversorMoeda implements ConversaoFinanceira{

    @Override
    public double converterDollarParaReal(double valor) {
        return valor * 5.11;
    }
}
