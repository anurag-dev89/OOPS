import java.util.Scanner;

public class Prog1{

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Ask the user for the size of the matrices
        System.out.print("Enter the size of the matrices (n): ");
        int n = sc.nextInt(); // Read the size of the matrices

        int[][] mat1 = new int[n][n];
        int[][] mat2 = new int[n][n];
        int[][] res = new int[n][n];

        // Input for matrix1
        System.out.println("Enter the elements of matrix1:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }

        // Input for matrix2
        System.out.println("Enter the elements of matrix2:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat2[i][j] = sc.nextInt();
            }         
        }

        // Matrix addition
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        // Display result
        System.out.println("Sum of matrices:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close(); // Close the scanner
    }
}
