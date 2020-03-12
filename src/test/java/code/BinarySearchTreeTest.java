package code;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    public void shouldBeEmptyIfAllRemoved(){
        BinarySearchTree<Integer> integerTree = new BinarySearchTree<>();
        integerTree.insert(4);
        integerTree.insert(2);
        integerTree.insert(3);
        integerTree.insert(1);
        integerTree.insert(8);
        integerTree.insert(5);
        integerTree.insert(10);

        integerTree.deleteNode(8);
        integerTree.deleteNode(3);
        integerTree.deleteNode(5);
        integerTree.deleteNode(1);
        integerTree.deleteNode(10);
        integerTree.deleteNode(2);
        integerTree.deleteNode(4);

        assertEquals(integerTree.size(),0);
        assertEquals(integerTree.toString(), " ");

    }

    @Test
    public void shouldBeAbleToRemoveAndAddAlternatively(){
        BinarySearchTree<Integer> integerTree = new BinarySearchTree<>();
        integerTree.insert(4);
        integerTree.deleteNode(4);
        integerTree.insert(2);
        integerTree.insert(1);
        integerTree.deleteNode(2);

        assertEquals(integerTree.size(),1);
        assertEquals(integerTree.toString(), "1\n");

    }

    @Test
    public void shouldReturnLeftTreeWhenDeletingIfNoRighTree(){
        BinarySearchTree<Integer> integerTree = new BinarySearchTree<>();
        integerTree.insert(4);
        integerTree.insert(3);
        integerTree.insert(2);
        integerTree.insert(1);
        integerTree.insert(5);
        integerTree.insert(6);
        integerTree.insert(7);
        integerTree.deleteNode(5);
        integerTree.deleteNode(7);
        integerTree.deleteNode(6);
        integerTree.deleteNode(4);

        BinarySearchTree<Integer> expectedTree = new BinarySearchTree<>();
        expectedTree.insert(3);
        expectedTree.insert(2);
        expectedTree.insert(1);

        assertEquals(expectedTree.toString(),integerTree.toString());

    }

    @Test
    public void shouldGetElement(){
        BinarySearchTree<Integer> integerTree = new BinarySearchTree<>();
        integerTree.insert(4);
        integerTree.insert(3);
        integerTree.insert(2);
        integerTree.insert(1);
        integerTree.insert(5);
        integerTree.insert(6);
        integerTree.insert(7);

        assertEquals("7",integerTree.get(7).toString());
        assertEquals(integerTree.size(),7);

    }

    @Test
    public void shouldPrintNonRecursively() {
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
        assertEquals("1234589101315",integerTree.nonRecursiveTreeTraversal());
    }

    @Test
    public void shouldGetNonRecursively(){
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

        assertEquals("13",integerTree.nonRecursiveGet(13).toString());
        assertEquals("",integerTree.nonRecursiveGet(25).toString());
    }

    @Test
    public void shouldReturnNodesWithinRange(){
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

        List<BinarySearchTree.Node<Integer>> expected = new ArrayList<>();
        expected.add(new BinarySearchTree.Node<>(4));
        expected.add(new BinarySearchTree.Node<>(5));
        expected.add(new BinarySearchTree.Node<>(8));
        expected.add(new BinarySearchTree.Node<>(9));
        expected.add(new BinarySearchTree.Node<>(10));
        List<BinarySearchTree.Node<Integer>> actual=integerTree.range(4,10);
        assertEquals(expected.toString(),actual.toString());
    }


}
