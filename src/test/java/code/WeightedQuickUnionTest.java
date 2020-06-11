package code;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class WeightedQuickUnionTest {

    @Test
    public void shouldJoinSmallerTreeToLargerTree(){
        WeightedQuickUnion weightedQuickUnion = new WeightedQuickUnion(10);
        weightedQuickUnion.union(5,4);
        assertTrue(arraysAreEqual(new int[]{0,1,2,3,4,4,6,7,8,9},weightedQuickUnion.id));
        weightedQuickUnion.union(6,8);
        assertTrue(arraysAreEqual(new int[]{0,1,2,3,4,4,8,7,8,9},weightedQuickUnion.id));
        weightedQuickUnion.union(0,5);
        assertTrue(arraysAreEqual(new int[]{4,1,2,3,4,4,8,7,8,9},weightedQuickUnion.id));
        weightedQuickUnion.union(7,3);
        assertTrue(arraysAreEqual(new int[]{4,1,2,3,4,4,8,3,8,9},weightedQuickUnion.id));
        weightedQuickUnion.union(6,9);
        assertTrue(arraysAreEqual(new int[]{4,1,2,3,4,4,8,3,8,8},weightedQuickUnion.id));
        weightedQuickUnion.union(4,2);
        assertTrue(arraysAreEqual(new int[]{4,1,4,3,4,4,8,3,8,8},weightedQuickUnion.id));
        weightedQuickUnion.union(3,0);
        assertTrue(arraysAreEqual(new int[]{4,1,4,4,4,4,8,3,8,8},weightedQuickUnion.id));
        weightedQuickUnion.union(8,7);
        assertTrue(arraysAreEqual(new int[]{4,1,4,4,4,4,8,3,4,8},weightedQuickUnion.id));
        weightedQuickUnion.union(3,1);
        assertTrue(arraysAreEqual(new int[]{4,4,4,4,4,4,8,3,4,8},weightedQuickUnion.id));
    }

    private boolean arraysAreEqual(int[] expected, int[] actual){
        for(int i = 0; i < expected.length; i++){
            if(expected[i]!=actual[i]) return false;
        }
        return true;
    }
}
