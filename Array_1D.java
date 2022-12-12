import java.util.Scanner;
import java.util.Arrays;

class Array_1D {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // User input the array size
        System.out.print("Please enter the size of the array : ");
        int size = in.nextInt();
        int arr[] = new int[size];
        int sum = 0, found = 0;

        // User input the array elements
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value of the index " + (i) + " : ");
            arr[i] = in.nextInt();
            sum += arr[i];
        }
        System.out.println("The sum of the array values is : " + sum);

        // ---------------------------------------------------------------
        // ------------------------- Extra -------------------------------
        // ---------------------------------------------------------------
        System.out.print("What value do you want to check : ");
        int check = in.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == check) {
                found = arr[i];
            }
        }
        if (check == found)
            System.out.println("The value " + check + " is found");
        else
            System.out.println("The value " + check + " is not found");
        System.out.print("The array values are : [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println("\b]");
        Arrays.sort(arr);
        System.out.print("The sorted array values are : [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println("\b]");
        // ---------------------------------------------------------------
        // ------------------------- Extra -------------------------------
        // ---------------------------------------------------------------

        // Minimum And Maximum of array
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("The min value is : " + min);
        System.out.println("The max value is : " + max);
    }
}