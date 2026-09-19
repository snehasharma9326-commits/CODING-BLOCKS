public class Task5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int original = n;
        int reverse = 0;

        while (n > 0) {
            int bit = n % 2;
            reverse = reverse * 2 + bit;
            n = n / 2;
        }

        if (original == reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}