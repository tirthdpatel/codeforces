
import java.util.Scanner;

public class A_Increasing_Sequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int a[] = new int[n];
        int ans = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            if (i > 0) {
                if (a[i - 1] >= a[i]) {
                    ans += (a[i - 1] - a[i]) / d + 1;
                    a[i] += ((a[i - 1] - a[i]) / d + 1) * d;
                }
            }
        }
        System.out.println(ans);

    }
}