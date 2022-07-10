package assigment1CoreJava;

class assignment1_03CoreJava {

	void sort(int arr[])
    {
        int n = arr.length;
  
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
  
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
  
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
  
    public static void main(String args[])
    {
    	assignment1_03CoreJava ob = new assignment1_03CoreJava();
        int arr[] = {21,3,2012,16,7,2006,24,9,1981,31,5,1974};
        ob.sort(arr);
        System.out.println("My sorted array is as follows: ");
        ob.printArray(arr);
    }
}