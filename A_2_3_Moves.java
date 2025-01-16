import java.util.Scanner;

public class A_2_3_Moves {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if(n==1){
                System.out.println("2");
                continue;
            }
            int ans1 = 0;
            int ans2 = 0;
            int n2 = n;
            int m3 = 0;
            int m2 = 0;
            int left = 0;
            if (n >= 3) {
                m3 = n / 3;
                n -= m3 * 3;
            } 
            // if (n == 2) {
            //     m2 = n / 2;
            //     n -= m2 * 2;
            // }
           

            if (n == 1) {
                ans1 = m3  + 1;
            } else {
                if(n==2){
                    ans1 = m3 +  1;
                }else{
                ans1 = m3 ;
                }
            }
            m3 = 0;
            m2 = 0;
            if (n2 >= 2) {
                m2 = n2 / 2;
                n2 -= m2 * 2;
                if (n2 == 1) {
                    ans2 = m2 + 1;
                } else {
                    ans2 = m2;
                }
                System.out.println(Math.min(ans2, ans1));
            }else{
                System.out.println(ans1);
            }
           
        }
    }
}