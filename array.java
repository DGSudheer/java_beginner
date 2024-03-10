import java.util.*;
public class array {
    public static void main(String args[]){
        int arr[]=new int[3];
        //arr[0] = 1;
        int i=0, j=0;
        // while (i<arr.length) {
        //     System.out.println(arr[i]);
        //     i++;
        // }
        Scanner s = new Scanner(System.in);
        while (j<arr.length) {
            arr[j]=s.nextInt();
            j++;
        }
        int a1[] = {1,2,1,1,2};
        System.out.println("Largest is " + Largest(a1));

        char c[] = new char[3];
        float f[] = new float[4];
        
    }

    public static int Largest(int a[]){
        int l = Integer.MIN_VALUE;
        int s = Integer.MAX_VALUE;
        int n = a.length;
        for(int i=0;i<n;i++){
            if(a[i]>l)
                l = a[i];
            if(a[i]<s)
                s = a[i];
        }
        System.out.println("Smallest is "+ s);
        return l;
    }
}


