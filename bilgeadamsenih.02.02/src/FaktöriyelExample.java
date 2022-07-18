import java.util.Scanner;

public class FaktöriyelExample {
    public static void main(String[] args) {
        int a =1;
        /*for (int i = 1; i < 10 ; i++) {
            a *= i;
        }
        System.out.println("9! = " + a);

        int i= 1;
        while (i<=5)
        {
            a *= i;
            i++;
        }
        System.out.println("5! = " + a);*/
        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter the number: ");
       int numara = scaner.nextInt();
        for (int i = 1; i <= numara ; i++) {
            a *= i;
        }
        System.out.println( numara + "! = " + a);

    }

}
