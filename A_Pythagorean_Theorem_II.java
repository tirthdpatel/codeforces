import java.util.Scanner;

public class A_Pythagorean_Theorem_II {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = 0;
        int ans = 0;
        for (int i = 1; i < n; i++) {
            for (int j = i; i * i + j * j <= n * n; j++) {
                temp = i * i + j * j;
                if ((int)Math.sqrt(temp) * (int) Math.sqrt(temp) == temp) {
                    ans++;
                }
            }
        }

        System.out.println(ans);
        sc.close();
    }
}