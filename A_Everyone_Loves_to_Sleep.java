import java.util.Scanner;

public class A_Everyone_Loves_to_Sleep {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int h = sc.nextInt();
            int m = sc.nextInt();
            int a[] = new int[n];
            int temp, time = 60 * h + m;
            int time2=0;
            int ans=0;
            int min = Integer.MAX_VALUE;
            int j=-1;
            for (int i = 0; i < a.length; i++) {
                temp = sc.nextInt();
                a[i] = sc.nextInt();
                a[i] += 60 * temp;
                if (a[i] >= time && a[i] - time < min) {
                    min = a[i] - time;
                    j=0;
                }
            }
            if(j==-1){
                ans+=1440-time;
                for (int i = 0; i < a.length; i++) {
                    
                    if (a[i] >= time2 && a[i] - time2 < min) {
                        min = a[i] - time2;
                        
                    }
                }
            }
            min+=ans;
            int k = min / 60;
            int l = min - k * 60;
            System.out.println(k + " " + l);
        }
    }
}