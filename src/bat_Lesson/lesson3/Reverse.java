package bat_Lesson.lesson3;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse use=new Reverse();
		String result=use.reverseSentence("dog loves pig",13);
		System.out.println("result"+result);
	}
	
	public String reverseSentence(String A, int n) {
		if (A == null || n == 0) {
			return A;
		}
		char[] s = A.toCharArray();
		rotateWord(s);
		return String.valueOf(s);
	}

	/**
	 * 
	 * @param chas
	 */
	public void rotateWord(char[] chas) {
		if (chas == null || chas.length == 0) {
			return;
		}
		//将字符串翻转
		reverse(chas, 0, chas.length - 1);
		int l = -1;
		int r = -1;
		for (int i = 0; i < chas.length; i++) {
			System.out.println(chas[i]);
			
			if (chas[i] != ' ') {
				l = i == 0 || chas[i - 1] == ' ' ? i : l;
				r = i == chas.length - 1 || chas[i + 1] == ' ' ? i : r;
				System.out.println("IF1");
				System.out.println("L"+l+"R"+r);
			}
			if (l != -1 && r != -1) {
				System.out.println("IF2");
				System.out.println("L"+l+"R"+r);
				reverse(chas, l, r);
				l = -1;
				r = -1;
				
			}
		}
	}

	/**
	 * 从start开始,直到end的字符串，进行翻转
	 * @param chas
	 * @param start
	 * @param end
	 */
	public void reverse(char[] chas, int start, int end) {
		char tmp = 0;
		while (start < end) {
			tmp = chas[start];
			chas[start] = chas[end];
			chas[end] = tmp;
			start++;
			end--;
		}
	}
}
