public class BubbleSort {
    public static void main(String[] args) {
        int[] arr1 = {7,8,3,1,2};
        for (int i = 0; i < arr1.length-1; i++) {
            for (int j = 0; j < arr1.length-i-1; j++) {
                if (arr1[j]>arr1[j+1]) {
                    // swap
                    int temp=arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=temp;
                }
            }
        }

        // printing
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}