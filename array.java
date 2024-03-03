import java.util.*;
public class array {
    public static void main(String args[]){
        int arr[]=new int[10];
        arr[0] = 1;
        int i=0, j=0;
        while (i<arr.length) {
            System.out.println(arr[i]);
            i++;
        }
        Scanner s = new Scanner(System.in);
        while (j<arr.length) {
            arr[j]=s.nextInt();
            j++;
        }
    }
}


