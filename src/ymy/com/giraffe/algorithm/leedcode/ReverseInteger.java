package ymy.com.giraffe.algorithm.leedcode;

/**
 * Created by yemengying on 15/10/29.
 */
public class ReverseInteger {

    public int getReverseInteger(int x){
        if(x < 10 && x > -10) return x;
        StringBuilder str = new StringBuilder(x + "");
        String result = str.reverse().toString();
        while(result.charAt(result.length()-1) == '0'){
            result = result.substring(0,result.length()-1);
        }
        if(x < 0){
            result = result.substring(0, str.length()-1);
            result = "-" + result;
        }
        int num = 0;
        try{
            num = Integer.valueOf(result);
        }catch (NumberFormatException e){
            num = 0;
        }finally {
            return num;
        }

    }
}
