/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode H=head;
        while(H!=null)
        {
            if( H.next==null)   
                break;
                
            if(H.val==H.next.val)
                H.next=H.next.next;
            else
                H=H.next;
        }
        return head;
    }
}