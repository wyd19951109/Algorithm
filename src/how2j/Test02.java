package how2j;

import java.util.Random;

/*首先创建一个长度是5的数组
然后给数组的每一位赋予随机整数
通过for循环，遍历数组，找出最小的一个值出来*/
public class Test02 {
	public static void main(String[] args) {
		int min = 100;
		int [] a = new int[5];
	
		for(int i=0; i<a.length; i++) {
			a[i] = new Random().nextInt(100);
			System.out.print(a[i]+"  ");
	}	
		for(int i=0; i<a.length; i++) {
			if (min>a[i]) {
				min = a[i];
			}
		}
		System.out.println("最小值为："+min);
		for(int each:a) {
			System.out.print(each+"//");
		}
}	
}
