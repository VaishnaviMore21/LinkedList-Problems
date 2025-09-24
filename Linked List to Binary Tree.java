/*
class NodeLL {
    int data;
    NodeLL next;

    NodeLL(int x) {
        data = x;
        next = null;
    }
}

class Node {
    int data;
    Node left, right;

    Node(int x) {
        data = x;
        left = right = null;
    }
}
*/
class Solution {
    public Node linkedListToBinaryTree(NodeLL head) {
        // code here
        
        if (head == null) return null;

        // First linked list node becomes root of tree
        Node root = new Node(head.data);
        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        // Move to next LL node
        NodeLL curr = head.next;

        // Build tree level-order
        while (curr != null) {
            Node parent = q.poll();

            // Left child
            Node leftChild = new Node(curr.data);
            parent.left = leftChild;
            q.offer(leftChild);
            curr = curr.next;
            if (curr == null) break;

            // Right child
            Node rightChild = new Node(curr.data);
            parent.right = rightChild;
            q.offer(rightChild);
            curr = curr.next;
        }

        return root;
    
    }
}
