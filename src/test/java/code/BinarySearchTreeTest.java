package code;


import org.junit.Test;


import static org.junit.Assert.*;
public class BinarySearchTreeTest {


    @Test
    public void shouldLocateMinimumToTheLeft(){
        BinarySearchTree<Integer> integerTree = new BinarySearchTree<Integer>();
        integerTree.insert(4);
        integerTree.insert(2);
        integerTree.insert(3);
        integerTree.insert(1);
        assertEquals("1",integerTree.locateMinimum().toString());
    }

    @Test
    public void shouldReturnEmptyNodeIfTreeIsEmpty(){
        BinarySearchTree<Integer> integerTree = new BinarySearchTree<Integer>();
        assertEquals("",integerTree.locateMinimum().toString());
    }

    @Test
    public void shouldRetrieveInOrder(){
        BinarySearchTree<Integer> integerTree = new BinarySearchTree<>();
        integerTree.insert(4);
        integerTree.insert(2);
        integerTree.insert(6);
        integerTree.insert(1);
        integerTree.insert(3);
        integerTree.insert(5);
        integerTree.insert(7);
        integerTree.insert(8);
        integerTree.insert(9);

        assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9]",integerTree.retrieveInOrder().toString());
    }

    @Test
    public void shouldReturnItselfAsMinimumIfOneNode(){
        BinarySearchTree<Integer> integerTree = new BinarySearchTree<>();
        integerTree.insert(4);
        assertEquals("4",integerTree.locateMinimum().toString());
    }

    @Test
    public void shouldReturnMinimumLinearTree(){
        BinarySearchTree<Integer> integerTree = new BinarySearchTree<>();
        integerTree.insert(7);
        integerTree.insert(8);
        integerTree.insert(9);
        assertEquals("7",integerTree.locateMinimum().toString());
    }

    @Test
    public void shouldDeleteMin(){
        BinarySearchTree<Integer> integerTree = new BinarySearchTree<>();
        integerTree.insert(4);
        integerTree.insert(2);
        integerTree.insert(3);
        integerTree.insert(1);
        BinarySearchTree<Integer> expectedTree = new BinarySearchTree<>();
        expectedTree.insert(4);
        expectedTree.insert(2);
        expectedTree.insert(3);


        integerTree.deleteMinimum();
        assertEquals(integerTree.toString(),expectedTree.toString());
    }


}
