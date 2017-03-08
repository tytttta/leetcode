public class Solution {
    public int maxSubArray(int[] nums) {
        int res[]=new int[nums.length];
        res[0]=nums[0];
        int max=res[0];
        for(int i=1;i<nums.length;i++){
            res[i]=nums[i]+(res[i-1]>0?res[i-1]:0);
            max=Math.max(max,res[i]);
        }
       return max; 
    }
}