package how2j;

import java.util.Random;

/*���ȴ���һ��������5������
Ȼ��������ÿһλ�����������
ͨ��forѭ�����������飬�ҳ���С��һ��ֵ����*/
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
		System.out.println("��СֵΪ��"+min);
		for(int each:a) {
			System.out.print(each+"//");
		}
}	
}
