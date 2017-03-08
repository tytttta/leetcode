public class Solution {
    public boolean isPalindrome(int x) {
        int res=0;
        int temp=Math.abs(x);
        while(x!=0){
            res=res*10+x%10;
            x/=10;
        }
        return res==temp;
    }
}