public class arrow_head_pattern {
    public static void main(String[] args) {
        //n should be odd to obtain symmetry
        arrowHead(5);
    }

    public static void arrowHead(int n) {
        int rows = n;
        for (int i = 1; i <= rows / 2 + 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = rows / 2; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
