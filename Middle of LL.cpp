class Solution {
public:
    ListNode* middleNode(ListNode* head) {
     // Initialize two pointers: slow and fast
        ListNode *slow = head; // Slow pointer moves one step at a time
        ListNode *fast = head; // Fast pointer moves two steps at a time

        // Traverse the list until fast pointer reaches the end or there is no next node
        while (fast != NULL && fast->next != NULL) {
            slow = slow->next;         // Move the slow pointer one step
            fast = fast->next->next;  // Move the fast pointer two steps
        }

        // When the loop ends, the slow pointer will be at the middle of the list
        return slow; 
};
