
public class LinkedListWrapper {
  LinkedListNode head;
  LinkedListNode tail;
  
  LinkedListWrapper(){}
  
  /** Insert into the list and maintain lexicographic order
   * last, first, middle
   */
  public void insert(String fName, String lName, char MI) {
    //base case: first insert
    if(head == null) {
      head = new LinkedListNode(fName, lName, MI);
      tail = head;
      return;
    }
    
    if(head.compareTo(fName, lName, MI) > 0) {
      // make a new node,
      // have head point to it, 
      // and have it point to the current head node. 
      head = new LinkedListNode(fName, lName, MI, head);
      return;
    }
    // otherwise it goes somewhere in the middle (or end) of the list
    LinkedListNode cur = head;
    while(cur.next != null){
      if(cur.next.compareTo(fName, lName, MI) > 0) {
        // insert before current.next
        cur.next = new LinkedListNode(fName, lName, MI, cur.next);
        return;
      }
      cur = cur.next;
    }
    // must be at the end
    tail.next = new LinkedListNode(fName, lName, MI);
    tail = tail.next;
  }
  
  public void insert(String fName, String lName) {
    insert(fName, lName, (char)0);
  }
  
  public void print() {
    LinkedListNode cur = head;
    while(cur != null){
      cur.print();
      cur = cur.next;
    }
  }
  
}
