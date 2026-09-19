import java.util.Scanner;

public class pattern15{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Upper part
        for (int i = 0; i < n; i++) {

            // Spaces
            for (int j = 0; j < 2 * i; j++) {
                System.out.print("    ");
            }

            // Stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*   ");
            }

            System.out.println();
        }

        // Lower part
        for (int i = n - 2; i >= 0; i--) {

            // Spaces
            for (int j = 0; j < 2 * i; j++) {
                System.out.print("    ");
            }

            // Stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*   ");
            }

            System.out.println();
        }
    }
}