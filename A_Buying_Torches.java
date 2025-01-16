import java.util.Scanner;
public class A_Buying_Torches {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            Long x = sc.nextLong();
            Long y =sc.nextLong();
            Long k =sc.nextLong();
            if((k*(y+1)-1)%(x-1)==0){

            System.out.println(k+(k*(y+1)-1)/(x-1));
            }
else{

    System.out.println(k+1+(k*(y+1)-1)/(x-1));
}

        
        }
    }
}