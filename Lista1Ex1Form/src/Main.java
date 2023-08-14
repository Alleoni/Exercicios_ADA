public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();

        pessoa1.setNome("Guilherme");
        pessoa1.setAltura(1.86);
        pessoa1.setIdade(30);
        pessoa1.setPeso(84.5);

        System.out.println(pessoa1.toString());

    }
}