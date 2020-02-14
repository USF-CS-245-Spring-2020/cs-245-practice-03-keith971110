public class BinaryIterativeSearch implements Practice03Search{
	public int search(int[] a, int target){
		int min = 0;
		int max = a.length -1;
		int mid;

		while(min<=max){
			mid = (min + max)/2;
			if(a[mid] < target){
				min = mid+1;
			}
			if (a[mid] > target){
				max = mid -1;
			}
			else
				return mid;
		}
		return -1;
	}
}