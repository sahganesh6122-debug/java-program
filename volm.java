// 1/3 pie r^2 h cone
// 4/3 pie r^3 sphere
import java.util.*;
public class volm {
    double volume( int r)
    {
        return (4.0/3.0) * 3.14 * Math.pow(r,3);
    }
     double volume( int r, int h)
     {
        return ((1.0/3.0) * 3.14 *r*r*h);
     }
     public static void main(String[]args)
     {
        volm n = new volm();
         System.out.println(n.volume( 2));
         System.out.println(n.volume(2,7));
     }

    
}
