import java.util.*;
public class LinearSearch {
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
        System.out.println("Element " + k + " is present?\n" + LSearch(arr, k) );

    }

    public static boolean LSearch(int arr[], int key){
        int l = arr.length;
        for(int i=0; i<l ; i++){
            if(arr[i] == key)
                return true;
        }
        return false;
    }
}
