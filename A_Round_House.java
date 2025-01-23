import java.util.Scanner;

public class A_Round_House {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;
        if (b < 0) {
            if (a > Math.abs(b)) {
                ans = a + b;
            } else {
                
                b = Math.abs(b) - a;
                ans = b % n;
                ans = n - ans;
            }
        } else {
            if (b > 0) {
                if (n - a >= Math.abs(b)) {
                    ans = a + b;
                } else {
                    ans = b - (n - a);
                    
                    if (b > n) {
                       
                        if (ans % n == 0) {
                            ans = n;
                        } else {

                            ans = (ans) % n;
                        }

                    }
                }
            } else {
                ans = a;
            }
        }
        System.out.println(ans);
    }
}