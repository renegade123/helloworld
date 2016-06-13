/**
 * Created by name on 2016/6/3.
 * 请实现一个函数，把字符串中的每个空格替换成"%20"，例如“We are happy.“，则输出”We%20are%20happy.“。
 *
 * string     要转换的字符数组
 * usedLength 已经字符数组中已经使用的长度
 * @return 转换后使用的字符长度，-1表示处理失败
 */
public class ReplaceString {
    public static int replaceBlank(char[] string,int usedlength){
        if(string.length < usedlength || string == null){
            return -1;
        }
        int whiteCount = 0;
        for (int i = 0; i < string.length ; i++) {
            if (string[i] == ' ') {
                whiteCount++;
            }
        }
        int targetLength = whiteCount * 2 + usedlength;
        int tmp = targetLength;
        if(targetLength > string.length){
            return  -1;
        }
        if(whiteCount == 0){
            return usedlength;
        }
        usedlength--;
        targetLength--;
        while(usedlength >= 0 && usedlength < targetLength){
            if(string[usedlength] == ' '){
                string[targetLength--] = '0';
                string[targetLength--] = '2';
                string[targetLength--] = '%';
            }else{
                string[targetLength--] = string[usedlength];
            }
            usedlength--;
        }
        return tmp;
    }
    public static void main(String[] args) {
        char[] string = new char[50];
        string[0] = ' ';
        string[1] = 'h';
        string[2] = ' ';
        string[3] = ' ';
        string[4] = 'e';
        string[5] = 'l';
        string[6] = ' ';
        string[7] = ' ';
        string[8] = 'l';
        string[9] = ' ';
        string[10] = 'o';
        string[11] = ' ';
        int length = replaceBlank(string, 12);
        System.out.println(new String(string, 0, length));
    }
}
