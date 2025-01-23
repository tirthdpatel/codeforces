import java.util.Scanner;

public class A_Preparing_for_the_Olympiad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m[] = new int[n];
            int s[] = new int[n];
            for (int i = 0; i < n; i++) {
                m[i] = sc.nextInt();
                // s[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                //m[i] = sc.nextInt();
                 s[i] = sc.nextInt();
            }
            int ans = 0;
            
            for (int i = 0; i < s.length; i++) {
                if (i == n - 1) {
                    ans += m[i];
                    break;
                }
                if (m[i] > s[i+1]) {
                    ans += m[i] - s[i+1];
                }

            }

            // System.out.println(m[n-1]);

            System.out.println(ans);

        }
    }
}