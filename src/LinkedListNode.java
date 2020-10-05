
public class LinkedListNode {
  public String LastName;
  public String FirstName;
  public char MiddleInitial; 
  public LinkedListNode next;
  
  LinkedListNode(){}
  
  LinkedListNode(String inFname, String inLname){
    FirstName = inFname;
    this.LastName = inLname;
  }
  
  LinkedListNode(String inFname, String inLname, char inMI){
    FirstName = inFname;
    this.LastName = inLname;
    MiddleInitial = inMI;
  }
  LinkedListNode(String inFname, String inLname, LinkedListNode next){
    FirstName = inFname;
    this.LastName = inLname;
    this.next = next;
  }
  
  LinkedListNode(String inFname, String inLname, char inMI, LinkedListNode next){
    FirstName = inFname;
    this.LastName = inLname;
    MiddleInitial = inMI;
    this.next = next;
  }
  
  public int compareTo(String fName, String lName, char MI) {
    int lNameCompare = LastName.compareTo(lName);
    if(lNameCompare != 0) return lNameCompare;
    
    int fNameCompare = FirstName.compareTo(fName);
    if(fNameCompare != 0) return fNameCompare;
    
    return MiddleInitial-MI; 
  }
  
  public void print() {
    System.out.println(LastName + ", " + FirstName + " " + MiddleInitial);
  }
  
}
