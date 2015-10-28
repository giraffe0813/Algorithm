package ymy.com.giraffe.algorithm.leedcode;

/**
 * Created by yemengying on 15/10/27.
 */
public class LongestPalindrome {

    int start;
    int length;

    public  String getLongestPalindrome(String s){

        if(null == s || s.length() == 0){
            return "";
        }
        if(s.length() == 1){
            return s;
        }
        for(int i = 0;i < s.length();i++){
            getLength(s,i,i);
            getLength(s,i,i+1);

        }

        return s.substring(start, start + length);
    }

    private void getLength(String s , int i, int j){
        while(i >= 0 && j<s.length()){
            if(s.charAt(i) == s.charAt(j)){
                i--;
                j++;
            }else{
                break;
            }

        }

        if(length < j-i-1){
            start = i+1;
            length = j-i-1;

        }
    }

}
