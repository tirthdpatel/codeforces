
import java.util.Scanner;

public class B_Yet_Another_Meme_Problem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Long a = sc.nextLong();
            Long b = sc.nextLong();
            Long len=(long)0;
            b++;
while(b>0){
len++;
b/=10;
}
long ans = a*(len-1);
System.out.println(ans);
        }
        sc.close();
    }
}