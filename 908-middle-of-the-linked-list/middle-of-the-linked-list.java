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
    public ListNode middleNode(ListNode head) {
        int len=0;
        ListNode mid=head;
        while(head!=null){
            len++;
            head=head.next;
        }
        for(int i=0;i<len/2;i++) mid=mid.next;
        return mid;
    }
}