import java.util.Scanner;

public class A_Numbers {
   static int GCD(int m, int n)
   {
       int r = m % n;
       while (r != 0)
       {
           m = n;
           n = r;
           r = m % n;
       }
       return n;
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        int fsum = 0;
        int k = n;
        for (int i = 2; i < n; i++) {
            k = n;
            sum = 0;
            while (k != 0) {
                sum += k % i;
                k /= i;
            }
            fsum += sum;

        }
        int j = n-2;
        int l = GCD(fsum , j);
        fsum/=l;
        j/=l;

        System.out.println(fsum+"/"+j);
    }
}