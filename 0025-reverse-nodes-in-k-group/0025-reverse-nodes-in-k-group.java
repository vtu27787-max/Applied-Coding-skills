class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        int count = 0;

        // Check if there are at least k nodes
        while (curr != null && count < k) {
            curr = curr.next;
            count++;
        }

        // Fewer than k nodes: leave them unchanged
        if (count < k) {
            return head;
        }

        // Reverse k nodes
        curr = head;
        ListNode prev = null;

        for (int i = 0; i < k; i++) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // head is now the end of this reversed group
        head.next = reverseKGroup(curr, k);

        return prev;
    }
}