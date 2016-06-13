/**
 * Created by name on 2016/6/3.
 */
public class ArraySearch {
    public static boolean find(int[][] matrix,int number) {
        if (matrix == null || matrix.length < 1 || matrix[0].length < 1) {
            return false;
        }
        int rows = matrix.length;
        int cols = matrix[1].length;
        int row = 0;
        int col = cols - 1;
        while (row >= 0 && row < rows && col >= 0 && col < cols) {
            if (matrix[row][col] == number) {
                return true;
            } else if (matrix[row][col] > number) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        System.out.println(find(arr,13));
        System.out.println(find(arr,11));
        System.out.println(find(arr, 1));    // 要查找的数比数组中最小的数字还小
        System.out.println(find(arr, 16));   // 要查找的数比数组中最大的数字还大
        System.out.println(find(null, 16));     // 健壮性测试，输入空指针
    }
}
