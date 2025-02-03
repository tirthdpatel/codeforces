import java.util.Scanner;

public class A_Required_Remainder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int n = sc.nextInt();
int k = n/x;
if(k*x+y<=n)
System.out.println(k*x+y);
else{
    System.out.println((k-1)*x+y);
}
        }
    }
}