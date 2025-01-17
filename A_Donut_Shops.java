import java.util.Scanner;

public class A_Donut_Shops {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Long a = sc.nextLong();
            Long b = sc.nextLong();
            Long c = sc.nextLong();
            float per=b/c;
            Long fora;
            Long forb;
            if(a>c){
                fora=(long)(-1);
            }else{

                    fora=(long)(1);
                
                

            }
            if(c>a*b){
                forb=(long)(-1);
           }else{
            forb=b;
           }
           System.out.println(fora +" "+ forb);
        }
    }
}