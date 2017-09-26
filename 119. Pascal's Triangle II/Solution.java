public class Solution {
    public List<Integer> getRow(int rowIndex) {
        if(rowIndex==0){
            List<Integer> al=new ArrayList();
            al.add(1);
            return  al;
        }
        else{
            List<Integer> al=getRow(rowIndex -1);
            al.add(0,0);
            al.add(al.size(),0);
            List<Integer> ans=new ArrayList();
            for(int i=0;i+1<al.size();i++){
                ans.add(al.get(i)+al.get(i+1));
            }
            return ans;
        }
        
    }
}