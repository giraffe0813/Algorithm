package ymy.com.giraffe.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 在三位正整数中 比如abc
 * 有一些可以满足a的立方+b的立方+c的立方等于abc
 * 求所有的三位armStrong数
 * @author yemengying
 *
 */
public class Armstrong {
	
	public static List<Integer> getAllArmstrong(){
		int q100 = 0;
		int p10 = 0;
		int p=0,q=0,r=0;
		int cubeq, cubep,cuber;
		List<Integer> list = new ArrayList<Integer>();
		for(q=1,q100=100;q<=9;q++,q100+=100){
			cubeq= q*q*q;
			for(p=0,p10=0;p<=9;p++,p10+=10){
				cubep = p*p*p;
				for(r=0;r<=9;r++){
					cuber=r*r*r;
					if((cubep + cubeq + cuber) == (p10 + q100 + r)){
						list.add(p10 + q100 + r);
					}
				}
					
			}
		}
		return list;
		
	}

}
