import java.util.Scanner;
public class BinarySearch {
   public static void main(String[] args) {
        int[] arr1 = {1,2,3,7,8};
        int low=0;
        int high=arr1.length-1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to find: ");
        int n=sc.nextInt();
        for (int i = 0; i < arr1.length; i++) {
            int mid=(low+high)/2;
            if (n==arr1[mid]) {
                System.out.println("Element found at: "+mid);
                break;
            }
            else if (n>arr1[mid]) {
                low=mid;
            }
            else if (n<arr1[mid]) {
                high=mid;
            }
        }
    } 
}
