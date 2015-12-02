package ymy.com.giraffe.algorithm.leedcode;

/**
 * Created by yemengying on 15/11/2.
 */
public class PalindromeInt {

    public boolean ifPalindrome(int x){

        if(x < 0) return false;//负数不算回文数字
        if(x < 10) return true;//只有一位 肯定是回文

        int length = 1;//判断有多少个0 比如123321 就应该除以100000来获得第一位的数字

        while(x/length != 0){
            length *= 10;
            temp /= 10;
        }
        //第一位和最后一位对比 第二位和倒数第二位对比 以此类推
        while(x != 0){
            int left = x/ length;
            int right = x%10;
            if(left != right) return false;

            x = x % length / 10;
            length /= 10;

        }

        return true;

//        //negative numbers are not palindrome
//        if (x < 0)
//            return false;
//
//        // initialize how many zeros
//        int div = 1;
//        while (x / div >= 10) {
//            div *= 10;
//        }
//
//        while (x != 0) {
//            int left = x / div;
//            int right = x % 10;
//
//            if (left != right)
//                return false;
//
//            x = (x % div) / 10;
//            div /= 100;
//        }
//
//        return true;
    }
}
