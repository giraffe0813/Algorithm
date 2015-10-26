package ymy.com.giraffe.algorithm.leedcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 * For example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3.
 * For "bbbbb" the longest substring is "b", with the length of 1.
 * Created by yemengying on 15/10/25.
 */
public class LongestSubString {

    //created by myself ,but isn't good
    public int lengthOfLongestSubstring(String s) {
        if(null == s || "".equals(s)){
            return 0;
        }
        if(s.length() == 1) return 1;
        int length = 0;
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i = 0; i < s.length() - length; i++) {
            map.put(s.charAt(i),i);
            for (int j = i+1; j < s.length(); j++) {
                if (map.containsKey(s.charAt(j))) {
                    length = (length > map.size()) ? length : map.size();
                    map.clear();
                    break;
                } else {
                    map.put(s.charAt(j), j);
                }
            }
        }
        return length;
    }


    public int lengthOfLongestSubstring2(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        if (s == null || s.length() == 0) return 0;
        if (s.length() == 1) return 1;
        int rightPointer = 0, leftPointer = rightPointer - 1, answer = 0;
        while (rightPointer != s.length()) {
            //map put方法的返回值是key以前关联的值 若没有返回null
            Integer previousOccurrence = map.put(s.charAt(rightPointer), rightPointer);
            if (previousOccurrence != null) {
                leftPointer = Math.max(leftPointer, previousOccurrence);
            }
            answer = Math.max(answer, rightPointer - leftPointer);
            rightPointer++;
        }
        return answer;
    }
}
