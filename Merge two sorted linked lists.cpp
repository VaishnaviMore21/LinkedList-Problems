
class Solution {
  public:
    Node* sortedMerge(Node* list1, Node* list2) {
        // code here
         Node* dummyNode = new Node(-1);
    Node* temp = dummyNode;
    while(list1!=nullptr && list2!=nullptr)
    {
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
    // Return the merged list starting 
    // from the next of the dummy node
    return dummyNode->next;
    }
};

