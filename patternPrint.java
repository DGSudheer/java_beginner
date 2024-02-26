public class patternPrint{
    public static void main(String[] args) {
        int i,j;
        int n=10;
        for(i=0;i<n;i++){
            j=0;
            while(j<n-i){
                System.out.print('*');
                j++;
            }
            System.out.print("\n");
        }
    }
}