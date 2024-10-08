

    
class Solution {
    // Function to find first node if the linked list has a loop.
    public static int findFirstNode(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow.data; // Use dot operator instead of arrow
            }
        }
        return -1; // Return -1 instead of null
    }
}
