import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner myScanner = new Scanner(System.in);
        int numero = myScanner.nextInt();
        int horasTrabalhadas = myScanner.nextInt();
        double valorHora = myScanner.nextDouble();

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f%n", horasTrabalhadas * valorHora);

    }

}