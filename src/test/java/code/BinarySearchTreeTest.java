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

    @Test
    public void shouldDeleteNodesWithoutChildren(){
        BinarySearchTree<Integer> integerTree = new BinarySearchTree<>();
        integerTree.insert(4);
        integerTree.insert(2);
        integerTree.insert(3);
        integerTree.insert(1);
        BinarySearchTree<Integer> expectedTree = new BinarySearchTree<>();
        expectedTree.insert(4);
        expectedTree.insert(2);
        expectedTree.insert(1);


        integerTree.deleteNode(3);
        assertEquals(expectedTree.toString(),integerTree.toString());

    }

    @Test
    public void shouldDeleteNodeWithTwoChildren(){
        BinarySearchTree<Integer> integerTree = new BinarySearchTree<>();
        integerTree.insert(4);
        integerTree.insert(2);
        integerTree.insert(3);
        integerTree.insert(1);
        integerTree.insert(8);
        integerTree.insert(5);
        integerTree.insert(10);
        integerTree.insert(9);
        integerTree.insert(13);
        integerTree.insert(15);

        BinarySearchTree<Integer> expectedTree = new BinarySearchTree<>();
        expectedTree.insert(4);
        expectedTree.insert(2);
        expectedTree.insert(3);
        expectedTree.insert(1);
        expectedTree.insert(8);
        expectedTree.insert(5);
        expectedTree.insert(13);
        expectedTree.insert(9);
        expectedTree.insert(15);


        integerTree.deleteNode(10);

        integerTree.toString();
        assertEquals(expectedTree.toString(),integerTree.toString());



    }

    @Test
    public void shouldReturnRootNodeIfNodeNotInTree(){
        BinarySearchTree<Integer> integerTree = new BinarySearchTree<>();
        integerTree.insert(4);
        integerTree.insert(2);
        integerTree.insert(3);
        integerTree.insert(1);
        integerTree.insert(8);
        integerTree.insert(5);
        integerTree.insert(10);
        integerTree.insert(9);
        integerTree.insert(13);
        integerTree.insert(15);

        BinarySearchTree<Integer> expectedTree = new BinarySearchTree();
        expectedTree.insert(4);
        expectedTree.insert(2);
        expectedTree.insert(3);
        expectedTree.insert(1);
        expectedTree.insert(8);
        expectedTree.insert(5);
        expectedTree.insert(10);
        expectedTree.insert(9);
        expectedTree.insert(13);
        expectedTree.insert(15);


        assertEquals("4",integerTree.deleteNode(100).toString());
        assertEquals(integerTree.toString(),expectedTree.toString());
    }

    @Test
    public void shouldDeleteNodeTwoChildrenUpdateBothChildrenTimes(){
        BinarySearchTree<Integer> integerTree = new BinarySearchTree<>();
        integerTree.insert(4);
        integerTree.insert(2);
        integerTree.insert(3);
        integerTree.insert(1);
        integerTree.insert(8);
        integerTree.insert(5);
        integerTree.insert(10);
        integerTree.insert(9);
        integerTree.insert(13);
        integerTree.insert(15);

        System.out.println(integerTree.toString());

        integerTree.deleteNode(8);

        System.out.println(integerTree.toString());

        BinarySearchTree<Integer> expectedTree = new BinarySearchTree();
        expectedTree.insert(4);
        expectedTree.insert(2);
        expectedTree.insert(1);
        expectedTree.insert(3);
        expectedTree.insert(9);
        expectedTree.insert(5);
        expectedTree.insert(10);
        expectedTree.insert(13);
        expectedTree.insert(15);

        assertEquals(integerTree.toString(),expectedTree.toString());
    }


}
