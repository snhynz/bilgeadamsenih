package scannerchallenge;

import java.util.Scanner;

public class ConditionalExample {
    public static void main(String[] args) {
        String preStr = "Your are";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Weight =");
        double weight = scanner.nextDouble();
        System.out.println("Enter Your Height =");
        double height = scanner.nextDouble();
        double sums = weight / (height * height);
        if (sums < 18.5) {
            System.out.println( preStr + " underweight");
        } else if (sums >= 18.5 && sums < 25.0) {
            System.out.println( preStr + " normal");
        } else if (sums >= 25.0 && sums < 30.0) {
            System.out.println( preStr + " overweight");
        } else if (sums >= 30.0) {
            System.out.println( preStr + " very overweight");
        }
    }
}
