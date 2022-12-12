import java.util.Scanner;

public class Area_Circumference {
    public static void main(String args[]) {
        int x;
        Scanner input = new Scanner(System.in);
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        // --------------------------------------------------------------------
        // ----------------------- Just user experience -----------------------
        // --------------------------------------------------------------------
        clear();
        System.out.println("----------------------------------------\n"
                + "Enter [1] to do operations on Circle \n"
                + "Enter [2] to do operations on Rectangle \n"
                + "Enter [3] to exit \n"
                + "----------------------------------------");
        x = input.nextInt();
        clear();
        if (x == 1) {
            System.out.println("----------------------------------------\n"
                    + "Enter [1] to calculate Area \n"
                    + "Enter [2] to calculate Circumference \n"
                    + "Enter [3] to exit \n"
                    + "----------------------------------------");
            x = input.nextInt();
            clear();
            if (x == 1) {
                c.setRadius();
                c.getArea();
            } else if (x == 2) {
                c.setRadius();
                c.getCircumference();
            } else if (x == 3) {
                System.out.println("---------------------------\n"
                        + "--------- Finished --------\n"
                        + "---------------------------\n");
            } else {
                System.out.println("---------------------------\n"
                        + "------- Wrong Choice ------\n"
                        + "---------------------------\n");
            }
        } else if (x == 2) {
            System.out.println("----------------------------------------\n"
                    + "Enter [1] to calculate Area \n"
                    + "Enter [2] to calculate Circumference \n"
                    + "Enter [3] to exit \n"
                    + "----------------------------------------");
            x = input.nextInt();
            clear();
            if (x == 1) {
                r.setWeidth_Length();
                r.getArea();
            } else if (x == 2) {
                r.setWeidth_Length();
                r.getCircumference();
            } else if (x == 3) {
                System.out.println("---------------------------\n"
                        + "--------- Finished --------\n"
                        + "---------------------------\n");
            } else {
                System.out.println("---------------------------\n"
                        + "------- Wrong Choice ------\n"
                        + "---------------------------\n");
            }
        } else if (x == 3) {
            System.out.println("---------------------------\n"
                    + "--------- Finished --------\n"
                    + "---------------------------\n");
        } else {
            System.out.println("---------------------------\n"
                    + "------- Wrong Choice ------\n"
                    + "---------------------------\n");
        }
        // --------------------------------------------------------------------
        // ----------------------- Just user experience -----------------------
        // --------------------------------------------------------------------
    }

    // Clear_Console method after each choice
    static void clear() {
        for (int i = 0; i < 100; i++) {
            System.out.println("\b");
        }
    }
}