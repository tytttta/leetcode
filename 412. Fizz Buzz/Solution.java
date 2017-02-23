public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> al=new ArrayList();
        for(int i=1;i<=n;i++){
            if(i%15==0)
                al.add("FizzBuzz");
            else if(i%5==0)
                al.add("Buzz");
            else if(i%3==0)
                al.add("Fizz");
            else
                al.add(i+"");
        }
        return al;
    }
}