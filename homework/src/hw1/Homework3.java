package hw1;

public class Homework3 {
    public static void main(String[] args) {
        int k =4;
        int a =1;
        for (int i = 0; i < 5; i++) {

            for (int j = k; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }

            k--;
            a++;
            System.out.println();

        }
    }

}
