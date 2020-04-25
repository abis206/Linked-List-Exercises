/** 
View Problem: https://practiceit.cs.washington.edu/problem/view/bjp4/chapter16/e21-reverse
*/ 

public void reverse() {
    ListNode prev = null;
    ListNode current = front;
    
    while(current != null) {
        ListNode next = current.next;
        current.next = prev;
        prev = current;
        current = next;
    }
    
    front = prev;
}
