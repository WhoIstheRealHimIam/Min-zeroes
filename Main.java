import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        
        System.out.println("\nEnter elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        
        int minColIndex = getColumnWithMinZeros(matrix);

        
        System.out.println("\nolumn " + minColIndex + " has the minimum number of zer");

        scanner.close();
    }

    
    public static int getColumnWithMinZeros(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return -1; 
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int minZeros = Integer.MAX_VALUE;
        int minColIndex = 0;

        
        for (int col = 0; col < cols; col++) {
            int zeroCount = 0;

            
            for (int row = 0; row < rows; row++) {
                if (matrix[row][col] == 0) {
                    zeroCount++;
                }
            }

            
            if (zeroCount < minZeros) {
                minZeros = zeroCount;
                minColIndex = col;
            }
        }

        return minColIndex;
    }
}