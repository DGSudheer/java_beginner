import java.util.*;

public class BinarySearch {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Length");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the " + n + " elements");
        for (int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }

        System.out.println("Enter the element to search");
        int k = s.nextInt();
        System.out.println("Element " + k + " is present?\n" + BSearch(arr, k) );

    }

    public static boolean BSearch(int arr[], int key){
        int i=0, j=arr.length-1,p;
        for(;i<=j;){
            p = (i+j)/2;
            if(arr[p]==key)
                return true;
            if(arr[p]>key)
                j=p-1;
            else
                i= p+1;
        }
        return false;
    }
}

