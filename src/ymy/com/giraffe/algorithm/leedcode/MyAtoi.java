package ymy.com.giraffe.algorithm.leedcode;

/**
 * Created by yemengying on 15/10/30.
 */
public class MyAtoi {

    public static int string2int(String str){
        if(str == null || str.length() == 0){
            throw new NumberFormatException("invalid input string");
        }
        int p = 0;
        boolean negative = false;
        int result = 0;
        int digit = 0;
        //过滤空格
        while(p < str.length() && Character.isWhitespace(str.charAt(p))) p++;
        //判断正负
        if(str.charAt(p) == '-') {
            negative = true;
            p++;
        }
        else{
            if(str.charAt(p) == '+') {
                p++;
            }
        }

        for(;p<str.length();p++){
            if(str.charAt(p) < '0' || str.charAt(p) > '9')
                throw new NumberFormatException("invalid input string");
            digit = str.charAt(p) - '0';
            //加上溢出判断
            if(negative && result < (Integer.MIN_VALUE + digit)/10) return Integer.MIN_VALUE;
            if(!negative && result > (Integer.MAX_VALUE - digit)/10 ) return Integer.MAX_VALUE;
            result = result * 10 + digit;
        }
        return negative ? -result : result;
    }
}
