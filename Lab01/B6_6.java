import java.util.Scanner;

public class B6_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so hang: ");
        int rows = sc.nextInt();
        System.out.print("Nhap so cot: ");
        int cols = sc.nextInt();
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];

        System.out.println("Nhap ma tran thu nhat:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Nhap ma tran thu hai:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix 1:");
        printMatrix(matrix1, rows, cols);
        System.out.println("Matrix 2:");
        printMatrix(matrix2, rows, cols);
    }

    private static void printMatrix(int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
