public class SelectionSort {
    public static void main(String[] args) {
        int[] arr1 = {7,8,3,1,2};

        // selection sort
        
        for (int i = 0; i < arr1.length-1; i++) {
            int min=i;
            for (int j = i+1; j < arr1.length; j++) {
                if (arr1[min]<arr1[j]) {
                    min=j;    
               }
            }
            // swap
            int temp=arr1[min];
            arr1[min]=arr1[i];
            arr1[i]=temp;
        }

        // printing the array

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
