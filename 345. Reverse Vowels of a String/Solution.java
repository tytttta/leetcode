public class Solution {
    public String reverseVowels(String s) {
        int i=0,j=s.length()-1;
        char []ch=s.toCharArray();
        String str="aoeiuAOEIU";
        while(i<j)
        {
            if((str.contains(s.charAt(i)+"")) && (str.contains(s.charAt(j)+"")) )
            {
                char t=ch[i];
                ch[i]=ch[j];
                ch[j]=t;
                i++;
                j--;
            }
            else if(str.contains(s.charAt(i)+"") )
            {
                j--;
            }
            
            else if(str.contains(s.charAt(j)+"") )
            {
                i++;
            }
            else
            {
                i++;
                j--;
            }
                
        }
        return new String(ch);
    }
}