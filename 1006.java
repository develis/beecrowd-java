import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner myScanner = new Scanner(System.in);
        double A = myScanner.nextDouble();
        double B = myScanner.nextDouble();
        double C = myScanner.nextDouble();

        System.out.printf("MEDIA = %.1f%n", ((A * 2) + (B * 3) + (C * 5)) / 10);

    }

}