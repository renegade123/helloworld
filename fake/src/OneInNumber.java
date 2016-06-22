/**
 * Created by name on 2016/6/16.
 */
public class OneInNumber {
    public static int OneInNumber(int n){
        int  result = 0;
        for(int i = 0; i < 32; i++){
            result += (n & 1);
            n >>>= 1;
        }
        return  result;
    }
    public static int OneInNumber2(int n){
        int result = 0;
        while(n != 0){
            result++;
            n = (n-1) & n;
        }
        return result;
    }
}
