import java.util.Scanner;

public class A_Minimum_Integer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int d = sc.nextInt();
            int ans = -1;
            if (d < l) {
                ans = d;
            } else {
                if(d>r){
                    ans=d;
                }
                if( d>=l &&d<=r){
                    int temp = r/d;
                  ans=(temp+1)*d;
                }

            }
            System.out.println(ans);
        }
    }
}