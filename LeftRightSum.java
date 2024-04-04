public class LeftRightSum {
    public int[] leftRightDifference(int[] nums) {
        // int[] ls= new int[nums.length];
        // int[] rs= new int[nums.length];
        int[] ans= new int[nums.length];
        int l,r,s,i,j,k;
        for(i=0;i<nums.length;i++){
            l=0;r=0;j=i+1;k=i-1;
            while(j<nums.length){r+=nums[j];j++;}
            while(k>=0){l+=nums[k];k--;}
            ans[i]=Math.abs(l-r);
        }
        return ans;
    }
}
