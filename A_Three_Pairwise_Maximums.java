//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class A_Three_Pairwise_Maximums {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a[]=new int[3];
                while(t-->0){
            for (int i = 0; i < a.length; i++) {
                a[i]=sc.nextInt();
            }
           Arrays.sort(a);
            if(a[2]!=a[1]){

                System.out.println("NO");
            }else{
                System.out.println("YES");
                System.out.println(a[0]+" "+a[0]+" "+a[2]);
            }
        }
    }
}
// x a,b 3 
// z b,c
// y c,a