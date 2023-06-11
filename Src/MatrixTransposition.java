import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MatrixTransposition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введіть кількість рядків матриці:");
        int m = scn.nextInt();
        System.out.println("Введіть кількість стовбців матриці:");
        int n = scn.nextInt();
        Random random = new Random();
        int[][] matrix = new int[m][n];
        int[][] matrixT = new int[n][m];
        System.out.println("Матриця M x N");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(100);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("Транспонована матриця N x M");
        for (int i = 0; i < matrixT.length; i++) {
            for (int j = 0; j < matrixT[i].length; j++) {
                matrixT[i][j] = matrix[j][i];
                System.out.print(matrixT[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
