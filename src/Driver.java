
public class Driver {

  public static void main(String[] args) {
    LinkedListWrapper myList = new LinkedListWrapper();
    
    myList.insert("John", "Public", 'Q');
    
    myList.print(); // tests that inserting 1 element is okay
    System.out.println();
    
    // tests no middle name
    // a second item
    // testing prepend
    myList.insert("John", "Cena");
    myList.print();
    System.out.println();
    
    // tests appending
    myList.insert("John", "Romero");
    myList.print();
    System.out.println();
    
    // test insert middle
    myList.insert("John", "Lennon");
    myList.print();
    System.out.println();
    
    // test insert middle, tied last name
    myList.insert("Karen", "Lennon");
    myList.print();
    System.out.println();
    
    // test insert middle, tied last name and first
    myList.insert("John", "Lennon", 'C');
    myList.print();
    System.out.println();
    
    // test insert middle, prefix match
    myList.insert("John", "Lennen");
    myList.print();
    System.out.println();
    
    // test insert middle, with suffix
    myList.insert("John", "Lennon Jr.");
    myList.print();
    System.out.println();
    
    // test insert middle, same name
    myList.insert("John", "Lennon");
    myList.print();
    System.out.println();
    
    
    // test insert middle, different middle initial
    myList.insert("John", "Lennon", 'D');
    myList.print();
    System.out.println();
  }

}
