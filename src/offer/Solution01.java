package offer;

/*	
 * 此包为牛客网剑指offer66道题刷题记录
 * 思路：左下角的元素开始查找
 * 目标值比其小就向上走，比其大，向右走
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

