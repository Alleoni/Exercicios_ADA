public class Main {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        calculadora.setValor1(10);
        calculadora.setValor2(5);

        System.out.println("A soma é: " + calculadora.somar());
        System.out.println("A subtração é: " + calculadora.subtrair());
        System.out.println("A multiplicação é: " + calculadora.multiplicar());
        System.out.println("A divisão é: " + calculadora.dividir());
        
    }
}