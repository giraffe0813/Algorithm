package ymy.com.giraffe.algorithm;

import ymy.com.giraffe.algorithm.leedcode.LongestPalindrome;
import ymy.com.giraffe.algorithm.leedcode.LongestSubString;
import ymy.com.giraffe.algorithm.leedcode.MedianSortedArrays;
import ymy.com.giraffe.algorithm.leedcode.ZigZag;

import java.util.List;

public class TestMain {

	public static void main(String[] args) throws Exception {
		LongestSubString longestSubString = new LongestSubString();
		System.out.println(longestSubString.lengthOfLongestSubstring2("aaaabbbb"));

		int[]a= {1,2,3,4};
		int[] b={1,2,3,4};
		System.out.print(new ZigZag().zigzag2("ABCD",2));
	}

}
