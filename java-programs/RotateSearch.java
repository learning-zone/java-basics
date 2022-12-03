/*
  Binary search on an array after rotation
*/

package arrayDemo;

public class RotateSearch extends ArrayRotation{
	
	public static int searchPiv(int arr[], int l, int h) {
		if (h < l)
			return -1;
		if (h == l)
			return l;
		
		int mid = (l + h) / 2;
		
		if(mid < h && arr[mid] > arr[mid + 1])
			return mid;
		if (mid > l && arr[mid] < arr[mid - 1])
			return (mid - 1);
		if (arr[l] >= arr[mid])
			return searchPiv(arr, l, mid - 1);
		return searchPiv(arr, mid + 1, h);
	}
	public static int search(int arr[], int n, int key) {
		
		int piv = searchPiv(arr, 0, n - 1);
		
		if (piv == -1) {
			return binSearch(arr, 0, n - 1, key);
		}
		
		if (arr[piv] == key)
			return piv;
		if (arr[0] <= key)
			return binSearch(arr, 0, piv - 1, key);
		return binSearch(arr, piv + 1, n - 1, key);
	}
	
	public static int binSearch(int arr[], int l, int h, int key) {
		if (l > h)
			return -1;
		int mid = (l+h) / 2;
		
		if (key == arr[mid])
			return mid;
		if (key > arr[mid])
			return binSearch(arr, mid + 1, h, key);
		return binSearch(arr, l, mid - 1, key);
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};
		
		show(arr);
		System.out.println();
		show(rotate(arr, 2));
		System.out.println();
		System.out.println("Index = " + (search(rotate(arr, 2), rotate(arr, 2).length, 2) - 1));
	}

}

