public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int  max=0;
        int len=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                len++;
            }
            else
            {
                max=Math.max(max,len);
                len=0;
            }
        }
        max=Math.max(max,len);
        return max;
        
    }
}