import java.util.Scanner;
public class A_Elevator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int b = sc.nextInt();
        if(a=="front"){
            if(b==1){
                System.out.println("L");
            }else{
                System.out.println("R");
            }
        }else{
            if(b==1){
                System.out.println("R");
            }else{
                System.out.println("L");
            }
        }
    }
}
