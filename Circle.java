import java.util.Scanner;

public class Circle {
    Scanner input = new Scanner(System.in);
    private double radius;

    public void setRadius() {
        System.out.print("Enter The value of radius : ");
        radius = input.nextDouble();
    }

    public void getArea() {
        System.out.println("-------------------------------------------\n"
                + "The area of the Circle = " + Math.PI * radius * radius + "\n"
                + "-------------------------------------------");
        System.out.println("The used law is (PI * radius * radius)\n"
                + "-------------------------------------------");
    }

    public void getCircumference() {
        System.out.println("-------------------------------------------\n"
                + "The Circumference of the Circle = " + Math.PI * 2 * radius + "\n"
                + "-------------------------------------------");
        System.out.println("The used law is (PI * 2 * radius)\n"
                + "-------------------------------------------");
    }
}