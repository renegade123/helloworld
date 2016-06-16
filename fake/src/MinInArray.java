/**
 * Created by Administrator on 2016/6/16.
 */
public class MinInArray {
    public static int min(int[] numbers){
        if(numbers == null || numbers.length == 0){
            throw new RuntimeException("Illegal input");
        }
        int lo = 0;
        int hi = numbers.length - 1;
        int mi = lo;
        while(numbers[lo] >= numbers[hi] ){
            if(hi - lo == 1){
                return numbers[hi];
            }
            mi = lo + (hi - lo)/2;
            if (numbers[mi] == numbers[lo] && numbers[hi] == numbers[mi]) {
                return minInorder(numbers, lo, hi);
            }
            if(numbers[mi] >= numbers[lo]){
                lo = mi;
            }else if (numbers[mi] <= numbers[hi]) {
                hi = mi;
            }
        }
        return numbers[mi];
    }
    public static int minInorder(int[] numbers, int start, int end) {
        int result = numbers[start];
        for (int i = start + 1; i <= end; i++) {
            if (result > numbers[i]) {
                result = numbers[i];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        // 典型输入，单调升序的数组的一个旋转
        int[] array1 = {3, 4, 5, 1, 2};
        System.out.println(min(array1));
        // 有重复数字，并且重复的数字刚好的最小的数字
        int[] array2 = {3, 4, 5, 1, 1, 2};
        System.out.println(min(array2));
        // 有重复数字，但重复的数字不是第一个数字和最后一个数字
        int[] array3 = {3, 4, 5, 1, 2, 2};
        System.out.println(min(array3));
        // 有重复的数字，并且重复的数字刚好是第一个数字和最后一个数字
        int[] array4 = {1, 0, 1, 1, 1};
        System.out.println(min(array4));
        // 单调升序数组，旋转0个元素，也就是单调升序数组本身
        int[] array5 = {1, 2, 3, 4, 5};
        System.out.println(min(array5));
        // 数组中只有一个数字
        int[] array6 = {1,2};
        System.out.println(min(array6));
        // 数组中数字都相同
        int[] array7 = {1, 1, 1, 1, 1, 1, 1};
        System.out.println(min(array7));
        System.out.println(min(array6));
        // 输入NULL
        System.out.println(min(null));
    }
}
