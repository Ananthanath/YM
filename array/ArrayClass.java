package array;
public class ArrayClass {
	public static void main(String[] args) {
		// array
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		arr[0] = 87;
		int i = 0;
//		int len=arr.length;
//		for( i=0;i<len;i++)
//		{
//			System.out.println(arr[i]);
//		}
		int arr1[] = new int[arr.length * 2];
		for (i = 0; i < arr.length; i++) {
			arr1[i] = arr[i];
		}
		for (i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

	}
}
