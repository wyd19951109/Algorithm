package offer;

/*	
 * �˰�Ϊţ������ָoffer66����ˢ���¼
 * ˼·�����½ǵ�Ԫ�ؿ�ʼ����
 * Ŀ��ֵ����С�������ߣ������������
*/
public class Solution01 {
	public boolean find(int target, int [][] array) {
		int len = array.length-1;
		int i = 0;
		while((len >= 0) && (i<array[0].length)) {
			if(array[len][i]>target) {
				len--;
			}
			else if(array[len][i]<target) {
				i++;
			}
			else { 
				return true;
			}	
		}
		return false;
	}
	}

