public class Solution {
    public boolean repeatedSubstringPattern(String str) {
        int len=str.length();
        for(int i=len/2;i>=1;i--){
            if(len%i==0){
                int j=len/i;
                String temp=str.substring(0,i);
                StringBuilder sb=new StringBuilder();
                for(int k=0;k<j;k++)
                    sb.append(temp);
                    
                if(sb.toString().equals(str))
                    return true;
                
            }
        }
        return false;
        
    }
}