package scannerchallenge;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Password=");
        int x = scanner.nextInt();
        System.out.println("Age=");
        int y = scanner.nextInt();
        System.out.println("Your Best Number =");
        int z = scanner.nextInt();
        System.out.println("Sum =" + (x+y+z));

    }
}
