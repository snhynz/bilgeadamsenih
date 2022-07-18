package hw1;

import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        int n = 5;
        int k = 4;

        for (int i = 1; i <= n; i++) {
            for (int t = k; t > 0; t--) {
                System.out.print(" ");}

                int a = 1;
                for (int j = 1; j <= i; j++) {
                    System.out.print(a + "");
                    a++;
                }
            for (int j = 2; j <= i; j++) {
                System.out.print(a + "");
                a++;}
            for (int t = k; t > 0; t--) {
                System.out.print(" ");}
            k--;
                System.out.println();
            }
        }

}
