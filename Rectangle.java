import java.util.Scanner;

public class Rectangle {
    Scanner input = new Scanner(System.in);
    private double lenght;
    private double weidth;

    public void setWeidth_Length() {
        System.out.print("Enter the Length value : ");
        lenght = input.nextDouble();
        System.out.print("Enter the Weidth value : ");
        weidth = input.nextDouble();
    }

    public void getArea() {
        System.out.println("-------------------------------------------\n"
                + "The Area of Rectangle = " + lenght * weidth + "\n"
                + "-------------------------------------------");
        System.out.println("The used law is (lenght * weidth)\n"
                + "-------------------------------------------");
    }

    public void getCircumference() {
        System.out.println("-------------------------------------------\n"
                + "The Circumference of Rectangle = " + (lenght + weidth) * 2 + "\n"
                + "-------------------------------------------");
        System.out.println("The used law is ((lenght + weidth) * 2)\n"
                + "-------------------------------------------");
    }
}