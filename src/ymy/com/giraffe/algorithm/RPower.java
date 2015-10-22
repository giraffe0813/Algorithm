package ymy.com.giraffe.algorithm;

/**
 * 数字自乘递归求解 求m的n次方
 * Created by yemengying on 15/10/22.
 */
public class RPower {

    /**
     * m的n次方 分为三种情况 n=0 result =1;n为偶数,result=m的n/2次方的平方；n为奇数，result=m乘以m的n-1次方
     * @param m
     * @param n
     * @return
     */

    public static long getPower(int m , int n){
        long result;
        if(n == 0){
            return 1;
        }else if(n%2 == 0){
            result =  getPower(m ,n/2);
            return result * result;
        }else{
            return m * getPower(m, n-1);
        }

    }
}
