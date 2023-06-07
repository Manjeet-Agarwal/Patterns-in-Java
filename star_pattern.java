import java.util.*;

public class star_pattern {

    // half star pyramid

    public static void half_star(int n) {

        for (int line = 1; line <= n; line++) {
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Inverted Star Pattern

    public static void inverted_star(int n) {
        for (int line = 1; line <= n; line++) {
            for (int star = 1; star <= n - line + 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Inverted and rotated half star pyramid

    public static void inv_rotd_half_star(int n) {
        for (int lines = 1; lines <= n; lines++) {
            for (int spaces = lines; spaces < n; spaces++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= lines; star++) {
                System.out.print("*");

            }
            System.out.println();
        }
        System.out.println();
    }

    // Star Pyramid
    public static void star_pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println();
        // half_star(n);
        // inverted_star(n);
        // inv_rotd_half_star(n);
        // star_pyramid(n);
    }
}
