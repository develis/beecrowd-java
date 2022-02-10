import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner myScanner = new Scanner(System.in);
		double raio = myScanner.nextDouble();

		System.out.printf("A=%.4f%n", (raio * raio) * 3.14159);

	}

}