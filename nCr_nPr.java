import java.util.Scanner;

public class nCr_nPr {
    public static void main(String args[]) {
        // ---------------------------------------------------------------
        // (2)nCr and nPr
        // ---------------------------------------------------------------
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter The Value of n and r: ");
        int N = input.nextInt();
        int r = input.nextInt();
        float nCr = (fact(N)) / (fact(N - r) * fact(r));
        float nPr = (fact(N)) / (fact(N - r));
        System.out.println("The value nCr : " + nCr);
        System.out.println("The value nPr : " + nPr);
        // ---------------------------------------------------------------
        // ---------------------------------------------------------------
    }

    static float fact(int n) {
        if (n == 0)
            return 1;
        else
            return (n * fact(n - 1));
    }
}
