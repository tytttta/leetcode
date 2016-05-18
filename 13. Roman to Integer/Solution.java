public class Solution {
    public int romanToInt(String s) {
        int sum=0;
        int rom[]=new int[100];
        rom['I']=1;rom['V']=5;rom['X']=10;rom['L']=50;rom['C']=100;rom['D']=500;rom['M']=1000;
        
        for(int i=0;i<s.length();i++)
        {
            if(i<s.length()-1 && rom[s.charAt(i)]<rom[s.charAt(i+1)])
                sum-=rom[s.charAt(i)];
            else
                sum+=rom[s.charAt(i)];
        }
        return sum;
        
    }
}