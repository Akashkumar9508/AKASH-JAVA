
import java.util.*;

class AC_Q4 {
    public static Double circle(Double r) {
        return 2*3.14*r;
        
        
    }
    public static void main(String[] args)
    {
        System.out.println("enter the radius ");
        Scanner aa = new Scanner(System.in);
        Double r = aa.nextDouble();
        System.out.println(circle(r));
        aa.close();
    }

}
