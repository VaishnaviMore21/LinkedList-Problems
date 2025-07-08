public class Solution {
    public static void deleteAlternateNodes(Node<Integer> head) {
        Node<Integer> current = head;

        while (current != null && current.next != null) {
            // Delete the next node (alternate node)
            current.next = current.next.next;

            // Move to the next valid node (skip the deleted one)
            current = current.next;
        }
    }
}
