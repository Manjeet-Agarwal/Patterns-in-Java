import java.util.*;

public class rhombus_pattern {

    // 1). Hollow Rectangle: It is a rectangle that have the values (*) on Its
    // boundary locations only. and the middle cells are empty.

    // To perform the hollow rectangle we can iterate through the column value in
    // every row and check if the row and column values are boundary values! If yes,
    // then fill the *, otherwise leave with a blank-space!

    public static void hollow_rectangle(int TotRows, int TotCols) {
        // outer loop
        for (int i = 1; i <= TotRows; i++) {
            // inner loop
            for (int j = 1; j <= TotCols; j++) {
                // cell -(i,j)
                if (i == 1 || i == TotRows || j == 1 || j == TotCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

    }

    // Solid Rhombus

    public static void solid_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
            // print stars
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Hollow Rhombus

    public static void hollow_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size/dimension of rhombus: ");
        int n = sc.nextInt();
        System.out.println();
        sc.close();
        // hollow_rectangle(8,7);
        solid_rhombus(n);
        hollow_rhombus(n);

    }

}
