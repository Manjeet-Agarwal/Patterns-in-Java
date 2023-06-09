import java.util.*;
public class hourglass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.close();
    }

    public static void Hourglass(int size) {

        int rows = size;

        for (int i = 0; i < rows / 2 + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < rows - (2 * i); j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = rows / 2 - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < rows - (2 * i); j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
