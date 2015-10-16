package ymy.com.giraffe.algorithm;

/**
 * 最长平台问题
 * 已知一个从小到大的排序数组，这个数组中的一个平台就是连续的一串值相同的元素，并且这一串元素不能再延伸。
 * 例如1，2，2，3，3，3，4，5，5，6
 * 试编写一个程序 把数据中的最长平台长度找出来
 * 在上面例子中3就是最长平台长度
 * @author yemengying
 *
 */
public class Plateau {
	
	
	public static int getPlateau(int[] nums){
		int length = 1;
		//存取当前最长长度
		int maxLength = 1;
		for(int i = 0 ; i < nums.length - 1 ; i++){
			if(nums[i] == nums[i+1]){ 
				//如果相邻两个值一样length加一
				length++;
				if(length >= maxLength){
					maxLength = length;
				}
			}else{
				//在数字变化的临界点 将length置为1
				length = 1;
			}
		}
		return maxLength;
	}
	
	/**
	 * 书上的答案
	 * @param nums
	 * @return
	 */
	public static int bestGetPlateau(int[] nums){
		
		int length =1;
		int i;
		for(i = 1; i< nums.length; i++){
			if(nums[i] == nums[i-length]){
				length++;
			}
		}
		return length;
		
	}

}
