class Intersect {
    static int getDifference(Node head1,Node head2) {
     int len1 = 0,len2 = 0;
        while(head1 != null || head2 != null) {
            if(head1 != null) {
                ++len1; head1 = head1.next;
            }
            if(head2 != null) {
                ++len2; head2 = head2.next;
            }
            
        }
        return len1-len2;//if difference is neg-> length of list2 > length of list1 else vice-versa
}
    // Function to find intersection point in Y shaped Linked Lists.
    static Node intersectPoint(Node head1,Node head2) {
   int diff = getDifference(head1,head2);
        if(diff < 0) 
            while(diff++ != 0) head2 = head2.next; 
        else while(diff-- != 0) head1 = head1.next;
        while(head1 != null) {
            if(head1 == head2) return head1;
            head2 = head2.next;
            head1 = head1.next;
        }
        return head1;

}
