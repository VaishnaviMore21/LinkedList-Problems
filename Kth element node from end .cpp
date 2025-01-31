class Solution {
  public:
    int getKthFromLast(Node *head, int k) {
        // Your code here
    Node* fastp = head;
    Node* slowp = head;
    for(int i=0;i<k;i++)
    {
        if (fastp == nullptr) return -1; 
        fastp=fastp->next;
    }
    while(fastp != nullptr )
    {
        fastp=fastp->next;
        slowp=slowp->next;
    }
  
     return slowp->data;
    
    }
};
