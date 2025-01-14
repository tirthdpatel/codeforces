import java.util.Scanner;
public class A_Classroom_Watch {
public class Sum{
    int sum(int n ){
        int s=0;
        while(n>0){
            s+=n%10;
            n/=10;
        }
        return s;
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[81];
        int u=0;
     
        for (int i = 0; i <=81 && n-i>0; i++) {
            int sum = 0;
            int k=n-i;
            while(k>0){
                sum+=k%10;
                k/=10;
            }
            if(n-i + sum  ==n){
                a[u++]=n-i;
                
            }
        }
        System.out.println(u);
        for (int i = u-1; i >=0; i--) {
            System.out.println(a[i]);
        }
    }
}