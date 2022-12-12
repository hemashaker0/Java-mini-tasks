import java.util.Scanner;

public class Sort_Array {
    public static void main(String args[]) {

        // ---------------------------------------------------------------
        // (4) Sorting array
        // ---------------------------------------------------------------
        // input user array elements
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the size of the array : ");
        int size = input.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the value of the index " + (i) + " : ");
            array[i] = input.nextInt();
        }
        int temp; // to swap elements
        // compare all sequenced elements
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        // printing the sorted array
        System.out.print("The sorted array values are : [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println("\b]");
        // ---------------------------------------------------------------
        // ---------------------------------------------------------------
    }
}
