import java.util.Scanner;

public class Comma_remove {
    public static void main(String args[]) {

        // ---------------------------------------------------------------
        // (3) print string without Comma " , "
        // ---------------------------------------------------------------
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your string : ");
        String str = input.nextLine();
        // Creating array of string length
        char[] c = new char[str.length()];
        // Copying character by character into array
        // using for loop
        for (int i = 0; i < str.length(); i++) {
            c[i] = str.charAt(i);
            // Count number of Comma to remove
            if (c[i] == ",".charAt(0))
                count++;
        }
        System.out.println(count);
        char[] c_new = new char[str.length() - count];
        // Print the string and ignoring Comma ","
        for (int i = 0, j = 0; i < str.length(); i++) {
            if (c[i] != ",".charAt(0)) {
                c_new[j] = c[i];
                j++;
            }
        }
        // Printing the elements of array
        System.out.print("The String without Comma : " + String.valueOf(c_new));
        // ---------------------------------------------------------------
        // ---------------------------------------------------------------
    }
}
