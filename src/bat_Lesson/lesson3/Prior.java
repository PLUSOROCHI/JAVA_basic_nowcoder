package bat_Lesson.lesson3;

import java.util.Arrays;
import java.util.Comparator;

public class Prior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prior use=new Prior();
		
		String[] a=new String[2];
		a[0]="ab";
		a[1]="a";
		String result=use.findSmallest(a,a.length);
		System.out.println(result);
	}
	public class MyComparator implements Comparator<String> {
		@Override
		public int compare(String a, String b) {
			return (a + b).compareTo(b + a);
		}
	}

	public String findSmallest(String[] strs, int n) {
		if (strs == null || n == 0) {
			return "";
		}
		// 根据新的比较方式排序
		Arrays.sort(strs, new MyComparator());
		String res = "";
		for (int i = 0; i < n; i++) {
			res += strs[i];
		}
		return res;
	}
}
