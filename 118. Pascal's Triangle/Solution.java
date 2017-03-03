public class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows==0)
            return new ArrayList();
        int [][]arr=new int[numRows][numRows];
        List<List<Integer>> L=new ArrayList();
        arr[0][0]=1;
        for(int i=1;i<numRows;i++){
            for(int j=0;j<=i;j++){
                if(j==0 || j==numRows-1){
                    arr[i][j]=1;
                }
                else{
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                }
            }
        }
        for(int i=0;i<numRows;i++){
        	List<Integer> al=new ArrayList();
            for(int j=0;j<numRows;j++){
                if(arr[i][j]!=0){
                	al.add(arr[i][j]);
                }
            }
            L.add(al);
        
        }
        return L;
    }
}