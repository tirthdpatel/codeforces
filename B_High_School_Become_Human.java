import java.util.Scanner;

public class B_High_School_Become_Human {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long x = sc.nextLong();
        Long y = sc.nextLong();
        Double xy =((Double)Math.log(x))*y;
        Double yx = ((Double)Math.log(y))*x ;
      
        if (xy > yx) {
            System.out.println(">");
        } else {
            if (xy < yx) {
                System.out.println("<");
            } else {
                System.out.println("=");
            }
        }
    }
}
