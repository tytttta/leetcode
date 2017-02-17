public class Solution {
    public int findComplement(int num) {
        int temp=~0;
        while((temp & num) !=0)
            temp<<=1;
        
        return ~temp ^ num;
        
    }
}