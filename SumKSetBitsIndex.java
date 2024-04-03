import java.util.List;

public class SumKSetBitsIndex {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int f,c,ans=0;
        for(int i=0;i<nums.size();i++){
            f=i;c=0;
            while(f>0){
                if((f&1)==1)
                    c+=1;
                f >>= 1;
            }
            if(c==k)
                ans+=nums.get(i);
        }
        return ans;
    }

    // public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
    //     int sum = 0;
    //     for(int i=0; i<nums.size(); i++){
    //         if(Integer.bitCount(i) == k){
    //             sum += nums.get(i);
    //         }
    //     }
    //     return sum;
    // }

    // public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
    //     int sum = 0;
    //     for(int i=0; i<nums.size(); i++){
    //         if(getBitCount(i) == k){
    //             sum += nums.get(i);
    //         }
    //     }
    //     return sum;
    // }
    // // If u don't want to use inbuilt method then Build ur Own
    // int getBitCount(int number){
    //     int bitCount = 0;
    //         while (number > 0) {
    //             if (number % 2 == 1) {
    //                 bitCount++;
    //             }
    //             number /= 2 ;
    //         }
    //     return bitCount;
    // }
}
