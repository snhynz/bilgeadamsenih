package hw1;

import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result=1;
        System.out.println("Write a number :");
        int number = scan.nextInt();
        System.out.println("Write a power number:");
        int powerNumber = scan.nextInt();
        for (int i = 1; i <= powerNumber ; i++) {
            result *= number;
            result = result;
        }
        System.out.println("Result : " + result);





    }



}
