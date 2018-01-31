package bat_Lesson.lesson6;

public class BS_6_04_Min_circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,4,5,1,2};
		int result=getMin(arr,arr.length);
		System.out.println(result);
	}

	public static int getMin_2(int[] arr, int n) {
        
        if (arr == null) {
            return Integer.MAX_VALUE;
        }
        int left = 0;
        int right = arr.length - 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (arr[left] < arr[right]) {
                return arr[left];
            } else if (arr[left] <= arr[mid]) { //  注意这里必须考虑等号情况。
                left = mid; // 这里可以是lo = mid + 1;
            } else {
                right = mid;
            }
        }
        if (arr[left] < arr[right]) {
            return arr[left];
        }
        return arr[right];
    }
	
	public static int getMin(int[] arr, int n) {
		  
		if (arr == null) {
	            return Integer.MAX_VALUE;
	     }
		  
		  
		  int left=0;
		  int right=arr.length-1;
		  while(left+1<right) {
			  int mid=left + (right - left) / 2;

			  //针对有序情况
			  if(arr[left]<arr[right]) {
				  return arr[left];
			  }
			   if(arr[left]<=arr[mid]) {//此处不小心把arr[mid]写为了mid 导致一直出问题
				   left=mid;
			  }
			  else {
				  right=mid;
			  }
		  }
		  if(arr[left]<arr[right])
		  {
			  return arr[left];
		  }
			  return arr[right];
		  
    }
}
