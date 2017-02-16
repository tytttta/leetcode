public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res=new StringBuilder();
        int temp=0;
        int carry=0;
        int i=a.length()-1;
        int j=b.length()-1;
        while(i>=0 || j>=0){
            temp=carry;
            if(i>=0)
                temp+=a.charAt(i--)-'0';
            if(j>=0)
                temp+=b.charAt(j--)-'0';
            res.insert(0,temp%2);
            carry=temp/2;
        }
        if(carry==1)
            res.insert(0,1);
        return res.toString();
    }
}