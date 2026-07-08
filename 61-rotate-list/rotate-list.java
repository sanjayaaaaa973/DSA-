class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || k == 0) {
            return head;
        }

        int len = 1;
        ListNode tail = head;

        while (tail.next != null) {
            tail = tail.next;
            len++;
        }

        if (k % len == 0) {
            return head;
        }

        k = k % len;

        tail.next = head;

        ListNode newnode = findNnode(head, len - k);

        head = newnode.next;
        newnode.next = null;

        return head;
    }

    public ListNode findNnode(ListNode temp, int k) {

        int cnt = 1;

        while (temp != null) {
            if (cnt == k) {
                return temp;
            }

            cnt++;
            temp = temp.next;
        }

        return temp;
    }
}