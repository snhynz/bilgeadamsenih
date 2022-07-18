package hw1;

import java.util.Scanner;

public class Homework9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double number;
        double a;
        double total=0;
        double avarage ;

        System.out.print("please write a loop number = ");
        a = scan.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.print("Please write " + (i+1) +".number = ");
            number = scan.nextInt();
            total += number;
        }
        avarage=total/a;
        System.out.println("The avarage = " + avarage);

    }
}