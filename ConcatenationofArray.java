public class ConcatenationofArray {
    public int[] getConcatenation(int[] nums) {
        int i=0; 
        int n = nums.length;
        int[] ans = new int[2*n];
        while(i<n){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
            i++;
        }
        return ans;
    }
}
