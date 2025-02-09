import java.util.Scanner;

public class B_Parade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l[] = new int[n];
        int r[] = new int[n];
        int lmax = 0;
        int rmax=0;
        int dif=0;
        int index = -1, k = -1;
        int b=0;
        for (int i = 0; i < r.length; i++) {
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        // b+=Math.abs(l[i]-r[i]);
        lmax+=l[i];
        rmax+=r[i];

        }
        int z =b;
        k=Math.abs(lmax-rmax);
        int diff=0;
       // System.out.println(k);
        for (int i = 0; i < r.length; i++) {
            if(Math.abs((lmax-l[i]+r[i])-(rmax-r[i]+l[i]))-k>diff){
                index =i;
              diff=-k+Math.abs((lmax-l[i]+r[i])-(rmax-r[i]+l[i]));
            }
        }
        
        if (index == -1) {
            System.out.println("0");
        } else {
            System.out.println(index + 1);
        }

    }
}