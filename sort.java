// Java program for implementation of Bubble Sort
class BubbleSort {
    void bubbleSort(double arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
  
    /* Prints the array */
    void printArray(double arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(String.format("%5.1f", arr[i]) + " ");
        System.out.println();
    }
  
    // Driver method to test above
    public static void main(String args[])
    {
        double [] arr = new double[100];
		for(int i=0; i<100; i++){
			arr[i] = Math.random()*100;
		}
		BubbleSort ob = new BubbleSort();
         //{ 64, 34, 25, 12, 22, 11, 90 };
		
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
/* This code is contributed by Rajat Mishra */


// EDITED BY Edwards2kx
