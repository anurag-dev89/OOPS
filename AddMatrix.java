
import java.util.Scanner;

public class AddMatrix {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Ask the user for the size of the matrices
        System.out.print("Enter the size of the matrices (n): ");
        int n = sc.nextInt(); // Read the size of the matrices

        // Initialize the matrices
        int[][] mat1 = new int[n][n];
        int[][] mat2 = new int[n][n];
        int[][] res = new int[n][n];

        // Input for the first matrix
        System.out.println("Enter the elements of matrix1:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat1[i][j] = sc.nextInt(); // Read each element
            }
        }

        // Input for the second matrix
        System.out.println("Enter the elements of matrix2:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat2[i][j] = sc.nextInt(); // Read each element
            }
        }

        // Adding the two matrices
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = mat1[i][j] + mat2[i][j]; // Sum the elements
            }
        }

        // Output the result
        System.out.println("Sum of matrices:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j] + "\t"); // Print each element
            }
            System.out.println(); // New line after each row
        }
        sc.close();

    }
}