class Main {
  public static void main(String[] args) {
    System.out.println("Hello world and GitHub!");
    Node a = new Node(1);
    Node b = new Node(2);
    Node c = new Node(3);
    Node d = new Node(4);

    // Node a is pointing to b
    a.next = b;
    b.next = c;
    c.next = d;
    // 1 -> 2 -> 3 -> 4 -> null (bc of the default value in the constructor but it's the same as nothing)

    Node.printLinkedList(a);
    Node.printLinkedListRecursively(a);
  }
}