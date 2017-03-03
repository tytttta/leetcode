public class Solution {
    public int[] plusOne(int[] digits) {
        int carry=1;
        for(int i=digits.length-1;i>=0;i--){
            digits[i]+=carry;
            carry=0;
            if(digits[i]==10 && i!=0){
                carry=1;
                digits[i]-=10;
            }
        }
        int len=digits[0]==10?digits.length+1:digits.length;
        int []res=new int[len];
        for(int i=0;i<len;i++){
            if(digits[0]!=10 ){
                res[i]=digits[i];
            }
            else{
                res[0]=1;
                res[1]=0;
                if(i>=2){
                    res[i]=digits[i-1];
                }
            }
        }
        return res;
    }
}