package ymy.com.giraffe.algorithm.leedcode;

import java.util.*;

/**
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution.
 * Input: numbers={2, 7, 11, 15}, target=9
 * Created by yemengying on 15/10/23.
 */
public class TwoSum {


    //要求返回位置 并且从1开始 而不是0 数组有序无序都一样
    //利用hashMap做 map里存储的是数组的值和位置索引
    public static int[] twoSum2(int[] nums, int target) {
        int[]result = new int [2];
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target - nums[i])){
                result[0] = map.get(target - nums[i]) +1;
                result[1] = i+1;
                return result;
            }
            map.put(nums[i],i);
        }
        return null;
    }

    //返回两个数 不需要返回位置
    //利用二分查找做 先将数组排序 对于每个元素查找target-nums[i]是不是在数组中
    public static int[] twoSum1(int[] nums, int target){
        int[]result = new int [2];
        Arrays.sort(nums);
        int location = 0;
        for(int i = 0; i < nums.length ; i++){
            location = binarySearch(nums, target - nums[i]);
            if(location != -1) {
                result[0] = nums[i];
                result[1] = nums[location];
                break;
            }
        }
        return result;

    }

    //二分查找
    private static int binarySearch(int[]nums,int target){
        int high = nums.length - 1;
        int low = 0;
        int middle = (high + low)/2;
        while(high >= low){
            if(nums[middle] < target){
                low = middle + 1;
            }else if (nums[middle] > target){
                high = middle - 1;
            }else {
                return middle;
            }
            middle = (high + low)/2;
        }
        return -1;

    }

}
