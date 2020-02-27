package code;


import org.junit.Test;
import static org.junit.Assert.*;
public class BinarySearchTreeTest {

    @Test
    public void shouldLocateMinimumToTheRight(){
        BinarySearchTree<Integer> integerTree = new BinarySearchTree<Integer>();
        integerTree.insert(4);
        integerTree.insert(2);
        integerTree.insert(3);
        assertEquals("3",integerTree.locateMinimum().toString());
    }

    @Test
    public void shouldLocateMinimumToTheLeft(){
        BinarySearchTree<Integer> integerTree = new BinarySearchTree<Integer>();
        integerTree.insert(4);
        integerTree.insert(2);
        integerTree.insert(3);
        integerTree.insert(1);
        assertEquals("1",integerTree.locateMinimum().toString());
    }

}
