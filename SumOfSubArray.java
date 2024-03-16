import java.util.*;
public class SumOfSubArray {
    public static void main(String args[]){
        int n=0, arr[]=new int[n];
        System.out.print("Enter Length of Array: ");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        System.out.println("Enter elements of Array: ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("All SubArrays of the Array: ");
        SubArray(arr);
    }
    public static void SubArray(int arr[]){
        int PrefixArr[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(i==0)
                PrefixArr[i]=arr[i];
            else
                PrefixArr[i]=PrefixArr[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++)   {
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    
                }
            }
        }
    }
}
