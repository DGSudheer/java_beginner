import java.util.Scanner;

public class Reverse {
        public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Length");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the " + n + " elements");
        for (int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }

        System.out.println("\nArray\n" + arr);
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("\nReverted array\n" + Reverse1(arr) );
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static int[] Reverse(int arr[]){
        int i=0, j=arr.length-1, temp;
        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
        return arr;
    }

    public static int[] Reverse1(int arr[]){
        int i=0, j=arr.length-1;
        while(i<j){
            arr[j]+=arr[i];
            arr[i]=arr[j]-arr[i];
            arr[j]-=arr[i];
            i++;j--;
        }
        return arr;
    }
}
