public class Node {
  private int val;
  private int next;
  
  public Node(int val) {
    this.val = val;
    this.next = null;
  }

  public static void main(String[] args) {
    Node a = new Node(1);
    Node b = new Node(2);
    Node c = new Node(3);
    Node d = new Node(4);

    // Node a is pointing to b
    a.next = b;
    b.next = c;
    c.next = d;
    // 1 -> 2 -> 3 -> 4 -> null (bc of the default value in the constructor but it's the same as nothing)
  }
}