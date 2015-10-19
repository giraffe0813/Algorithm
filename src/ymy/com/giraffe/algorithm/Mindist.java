package ymy.com.giraffe.algorithm;

/**
 * 两数组最短距离 已知两个元素从小到大排列的数组x[] y[]，请写一个程序算出两个数组元素彼此之间差得绝对值中最小的一个，叫做数组的距离
 * 
 * @author yemengying
 *
 */
public class Mindist {

	public static int getMindist(int[] x, int[] y) {
		int i = 0, j = 0;
		int distance = Math.abs(x[0] - y[0]);
		while(i < x.length && j < y.length){
			if(x[i] >= y[j]){
				distance = (Math.abs(x[i] - x[j]) < distance) ? Math.abs(x[i] - y[j]) : distance;
				j++;
			}else{
				distance = (Math.abs(x[i] - x[j]) < distance) ? Math.abs(x[i] - y[j]) : distance;
				i++;
			}
		}
		return distance;
	}

}
