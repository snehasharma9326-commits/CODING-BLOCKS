public class Task4{
     {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        boolean[] doors = new boolean[N + 1];

        // false = closed
        // true  = open

        for (int monkey = 1; monkey <= N; monkey++) {

            for (int door = monkey; door <= N; door += monkey) {
                doors[door] = !doors[door];
            }
        }

        int count = 0;

        for (int i = 1; i <= N; i++) {
            if (doors[i]) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}
}