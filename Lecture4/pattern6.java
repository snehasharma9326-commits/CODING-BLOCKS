public class Ques6 {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            // Extra spaces to shift each row
            for (int j = 1; j < i; j++) {
                System.out.print("        ");
            }

            // Stars
            for (int j = i; j <= n; j++) {
                System.out.print("*   ");
            }

            System.out.println();
        }
    }
}