import java.util.*;

public class spiral_nos_pattern {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print(" Enter the number of rows: ");
    int rows = sc.nextInt();
    System.out.println();
    System.out.print(" Enter the number of columns: ");
    int columns = sc.nextInt();
    sc.close();
        
    spiral(rows,columns);
    }

    public static void spiral(int rows, int cols) {

        int[][] spiral = new int[rows][cols];

        int value = 1;
        int minRow = 0;
        int maxRow = rows - 1;
        int minCol = 0;
        int maxCol = cols - 1;

        while (value <= rows * cols) {
            for (int i = minCol; i <= maxCol; i++) {
                spiral[minRow][i] = value++;
            }
            minRow++;

            for (int i = minRow; i <= maxRow; i++) {
                spiral[i][maxCol] = value++;
            }
            maxCol--;

            for (int i = maxCol; i >= minCol; i--) {
                spiral[maxRow][i] = value++;
            }
            maxRow--;

            for (int i = maxRow; i >= minRow; i--) {
                spiral[i][minCol] = value++;
            }
            minCol++;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (spiral[i][j] != 0) {
                    System.out.printf("%3d ", spiral[i][j]);
                } else {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
    }
}
