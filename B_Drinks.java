import java.util.Scanner;
public class B_Drinks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double a[] = new double[n];
        double per =0;
        
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextDouble();
            per+=a[i];

        }
       per/=n;
        //ans.setPrecision(12);
        //ystem.out.println(String.format("%.12f", per));
        System.out.format("%.12f", per);
    }
}