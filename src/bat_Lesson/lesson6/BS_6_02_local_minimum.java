package bat_Lesson.lesson6;

public class BS_6_02_local_minimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,2,9,2,1,4,0,10,9,0,8,3,5,6,7,1,9,2,4,0,7};
		int result=getLessIndex(arr);
		System.out.println(result);
	}
	public static int getLessIndex(int[] arr) {
		int len = arr.length;
        if (len == 0) return -1;
        if (len == 1) return 0;
        if (arr[0] < arr[1]) return 0;
        if(arr[len-2]>arr[len-1])
        {
        	return len-1;
        }
       
        return BinarySearcthodh_method(arr);
        
        //使用顺序的方法遍历
		//return GoStraight(arr);

    }
	public static int BinarySearcthodh_method(int[] arr) {
		
		int i = 0;
        int j = arr.length - 1;
        while (i + 1 < j) {
            int mid = i + (j - i) / 2;
            if (arr[mid] < arr[mid + 1] ) {
                j = mid;
            } else {
                i = mid + 1;
            }
        }
        if (arr[i] < arr[i + 1]) {
            return i;
        }
        return j;
	}
	public static int GoStraight(int[] arr)
	{
		int len = arr.length;
		 //3个数字而言
        int pre=0;
        int cur=1;
        int next=2;
        while(next!=len-1) {
        	if(arr[pre]>arr[cur]&&arr[next]>arr[cur])
        	{
        		return cur;
        	}
        	pre++;
             cur++;
             next++;
        }
        return -1;
	}
	
}
