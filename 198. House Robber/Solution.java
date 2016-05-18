public class Solution {
    public int rob(int[] nums) {
        if(nums.length==0)
            return 0;
        int [] sum=new int[nums.length+1];
        for(int i=1;i<=nums.length;i++)
        {
            if(i==1)
                sum[i]=nums[i-1];
            else
                sum[i]=Math.max(sum[i-1],sum[i-2]+nums[i-1]);
        }
        return sum[nums.length];
    }
}