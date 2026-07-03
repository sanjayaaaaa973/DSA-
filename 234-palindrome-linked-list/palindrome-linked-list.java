/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {

        ListNode f=head;
        ListNode s=head;

        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }

        if(f!=null){
            s=s.next;
        }

        s=reverseList(s);
        f=head;

        while(s!=null){
            if(f.val!=s.val){
                return false;

            }

            f=f.next;
            s=s.next;
        }

        return true;


        
    }

    private ListNode reverseList(ListNode head){
       if(head==null){
            return head;
        }

        if(head.next==null){
            return head;
        }

        ListNode pnode=null;
        ListNode cnode=head;

        while(cnode!=null){
            ListNode nnode=cnode.next;
            cnode.next=pnode;
            pnode=cnode;
            cnode=nnode;
        }
        head=pnode;

        return head;

    }
}