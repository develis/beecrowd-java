import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

	Scanner myScanner = new Scanner(System.in);
    String nomeVendedor = myScanner.nextLine();
    double salarioFixo = myScanner.nextDouble();
    double montanteVendas = myScanner.nextDouble();

    System.out.printf("TOTAL = R$ %.2f%n", (montanteVendas * 0.15) + salarioFixo);

	}

}