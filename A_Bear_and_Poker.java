import java.util.Scanner;
public class A_Bear_and_Poker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int a[] = new int[n];   
        int k =-1;
        int j = 0 ;
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
            while(a[i]%2==0){
                a[i]/=2;
            }
            while(a[i]%3==0){
                a[i]/=3;
            }
            if(i==0){
                j=a[i];
            }
            if(j!=a[i]){
                k=1;
            }

        }
        if(k==1){
            System.out.println("No");
        }    else{
            System.out.println("Yes");
        }
    }
}