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
    public ListNode reverseList(ListNode head) {
        //Recursive Solution
        if(head == null || head.next == null){
            return head;
        }

        ListNode p = reverseList(head.next);

        head.next.next = head;
        head.next = null;

        return p;
    }
}