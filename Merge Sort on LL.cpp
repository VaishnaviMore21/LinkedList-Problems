
class Solution {
  public:
    // Function to sort the given linked list using Merge Sort.
   Node* mergeTwoSortedLinkedLists(Node* list1, Node* list2) {
    Node* dummyNode = new Node(-1);
    Node* temp = dummyNode;

    while (list1 != nullptr && list2 != nullptr) {
        if (list1->data <= list2->data) {
            temp->next = list1;
            list1 = list1->next;
        } else {
            temp->next = list2;
            list2 = list2->next;
        }
        temp = temp->next;
    }

    if (list1 != nullptr) {
        temp->next = list1;
    } else {
        temp->next = list2;
    }

    return dummyNode->next;
}

// Function to find the middle of a linked list
Node* findMiddle(Node* head) {
    if (head == nullptr || head->next == nullptr) {
        return head;
    }

    Node* slow = head;
    Node* fast = head->next;

    while (fast != nullptr && fast->next != nullptr) {
        slow = slow->next;
        fast = fast->next->next;
    }

    return slow;
}

// Function to perform merge sort on a linked list
Node* mergeSort(Node* head) {
    if (head == nullptr || head->next == nullptr) {
        return head;
    }

    // Find the middle of the list
    Node* mid = findMiddle(head);
    Node* left = head;
    Node* right = mid->next;
    mid->next = nullptr;  // Split the list

    // Recursively sort both halves
    left = mergeSort(left);
    right = mergeSort(right);

    // Merge sorted halves
    return mergeTwoSortedLinkedLists(left, right);
}

// Function to print the linked list

};
