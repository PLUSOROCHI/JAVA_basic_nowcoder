package bat_Lesson.lesson3;

public class Translation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
///////////////////////////////////////////////////////////////	
	//叠加字符串，之后截取特定的一段
	String stringTranslation_simple(String A, int n, int len) {
        return (A+A).substring(len,n);
        
    }
	
///////////////////////////////////////////////////////////////	
	//标准方法
	public String stringTranslation(String A, int n, int len) {
		char[] s = A.toCharArray();
		rotate1(s, len);
		return String.valueOf(s);
	}
	public void rotate1(char[] chas, int size) {
		if (chas == null || size <= 0 || size >= chas.length) {
			return;
		}
		reverse(chas, 0, size - 1);
		reverse(chas, size, chas.length - 1);
		reverse(chas, 0, chas.length - 1);
	}
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
