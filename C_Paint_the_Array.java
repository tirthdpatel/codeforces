
//import java.math.BigInteger;
import java.util.Scanner;

public class C_Paint_the_Array {
    static Long GCD(Long Num1, Long Num2) {
        long Temp = 0;
        while (Num2 != 0) {
            Temp = Num2;
            Num2 = Num1 % Num2;
            Num1 = Temp;
        }
        return Num1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int len=0;
            long a[] = new long[n];
if(a.length%2==0){
    len=a.length/2;
}else{
    len=a.length/2+1;
}
            if (n == 1) {
                System.out.println("0");
                continue;
}
            int j = 0;

            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextLong();

            }
            long even = a[0];
            long odd = a[1];
            for (int i = 0; i < a.length; i++) {
                if (i != 0) {
                    if (a[i] == a[i - 1]) {
                        System.out.println("0");
                        j = 1;
                        break;

                    }
                }
                if (i % 2 == 0) {
                    even = GCD(even, a[i]);
                } else {
                    odd = GCD(odd, a[i]);
                }
            }
            if (j == 1) {
                continue;
            }
            // long ans ;
            // int l = 0;
            // if(even>odd){
            // l=2;
            // ans=even;
            // }else{
            // l=1;
            // ans=odd;
            // }
            int k = 0;

            // }
            //System.out.println(even+" "+odd);
            if (even > odd)  {
                for (int i = 0; i < a.length/2; i++) {
                    if (a[2 * i + 1] % even == 0) {
                        System.out.println("0");
                        k = 1;
                        break;
                    }
                   
                }
            } if (odd > even ) {

                for (int i = 0; i < len; i++) {
                   
                    if (a[2 * i] % odd == 0) {
                        System.out.println("0");
                        k = 1;
                        break;
                    }

                }
            }

            if (k == 1) {
                continue;
            }
            if (odd > even) {
                System.out.println(odd);
            } else {
                if (even > odd) {
                    System.out.println(even);
                } else {
                    System.out.println("0");
                }

            }

        }
    }

}