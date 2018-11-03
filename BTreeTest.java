import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BTreeTest {
  @Test
  public void shouldConstructBTree() {
    // BTree btree = new BTree();
    //
    // assertEquals(btree.root, null);
  }

  @Test
  public void shouldAddValueToRootNode() {
    // BTree btree = new BTree();
    // btree.add(2);
    //
    // assertEquals(btree.root.value, 2);
  }

  @Test
  public void shouldAddValueToLeft() {
    BTree btree = new BTree();
    btree.add(10);
    btree.add(4);

    assertEquals(btree.root.value, 4);
    assertEquals(btree.root.left.value, 10);
    assertEquals(btree.root.right, null);
  }
}
