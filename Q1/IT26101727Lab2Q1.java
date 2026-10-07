import java.util.Scanner;

public class IT26101727Lab2Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input perimeter
        System.out.print("Enter the perimeter: ");
        double perimeter = sc.nextDouble();

        // Width is 3/4 of length
        double length = perimeter / 3.5;
        double width = (3.0 / 4.0) * length;

        // Display results
        System.out.println("Length = " + length);
        System.out.println("Width = " + width);

        sc.close();
    }
}