import java.util.Scanner;
public class A_Meeting_of_Old_Friends {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l1 = sc.nextLong();
        long r1 = sc.nextLong();
        long l2 = sc.nextLong();
        long r2 = sc.nextLong();
        long k = sc.nextLong();
        if(Math.max(l1, l2)>Math.min(r2, r1)){
            System.out.println("0");
        }
        else{
        long ans = Math.min(r2, r1)-Math.max(l1, l2)+1;
        if(k<=Math.min(r2, r1)&&k>=Math.max(l1, l2)){
            ans--;
        }
        System.out.println(ans);
    }
}

}