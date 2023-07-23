public class Node {
  public int val;
  public Node next;
  
  public Node(int val) {
    this.val = val;
    this.next = null;
  }

  public static void printLinkedList(Node head) {
    Node current = head;

    while (current != null) {
      System.out.println(current.val);
      current = current.next;
    }
  }

  public static void printLinkedListRecursively(Node head) {
    // base case 
    if (head == null) {
      return;
    }

    System.out.println(head.val);
    printLinkedListRecursively(head.next);
  }

  public static void main(String[] args) {
    
  }
}