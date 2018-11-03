public class BTree {
  Node root;

  public BTree() {
    this.root = null;
  }

  private Node addRecursive(Node current, int value) {
    System.out.println("addRecursive Value: " + value);
    if (current == null) {
      System.out.println("addRecursive if null");
      return new Node(value);
    }

    System.out.println("addRecursive curr.value: " + current.value);

    if (value < current.value) {
      System.out.println("addRecursive if curr.value > value");
      current = addRecursive(current.left, value);
    } else if (value > current.value) {
      System.out.println("addRecursive else if curr.value < value");
      current = addRecursive(current.right, value);
    } else {
      return current;
    }

    System.out.println("addRecursive return current");

    return current;
  }

  public void add(int value) {
    this.root = this.addRecursive(this.root, value);
  }
}
