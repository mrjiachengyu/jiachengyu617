package com.jiachengyu.common.utils;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
/**
 * 
 * @ClassName: RandomUtil 
 * @Description: 数字工具类
 * @author: 86183
 * @date: 2019年6月17日 上午9:16:27
 */
public class RandomUtil {

	//方法1：返回min-max之间的随机整数（包含min和max值），例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。 (5分)
	public static int random(int min, int max){
		Random random=new Random();
		return random.nextInt(max-min+1)+min;
		
	
	}
	//方法2：在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。 (8分)
	public static Set<Integer> subRandom (int min, int max, int subs){
		Set<Integer> set=new HashSet<Integer>();
		while(set.size()!=subs) {
			int random = RandomUtil.random(min, max);
			set.add(random);
		}
	return set;
	}
	//方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
	public static char randomCharacter (){
	String str="123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
	Random random=new Random();
	int random2 = RandomUtil.random(0, str.length()-1);
	return str.charAt(random2);
	}
	//方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
	public static String randomString(int length){
		String str="123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		String str1="";
		for(int i=0;i<length;i++) {
			char c = RandomUtil.randomCharacter();
			str1+=c;
		}
		return str1;
	}


}
