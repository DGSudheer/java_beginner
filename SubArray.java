import java.util.Scanner;

public class SubArray {
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
        System.out.println("\nSubArray");
        SubArr(arr);
        MaxMinSubArr(arr);
    }

    public static void SubArr(int arr[]){
        int sumofsubarray = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    sumofsubarray += arr[k];
                    System.out.print(arr[k]+" ");
                }
                System.out.println("");
            }
        }
        System.out.println("Sum of All SubArray "+sumofsubarray);
    }

    public static void MaxMinSubArr(int arr[]){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sumofsubarray = 0;
                for(int k=i;k<=j;k++){
                    sumofsubarray += arr[k];
                }
                if(sumofsubarray>max)
                    max = sumofsubarray;
                if(sumofsubarray<min)
                    min = sumofsubarray;
            }
        }
        System.out.println("Max of SumSubArray "+max);
        System.out.println("Min of SumSubArray "+min);
    }
}
