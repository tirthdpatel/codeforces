import java.util.Scanner;
public class A_Odd_Set {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            n*=2;
            int odd=0,even=0;
            int temp;
            for (int i = 0; i < n; i++) {
                temp=sc.nextInt();
                
            int k =(temp%2==1)?odd++:even++;
            
            
            }
            if(even==odd){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
                }
    }
}