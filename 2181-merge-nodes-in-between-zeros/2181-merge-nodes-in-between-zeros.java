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
    public ListNode mergeNodes(ListNode head) {
        int sum = 0;
        ListNode ans = new ListNode(-1);
        ListNode temp = head;
        ListNode tmp = ans;
        while(temp!=null){
            if(temp.val == 0){
                tmp.next = new ListNode(sum);
                sum = 0;
                tmp = tmp.next;
            }
            else{
                sum+=temp.val;
            }
            temp = temp.next;
        }
        return ans.next.next;
    }
}