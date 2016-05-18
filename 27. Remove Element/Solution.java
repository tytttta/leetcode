public class Solution {
    public int removeElement(int[] nums, int val) {
        int len=nums.length-1;
        int i=0;
        while(i<len)
        {
            while(i<len &&nums[len]==val)
                len--;
            while(i<len && nums[i]!=val)
                i++;
            int temp=nums[i];
            nums[i]=nums[len];
            nums[len]=temp;
        }
        if(len>0 && nums[len]==val )
            len--;
        else if(len==0 && nums[len]==val)
            return 0;
        return len+1;
        
    }
}