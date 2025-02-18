import java.util.Scanner;
public class A_Phoenix_and_Balance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a = (int)Math.pow(2,n);
            for (int i = 1; i <= n/2-1; i++) {
                a+=(int)Math.pow(2,i);
            }
            int b = 0;
            for (int i = n/2; i < n; i++) {
                b+=(int)Math.pow(2,i);
            }
     
            System.out.println(Math.abs(a-b));
        }
    }
}