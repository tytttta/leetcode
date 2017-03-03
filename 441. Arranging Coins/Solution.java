public class Solution {
    public int arrangeCoins(int n) {
        long k=(long)Math.sqrt((long)2*n)-1;
        if(n>=(k+1)*k/2 && n<(k+2)*(k+1)/2)
            return (int)k;
        else 
            return (int)k+1;
    }
}