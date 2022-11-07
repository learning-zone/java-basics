public class SquareSorted {

	public static int[] sort(int[] arr) {
		int temp[] = new int[arr.length];
		int i = 0, j = arr.length - 1;
		
		for(int k = arr.length - 1; k >= 0; k--) {
			if(Math.abs(arr[i]) > Math.abs(arr[j])) {
				temp[k] = arr[i] * arr[i];
				i++;
			} else {
				temp[k] = arr[j] * arr[j];
				j--;
			}
		}
		return temp;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {-8, -2, 0, 1, 10};
		
		for(int i : arr)
			System.out.print(i + " ");
		
		System.out.println();
		arr = sort(arr);

		for(int i : arr)
			System.out.print(i + " ");
		
	}

}
