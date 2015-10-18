package ymy.com.giraffe.algorithm;

/**
 * 等值数目
 * 已知两个整数数组f[]与g[]
 * 它们的元素都以从小到大排列，而且两个数组中的元素各自不同
 * 算出这连个数组彼此之间有多少组相同的数据
 * eg:f[]=1,3,4,7,9 g[]=3,5,7,8,10
 * f[1]和g[0] 是一组
 * @author yemengying
 *
 */
public class EquleCount {
	
	public static int getEquleCount(int[] f, int[] g){
		int num = 0;
		int k = 0;
		for(int i = 0; i < g.length; i++){
			for(int j= k; (f[i] >= g[j])&&j<g.length; j++){
				if(f[i] == g[j]){
					k = j+1;
					num++;
					break;
				}
			}
		}
		return num;
	}
	

}
