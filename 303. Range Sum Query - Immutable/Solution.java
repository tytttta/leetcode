public class NumArray {
    private int []nums;

    public NumArray(int[] nums) {
        this.nums=nums;
        
         for(int i=1;i<nums.length;i++)
            nums[i]=nums[i-1]+nums[i];
    }

    public int sumRange(int i, int j) {
        if(i==0)
            return nums[j];
        else
            return nums[j]-nums[i-1];
        
    }
}


// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);