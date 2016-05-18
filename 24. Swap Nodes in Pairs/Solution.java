**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode H=new ListNode(-1);
        H.next=head;
        ListNode L=H;
        while( H.next!=null && H.next.next!=null )
            {
                ListNode l=H.next;
                H.next=l.next;
                l.next=H.next.next;
                H.next.next=l;
                if(H.next.next!=null)
                    H=H.next.next;
                else
                    break;
            }
            return L.next;
    }
}