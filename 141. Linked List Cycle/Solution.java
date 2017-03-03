public class Solution {
    public boolean hasCycle(ListNode head) {
        /*
        Here ,if the condition is if(head==null || head.next==null ) it will time limited.
        */
        if(head==null ){
            return false;
        }
        ListNode l1=head;
        ListNode l2=head;
        while(l2.next!=null && l2.next.next!=null){
            l1=l1.next;
            l2=l2.next.next;
            if(l1==l2){
                return true;
            }
        }
        return false;
    }
}