import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr1 = {7,8,3,1,2};
        
        System.out.print("Enter element to search: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();

        // start searching
        byte flag=0;
        int i;
        for (i = 0; i < arr1.length; i++) {
            if (n==arr1[i]) {
                flag=1;
                break;
            }
        }
        if (flag==1) {
            System.out.println("Element found at index: "+i);
        }else {
            System.out.println("Element not found!");
        }
    }
}
