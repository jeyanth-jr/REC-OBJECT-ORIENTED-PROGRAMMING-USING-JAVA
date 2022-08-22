import java.util.Scanner;
public class TransposeMatrix {
    public static void main(String args[]) {
        int[][] mat1 = new int[3][3];
        int[][] mat2 = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix row-wise:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original matrix:\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mat2[j][i] = mat1[i][j];
            }
        }
        System.out.println("transposed matrix:\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mat2[i][j] + " ");
            }
            System.out.println("");
        }
    }
}