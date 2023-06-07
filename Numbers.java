import java.util.*;

public class Numbers {

    // Half Pyramid Pattern

    public static void half_pyramid(int n) {
        for (int line = 1; line <= n; line++) {
            for (int num = 1; num <= line; num++) {
                System.out.print(num);
            }
            System.out.println();
        }
    }

    // Full Pyramid Pattern

    public static void number_pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

    // Inverted Rotated Half Pyramid with numbers

    public static void inverted_rotated_half_pyramid_withNumbers(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    // Floyd's Triangle

    public static void floyds_triangle(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    // 0-1 Triangle

    public static void zero_one_triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }

    // palindrome numbers pyramid

    public static void palindrome_numbers_pyramid(int n) {

        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // descending numbers or left side numbers from middle side - here middle line
            // is included
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // ascending numbers or right side numbers from middle side
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // main function starts

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the number: ");
        int n = sc.nextInt();
        System.out.println();
        // half_pyramid(n);
        // number_pyramid(n);
        // inverted_rotated_half_pyramid_withNumbers(n);
        // floyds_triangle(n);
        // zero_one_triangle(n);
        // palindrome_numbers_pyramid(n);

    }
}
// Class ends 