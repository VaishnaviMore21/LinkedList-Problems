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

  ListNode mergeTwoSortedLinkedLists(ListNode list1, ListNode list2) {
        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode;

        while (list1 != null && list2 != null) {
            // Compare elements of both lists and link the smaller node
            if (list1.val <= list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            // Move the temporary pointer to the next node
            temp = temp.next;
        }

        // Attach the remaining elements of list1 or list2
        if (list1 != null) {
            temp.next = list1;
        } else {
            temp.next = list2;
        }

        // Return the merged list starting from the next of the dummy node
        return dummyNode.next;
    }
   ListNode findMiddle(ListNode head)
   {
    {
       if (head == null || head.next == null) {
        return head;
    }
         ListNode slow = head;
    ListNode fast = head.next;

    // Move the fast pointer twice
    // as fast as the slow pointer
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    
    // When the fast pointer reaches the end,
    // the slow pointer will be at the middle
    return slow;
    }
   }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode middle=findMiddle(head);
        ListNode right=middle.next;
        middle.next=null;
        ListNode left=head;

        left=sortList(left);
        right=sortList(right);
        return mergeTwoSortedLinkedLists(left, right);
    }
}
