import java.util.Scanner;

public class ASCII {
    public static void main(String args[]) {
        // ---------------------------------------------------------------
        // (1)print the ASCII value of a character
        // ---------------------------------------------------------------
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the charchter : ");
        char ch = input.next().charAt(0);
        int ascii = (int) ch;
        System.out.println("THE ASCII IS : " + ascii);
        System.out.println("==================");
        // print the character of a ASCII value
        System.out.print("ENTER THE ASCII CODE : ");
        char convert = (char) input.nextInt();
        System.out.println("THE CHARACTER IS : " + convert);
        // ---------------------------------------------------------------
    }
}
