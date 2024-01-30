import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of x: ");
        int x = scanner.nextInt();

        System.out.println("Enter the value of y: ");
        int y = scanner.nextInt();

        try {
            int result = calculateDivision(x, y);
            System.out.println("The result of x/(x-y) is: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int calculateDivision(int x, int y) {
        if ((x-y) == 0) {
            throw new IllegalArgumentException("x - y must not be zero.");
        }
        return x / (x - y);
    }
}