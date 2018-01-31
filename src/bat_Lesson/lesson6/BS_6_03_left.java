package bat_Lesson.lesson6;

public class BS_6_03_left {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,3,3,3,4};
		int num=3;
		int result=findPos(arr,arr.length,num);
		System.out.println(result);
	}

	
	public static int findPos(int[] arr, int n, int num) {
		int left=0;
		int right=n-1;
		
		int mid = left + (right - left) / 2;
		
		while(left+1<right) {
			mid = left + (right - left) / 2;
			System.out.println("left:"+left+"right"+right);
			if(num<=arr[mid]) {
				System.out.println("左");
				right=mid;
			}
			else {
				System.out.println("右");
				left=mid;
			}
		}
		System.out.println("mid"+mid);
		if (arr[left] == num) {
            return left;
        } else if (arr[right] == num) {
            return right;
        }
        return -1;
		
		
		
		
    }
}
