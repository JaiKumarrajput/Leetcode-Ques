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
    public ListNode doubleIt(ListNode head) {

    ArrayList<Integer> arr = new ArrayList<>();
    ListNode node = head;

    while(node != null){
        arr.add(node.val);
        node = node.next;
    }

    int c = 0;
    ListNode n = null;

    for(int i = arr.size()-1; i>=0; i--){
        int s = (arr.get(i) * 2) + c;
        c = s/10;
        ListNode nxt = new ListNode(s%10);
        nxt.next = n;
        n = nxt;
    }

    if (c > 0) {
        ListNode cnode = new ListNode(c);
        cnode.next = n;
        n = cnode;
    }

    return n;
        
    }
}