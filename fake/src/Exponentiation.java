/**
 * Created by name on 2016/6/22.
 */
public class Exponentiation {
    public static double power(double base, int exponent){
        if(base == 0 && exponent == 0){
            throw new RuntimeException("Invalid input");
        }
        if(exponent == 0){
            return 1;
        }
        int exp = exponent;
        if(exp < 0){
            exp = -exp;
        }
        double result = powerWithExponent(base,exp);
        if(exponent < 0){
            result = 1/result;
        }
        return result;
    }
    public static double powerWithExponent(double base, int exponent){
        if(exponent == 0){
            return 1;
        }
        if(exponent == 1){
            return base;
        }
        double result = powerWithExponent(base,exponent >> 1);
         result *= result;
        if(exponent % 2 != 0){
            result *= base;
        }
        return result;
        }
    public static void main(String[] args) {
        System.out.println(0.0000000000000000000000001111 == 0);
        System.out.println(0.0000000000000000000000000000 == 0);
        System.out.println(power(2, -4));
        System.out.println(power(2, 4));
        System.out.println(power(2, 0));
        System.out.println(power(0.00000000000000000000000000001, -1));
        System.out.println(power(0.00000000000000000000000000001, 1));
        System.out.println(power(0.00000000000000000000000000001, 0));
        System.out.println(power(0.00000000000000000000000000000, 0));
    }
}
