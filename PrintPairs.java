import java.util.Scanner;

public class PrintPairs {
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
        System.out.println("");
        Ppairs(arr);
    }

    public static void Ppairs(int arr[]){
        int j=arr.length;
        for(int i=0;i<j;i++){
            for(int k=i+1;k<j;k++){
                System.out.print("(" + arr[i] + ", " + arr[k] + ") ");
            }
            System.out.println("");
        }
    }
}
