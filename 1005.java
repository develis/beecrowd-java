import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

	Scanner myScanner = new Scanner(System.in);
    double A = myScanner.nextDouble();
    double B = myScanner.nextDouble();

    System.out.printf("MEDIA = %.5f%n", ((A * 3.5) + (B * 7.5))/11);

	}

}