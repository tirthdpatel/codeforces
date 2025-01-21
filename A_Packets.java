import java.util.Scanner;
public class A_Packets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        int k =0;
        while(Math.pow(2, k +1)-1 < n){
            k++;
        }
        long ans =(long)Math.pow(2, k)-1;
        if(n==ans){
            System.out.println(k);
        }else{
            System.out.println(k+1);
        }
    }
}