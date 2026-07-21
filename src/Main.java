import java.util.ArrayList;

class Main{
    static void main() {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();
        pessoa1.PessoasInfo("Hiago",21);
        pessoa2.PessoasInfo("Ricardo",22);
        pessoa3.PessoasInfo("Jose",10);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);
        System.out.println(listaDePessoas);
    }
}

