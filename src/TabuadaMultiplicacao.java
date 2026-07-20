public class TabuadaMultiplicacao implements Tabuada {
    @Override
    public void mostrarTabuada(int num) {
        System.out.println("mostrando a tabuada do numero " + num);
        for(int i = 0; i <=10; i++){
            System.out.println(num +" * " +  i + " é = " + i*num);
        }
    }
}
