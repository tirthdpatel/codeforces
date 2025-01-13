import java.util.Scanner;

public class B_Stand_up_Comedian {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int a3 = sc.nextInt();
            int a4 = sc.nextInt();
            int ans = 0;
            if(a1==0){
                ans=1;
            }else{
                ans=a1+2*(Math.min(a3,a2))+Math.min(a1+1, Math.abs(a2-a3)+a4);
            }
            
           
            System.out.println(ans);

        }
    }
}