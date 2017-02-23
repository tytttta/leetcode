public class Solution {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        Map<Integer,Integer> map=new HashMap();
        Stack<Integer> st=new Stack();
        for(int i=0;i<nums.length;i++){
            while(!st.empty() && st.peek()<nums[i]){
                map.put(st.pop(),nums[i]);
            }
            st.push(nums[i]);
        }
        int res[]=new int[findNums.length];
        for(int i=0;i<res.length;i++){
            res[i]=map.get(findNums[i])!=null?map.get(findNums[i]):-1;
        }
       return res; 
    }
}