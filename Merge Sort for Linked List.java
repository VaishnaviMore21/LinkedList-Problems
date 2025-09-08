/*
class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}
*/

class Solution {
    public Node mergeSort(Node head) {
        // code here
            // Base case: 0 or 1 element
        if (head == null || head.next == null) {
            return head;
        }
        
        Node middle=getMiddle(head);
        Node nextOfMiddle=middle.next;
        middle.next=null;
         // 2. Recursively sort each half
        Node left = mergeSort(head);
        Node right = mergeSort(nextOfMiddle);

        // 3. Merge the two sorted halves
        return sortedMerge(left, right);
    }
    static Node sortedMerge(Node a, Node b) {
        if (a == null) return b;
        if (b == null) return a;

        Node result;
        if (a.data <= b.data) {
            result = a;
            result.next = sortedMerge(a.next, b);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;
    }
    static Node getMiddle(Node head) {
        if (head == null) return head;

        Node slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // slow is at the midpoint
    }
}
