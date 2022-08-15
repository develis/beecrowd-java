import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner myScanner = new Scanner(System.in);
        int A = myScanner.nextInt();
        int B = myScanner.nextInt();
        int C = myScanner.nextInt();
        int D = myScanner.nextInt();

        System.out.printf("DIFERENCA = %d%n", ((A * B) - (C * D)));

    }

}