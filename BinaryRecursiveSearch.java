public class BinaryRecursiveSearch implements Practice03Search{
	public int search(int[] a, int target){

		return binSearch(a, 0, a.length-1, target);
	}

	public int binSearch(int[] a, int min, int max, int target){
		if(max>=min){
			int mid = min + (max-min) / 2;

			if(a[mid] == target){
				return mid;
			}
			if(a[mid]>target){
				return binSearch(a, min, mid-1,target);
			}
			return binSearch(a, mid+1, max, target);
		}
		return -1;
	}
}