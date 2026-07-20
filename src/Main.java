class Main{
    static void main() {
    ProdutoFisico mouse = new ProdutoFisico();
    System.out.println("Preço final é " + mouse.calcularPrecoFinal());
    // saída esperada de 120

    Livro diarioDeUmBanana = new Livro();
    System.out.println("Preço final é " + diarioDeUmBanana.calcularPrecoFinal());
    // saída esperada de 90
    }
}

