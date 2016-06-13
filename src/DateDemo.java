import java.text.*;
import java.util.*;
/**
 * Created by name on 2016/4/27.
 */
public class DateDemo {
   public static void main(String[] args){
       SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
       String input = args.length == 0 ? "1818-11-11" :args[0];
       System.out.print(input + " Parse as ");
       Date t;

       try {
           t = ft.parse(input);
           System.out.println(t);
       } catch (ParseException e) {
           System.out.println("Unparseable using " + ft);
       }
   }
}
