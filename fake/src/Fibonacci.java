/**
 * Created by name on 2016/6/16.
 */
public class Fibonacci {
    public static long fibonacci(int n){
        if(n <= 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        long prePre = 1;
        long pre = 1;
        long current = 2;
        for (int i = 3; i <= n; i++) {
            current = prePre + pre;
            prePre = pre;
            pre = current;
        }
        return current;
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(0));
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(2));
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(4));
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(6));
        System.out.println(fibonacci(7));
    }
}
