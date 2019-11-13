import java.util.Arrays;
//冒泡排序
public class MethodParamter{
	public static void bubbleSort(int[]a){
		for (int i=0;i<a.length-1;i++){
			//j~[0,a.length-i-1)
			for (int j=0;i<a.length-i-1;j++){
			//	j和j+1下标对比
			if (a[j]>a[j+1]){
				swap(a,j,j+1);
			    }
		    }	
		}
	}
	public static void main (String[]args){
		int[] a={1,2,3,4,5};
		int[] b={5,4,3,2,1};
		int[] c={3,3,3,3,3};
		int[] d={1,9,3,7,7};
		bubbleSort(a);
		bubbleSort(b);
		bubbleSort(c);
		bubbleSort(d);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(d));
	}
		
		
	//二分查找
	//public static int binarySearch(int[]a,int value){
		//查找的范围是[left,right]
		// int left=0;
		// int right=a.length-1;
		//只要[left,right]代表的区间内还有数，就表示还有希望，继续查找
		// while (left<=right){
			// int mid = (left+right)/2;
			// if (value==a[mid]){
				// return mid;
			// }else if(value<a[mid]){
				// right = mid -1;
			// }else {
				// left = mid + 1;
			// }
		// }
		// return -1;
	// }
	// public static void main (String[]args){
		// int[] a={1,2,3,4,5};
		// int[] b={5,4,3,2,1};
		// int[] c={3,3,3,3,3};
		// int[] d={1,9,3,7,7};
		// binarySearch(a);
		// binarySearch(b);
		// binarySearch(c);
		// binarySearch(d);
		// System.out.println(Arrays.toString(a));
		// System.out.println(Arrays.toString(b));
		// System.out.println(Arrays.toString(c));
		// System.out.println(Arrays.toString(a,3));
		
		
	// }
	
	
}

