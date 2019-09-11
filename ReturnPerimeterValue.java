import java.util.Scanner;

public class ReturnPerimeterValue {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Number of Apples Inside This Plot: ");
        int N = in.nextInt();

        System.out.print("Perimeter of the Square Plot is: " + applesPerimeter(N));

    }

    public static int applesPerimeter(int N) {
        int p;

        // Handle Even N
        if (N % 2 == 0) {
            p = (N / 2);
            return p * 4;
            // Handle Odd N
        } else {
            p = (N / 2);
            return (p * 4) + 2;
        }
    }

}
