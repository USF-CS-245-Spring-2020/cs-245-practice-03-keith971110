public class BubbleSort implements Practice03Sort{
	public void sort(int[] a){
		int temp;

		for(int i=0; i<a.length-1; i++){
			if(a[i]>a[i+1]){
				temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
			}
		}
	}
}