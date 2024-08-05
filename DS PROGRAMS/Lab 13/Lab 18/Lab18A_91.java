import java.util.*;

public class Lab18A_91 {

    public static int binarySearch(int[] arr,int length,int n){
        int low = 0;
        int high = length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] < n) {
                low = mid + 1;
                } 
            else if (arr[mid] > n) {
                high = mid - 1;
                } 
            else {
                return mid + 1;
            }
        }
          return -1;              
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int length = sc.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Enter the value of element " + (i+1));
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter a number ");
        int n = sc.nextInt();
        int index = binarySearch(arr, length, n);
        if (index !=  -1) {
            System.out.println("Element is present at index " + index);
        } else {
            System.out.println("Element is not present in array");
        }
    }

}
