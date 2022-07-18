package hw1;

import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input;
        boolean asal = true;


do {
    System.out.println("Enter the pozitive number: ");
    input = scan.nextInt();
}
while (input<2); {
            for (int i = 2; i < input; i++) {
                if (input % i == 0) {
                    asal = false;
                    break;
                }}
                if (asal) {
                    System.out.print(input + " Asal sayıdır.");

                } else {
                    System.out.print(input + " Asal sayı değildir.");
                }
            }


        }
    }

