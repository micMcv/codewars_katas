class Node {

  int data;
  Node next = null;
  
  Node(final int data) {
    this.data = data;
  }
  
  public static Node push(final Node head, final int data) {
    Node newNode = new Node(data);
    newNode.next = head;  
    return newNode;
  }
  
  public static Node buildOneTwoThree() {
    return push(push(push(null, 3), 2), 1);
  }
}
