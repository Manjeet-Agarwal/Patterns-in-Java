public class hollow_daimond {
    public static void main(String[] args) {
        hollowDaimond(6);
    }

    public static void hollowDaimond(int rows) {

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            if (i > 0) {
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = rows - 2; i >= 0; i--) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            if (i > 0) {
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }

    }
}