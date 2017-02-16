public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len=0;
        int j=0;
        int[] arr=new int [128];
        for(int i=0;i<arr.length;i++)
            arr[i]=-1;
        for (int i=0;i<s.length();i++){
            j=Math.max(arr[s.charAt(i)]+1,j);
            arr[s.charAt(i)]=i;
            len=Math.max(len,i-j+1);
        }
        return len;
    }
}