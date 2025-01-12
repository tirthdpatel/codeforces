import java.util.Scanner;

public class B_Vanya_and_Lanterns {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Long l = sc.nextLong();
        long a[] = new long[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextLong();
        }
        long temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }
            }
        }
        
        long max1 = (a[0]);
        
        long max2 = l - a[a.length - 1];
        long max = 0;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i + 1] - a[i] > max) {
                max = a[i + 1] - a[i];
            }
        }
float ans=0;
        max2 = Math.max(max1, max2);
        if((float)max2>((float)(max)/2)){
            ans=(float)(max2*2);

        }else{
            ans=(float)(max) ;
        }
        System.out.println(String.format("%.10f", ans/2));
    }
}
