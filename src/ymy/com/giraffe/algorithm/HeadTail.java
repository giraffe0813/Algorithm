package ymy.com.giraffe.algorithm;

/**
 * 等值收尾和 设有一个数组 有n个元素 每个都大于0 x[0]+x[1]+x[2]+...+x[i] 是前置和 x[j]+x[j+1]+...+x[n-1]
 * 是后置和 算有多少组相同的前置和和后置和
 * 
 * @author yemengying
 *
 */
public class HeadTail {

	public static int getHeadTail(int[] x) {
		int num = 0;
		int i = 0;
		int j = x.length - 1;
		int head = x[i];
		int tail = x[j];
		while (i < x.length - 1 && j > 0) {
			if (head > tail) {// 前置和大 将后置和改变
				tail += x[--j];
			} else if (head < tail) {// 后置和大 将前置和改变
				head += x[++i];
			} else {// 相等 前置和 后置和同时改变
				num++;
				head += x[++i];
				tail += x[--j];
			}
		}
		return num + 1;//如果前置和和后置和都是整个数组也算的话需要加1
	}

}
