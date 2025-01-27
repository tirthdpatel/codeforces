import java.util.Scanner;

public class A_Heating {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long rad = sc.nextLong();
            long sec = sc.nextLong();
            long k = rad;
            long l = sec;
            long extra = (long) 0;
            while (l % k != 0) {
                l--;
                extra++;
            }

            long sec_each = l / k;
            long ans = (long) ((k - extra) * Math.pow(sec_each, 2) + extra * Math.pow(sec_each+1, 2));
            System.out.println(ans);
        }
    }
}