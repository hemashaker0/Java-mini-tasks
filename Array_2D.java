import java.util.Scanner;
import java.util.Arrays;

public class Array_2D {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // User input the array size
        System.out.println("Enter the number of rows & columns : ");
        int row = in.nextInt();
        int col = in.nextInt();
        int arr[][] = new int[row][col];
        int transpose[][] = new int[col][row];
        int sum = 0, found = 0, count = 0;

        // User input the array elements
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter value of index [" + i + "]" + "[" + j + "] :");
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println("The original array is :");
        for (int r[] : arr) {
            System.out.println(Arrays.toString(r));
        }

        // transposition
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                transpose[i][j] = arr[j][i];
            }
        }
        System.out.println("The transposed array is :");
        for (int r[] : transpose) {
            System.out.println(Arrays.toString(r));
        }
        // ---------------------------------------------------------------
        // ------------------------- Extra -------------------------------
        // ---------------------------------------------------------------
        System.out.print("Enter the value of the number to check : ");
        int check = in.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (check == arr[i][j]) {
                    found = arr[i][j];
                    count++;
                }
            }
        }
        if (found == check)
            System.out.println("The value " + found + " is found " + count + " times");
        else
            System.out.println("The value " + check + " is not found");
        int min = arr[0][0];
        int max = arr[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum += arr[i][j];
                if (arr[i][j] < min)
                    min = arr[i][j];
                if (arr[i][j] > max)
                    max = arr[i][j];
            }
        }
        System.out.println("Min number is : " + min);
        System.out.println("Max number is : " + max);
        System.out.println("Sum of values is : " + sum);
        // ---------------------------------------------------------------
        // ------------------------- Extra -------------------------------
        // ---------------------------------------------------------------
    }

}
