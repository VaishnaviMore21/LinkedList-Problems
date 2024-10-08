

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
     public ListNode reverseLinkedList(ListNode head) {
        // Check if the list is empty or has only one node
        if (head == null || head.next == null) {

            // No change is needed;
            // return the current head
            return head;
        }

        // Recursive step: Reverse the remaining
        // part of the list and get the new head
        ListNode newHead = reverseLinkedList(head.next);

        // Store the next node in 'front'
        // to reverse the link
        ListNode front = head.next;

        // Update the 'next' pointer of 'front' to
        // point to the current head, effectively
        // reversing the link direction
        front.next = head;

        // Set the 'next' pointer of the
        // current head to 'null' to
        // break the original link
        head.next = null;

        // Return the new head obtained
        // from the recursion
        return newHead;
    }

    public boolean isPalindrome(ListNode head) {
            
if (head == null || head.next == null) {
            // It's a palindrome by definition
            return true;
        }
    ListNode slow=head;
    ListNode fast=head;
    while(fast.next!=null && fast.next.next!=null)
    {
        slow=slow.next;
        fast=fast.next.next;
    }
     // Reverse the second half of the 
        // linked list starting from the middle
     ListNode newHead = reverseLinkedList(slow.next);
    
        // Pointer to the first half
        ListNode first = head;


        ListNode second = newHead;
         while (second != null) {
            // Compare data values of
            // nodes from both halves
    
            // If values do not match, the
            // list is not a palindrome
            if (first.val != second.val) {
                 reverseLinkedList(newHead);
    
                // Not a palindrome
                return false;
            }
             first = first.next;
    
            // Move the second pointer
            second = second.next;
         }
          reverseLinkedList(newHead);
    
        // The linked list is a palindrome
        return true;

    }
}

