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
    public int pairSum(ListNode head) {
        ArrayList<ListNode> list = new ArrayList<>();
        for(ListNode temp = head;temp!=null;temp = temp.next){
            list.add(temp);
        }
        int max = 0;
        int i = 0,j = list.size()-1;
        while(i<j){
            int curr = list.get(i).val+list.get(j).val;
            if(curr>max){
                max = curr;
            }
            i++;j--;
        }
        return max;
    }
}