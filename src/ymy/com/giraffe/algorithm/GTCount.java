package ymy.com.giraffe.algorithm;

/**
 * 支配值数目 已知f[] g[]两个从小到大排列的数组，算出f[]中比g[]中元素大得对数
 * 如f[0]比g[]中多少个元素大，f[1]比g[]中多少个元素大，值的总和就是答案
 * 
 * @author yemengying
 *
 */
public class GTCount {

	public static int getGTCount(int[] f, int[] g) {
		int num = 0;
		for (int i = 0; i < f.length; i++) {
		
			for(int j = g.length - 1;j >= 0; j--){
				//由于是排好序的 当f[i] > g[j]时 无需在比较g[j-1]...等
				if(f[i] > g[j]){
					num += j + 1;
					break;
 				}
				
			}
		}
		return num;
	}

}
