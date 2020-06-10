package code;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Sedgewick1512Test {

    @Test
    public void shouldFlattenWithPathCompression(){
        int[] sites = new int[9];
        for(int i = 0; i < 9; i++)
            sites[i] = i;
        Sedgewick1512 sedgewick1512 = new Sedgewick1512(sites);
        sedgewick1512.union(0,1);
        assertTrue(arraysAreEqual(new int[]{1,1,2,3,4,5,6,7,8},sedgewick1512.id));
        sedgewick1512.union(0,2);
        assertTrue(arraysAreEqual(new int[]{1,2,2,3,4,5,6,7,8},sedgewick1512.id));
        sedgewick1512.union(0,3);
        assertTrue(arraysAreEqual(new int[]{2,2,3,3,4,5,6,7,8},sedgewick1512.id));
        sedgewick1512.union(0,4);
        assertTrue(arraysAreEqual(new int[]{3,2,3,4,4,5,6,7,8},sedgewick1512.id));
        sedgewick1512.union(0,5);
        assertTrue(arraysAreEqual(new int[]{4,2,3,4,5,5,6,7,8},sedgewick1512.id));

    }

    @Test
    public void shouldFlattenWithImprovedPathCompression(){
        int[] sites = new int[9];
        for(int i = 0; i < 9; i++)
            sites[i] = i;
        Sedgewick1512 sedgewick1512 = new Sedgewick1512(sites);
        sedgewick1512.improvedUnion(0,1);
        assertTrue(arraysAreEqual(new int[]{1,1,2,3,4,5,6,7,8},sedgewick1512.id));
        sedgewick1512.improvedUnion(0,2);
        assertTrue(arraysAreEqual(new int[]{2,2,2,3,4,5,6,7,8},sedgewick1512.id));
        sedgewick1512.improvedUnion(0,3);
        assertTrue(arraysAreEqual(new int[]{3,2,3,3,4,5,6,7,8},sedgewick1512.id));
        sedgewick1512.improvedUnion(0,4);
        assertTrue(arraysAreEqual(new int[]{4,2,3,4,4,5,6,7,8},sedgewick1512.id));
        sedgewick1512.improvedUnion(0,5);
        assertTrue(arraysAreEqual(new int[]{5,2,3,4,5,5,6,7,8},sedgewick1512.id));
        sedgewick1512.improvedUnion(1,6);
        assertTrue(arraysAreEqual(new int[]{5,6,6,6,6,6,6,7,8},sedgewick1512.id));
    }

    private boolean arraysAreEqual(int[] expected, int[] actual){
        for(int i = 0; i < expected.length; i++){
            if(expected[i]!=actual[i]) return false;
        }
        return true;
    }
}
