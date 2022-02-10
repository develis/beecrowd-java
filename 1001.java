import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner myScanner = new Scanner(System.in);

        int A = myScanner.nextInt();
        int B = myScanner.nextInt();
        int X = A + B;

        System.out.println("X = " + X);
    }

}