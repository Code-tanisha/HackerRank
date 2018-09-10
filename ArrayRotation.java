//This Program is to rotate an array by n number.
//Input: An array, d no. to which array is rotated, length of the array.
//Output: Rotated array by d no.

class Main {
	    void leftRotate(int arr[], int d, int n)
	   {
		for(int i=0;i<d;i++) {
	    leftRotatebyOne(arr,n);
		}
	   }
		void leftRotatebyOne(int arr[], int n)
		{
			int temp;
			temp = arr[0];
			for(int i = 0;i < n-1; i++) {
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		void printArray(int arr[], int n) {
			for(int i=0;i<n;i++) {
				System.out.println(arr[i]+" ");
			}
		}
	public static void main(String[] args) {
		Main obj = new Main();
		int arr[] = {1,2,3,4,5,6,7};
		obj.leftRotate(arr, 2, 7);
		obj.printArray(arr,7);
	}
}
