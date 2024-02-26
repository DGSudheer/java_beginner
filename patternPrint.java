public class patternPrint{
    public static void main(String[] args) {
        int i,j;
        int n=10;
        // for(i=0;i<n;i++){
        //     j=0;
        //     while(j<n-i){
        //         System.out.print('*');
        //         j++;
        //     }
        //     System.out.print("\n");
        // }
        for(i=0;i<n;i++){
            j=0;
            while(j<n){
                System.out.print('*');
                j++;
            }
            System.out.print("\n");
        }
        int num=99871;
        int rev=0,temp=0;
        System.out.println(num);
        while (num>0) {
            temp = num % 10;
            rev = (rev*10) + temp;
            num = num / 10;
        }
        System.out.println(rev);
    }
}