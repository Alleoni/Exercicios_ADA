import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        parOuImpar(numero);

    }

    public static void parOuImpar(int numero){
        if(numero % 2 == 0){
            System.out.println("Numero é PAR");
        } else if (numero % 2 == 1){
            System.out.println("Número é IMPAR");
        }
    }

}