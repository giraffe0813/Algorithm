package ymy.com.giraffe.algorithm.leedcode;

import java.io.CharConversionException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yemengying on 15/10/28.
 */
public class ZigZag {

    public String zigZag(String s, int numRows){

        if(null == s || s.length() == 0 || numRows < 1) return "";
        if(numRows == 1) return s;
        int index = 1;
        boolean flag = true;//flag为true时 增加index flag为false时减小index
        Map<Integer, List<Character>> map = new HashMap<Integer,List<Character>>();
        //根据index将字符串分组
        //eg:输入“abcd” map--- 1:a 2:bd 3:c
        for(int i = 0; i < s.length() ;i++){

            if (map.containsKey(index)){
                map.get(index).add(s.charAt(i));
            }else{
                List<Character> list = new ArrayList<Character>();
                list.add(s.charAt(i));
                map.put(index, list);
            }
            if(flag){
                index++;
            }else{
                index--;
            }

            flag = (index == numRows || index == 1) ? !flag : flag;

        }
        List<Character> charList = new ArrayList<Character>();
        StringBuilder str = new StringBuilder();
        //根据map的key值 依次拼接字符串
        for(int i = 1;i<=numRows;i++){
            charList = map.get(i);
            if(null != charList && !charList.isEmpty()) {
                for (Character character : charList) {
                    str.append(character);
                }
            }
        }


        return str.toString();

    }


    public String zigzag2(String s, int rownums){
        if(null == s || s.length() == 0 || rownums < 1) return "";
        if(rownums == 1) return s;
        StringBuilder str = new StringBuilder();
        int size = 2*rownums - 2;
        for(int i=0; i < rownums; i++){
            for(int j = i;j<s.length();j +=size){
                str.append(s.charAt(j));
                if(i!=0 && i!=rownums-1 && j+size-2*i < s.length()){
                    str.append(s.charAt(j+size-2*i));
               }
            }

        }
        return str.toString();
    }

}
