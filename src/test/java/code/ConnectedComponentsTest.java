package code;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ConnectedComponentsTest {

    @Test
    public void shouldInitializeCorrectly(){
        int[][] matrix = new int[2][2];
        ConnectedComponents connectedComponents = new ConnectedComponents(matrix);
        assertEquals(connectedComponents.getArray().length,4);
        assertEquals(connectedComponents.getSizes().length,4);
        assertEquals(connectedComponents.getArray()[0],0);
        assertEquals(connectedComponents.getArray()[3],3);
        assertEquals(connectedComponents.getSizes()[0],1);
        assertEquals(connectedComponents.getSizes()[3],1);
    }

    @Test
    public void shouldPerformUnion(){
        int[][] matrix = new int[2][5];
        ConnectedComponents connectedComponents = new ConnectedComponents(matrix);
        connectedComponents.union(9,2);
        assertEquals(connectedComponents.getSizes()[9],2);
        assertEquals(connectedComponents.getArray()[2],9);
        assertEquals(connectedComponents.getArray()[9],9);
        assertEquals(connectedComponents.root(2),9);
        connectedComponents.union(4,9);
        assertEquals(connectedComponents.getSizes()[9],3);
        assertEquals(connectedComponents.root(4),9);
        assertTrue(connectedComponents.connected(2,4));
        connectedComponents.union(4,3);
        assertEquals(connectedComponents.getSizes()[9],4);
        assertEquals(connectedComponents.root(3),9);
        assertTrue(connectedComponents.connected(3,2));
        connectedComponents.union(6,5);
        assertFalse(connectedComponents.connected(5,2));
        connectedComponents.union(6,9);
        assertTrue(connectedComponents.connected(6,2));
        assertEquals(connectedComponents.getSizes()[9],6);
    }

    @Test
    public void shouldDetectConnectionBetweenOnes(){
        int[][] matrix= new int[4][5];
        matrix[0][0]=1;
        matrix[0][1]=1;
        matrix[0][2]=1;
        matrix[0][3]=1;
        matrix[1][0]=1;
        matrix[1][1]=1;
        matrix[1][3]=1;
        matrix[2][0]=1;
        matrix[2][1]=1;
        matrix[2][2]=1;
        matrix[3][3]=1;
        ConnectedComponents connectedComponents = new ConnectedComponents(matrix);
        assertTrue(connectedComponents.connected(3,11));
        assertFalse(connectedComponents.connected(3,18));
        assertFalse(connectedComponents.connected(new int[]{0,3},new int[]{3,3}));
    }

}
