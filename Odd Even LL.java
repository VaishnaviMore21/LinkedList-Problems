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
    public ListNode oddEvenList(ListNode head) {
       ListNode oddHead = new ListNode(-1), oddTail = oddHead;
    ListNode evenHead = new ListNode(-1), evenTail = evenHead;
    ListNode curr = head, temp;
    while (curr!=null)
    {
        // Breaking the Link of the curr Node.
        temp = curr;
        curr = curr.next;
        temp.next = null;

        if (temp.val%2!=0) // If odd Node,append to odd LinkedList
        {
            oddTail.next = temp;
            oddTail = temp;
        }
        else // If Even Node,append to even LinkedList
        {
            evenTail.next = temp;
            evenTail = temp;
        }
    }
    evenTail.next = oddHead.next; 
    // Appending Odd LinkedList at end of EvenLinkedList
    return evenHead.next;
}  
    }
