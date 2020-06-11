package code;

import java.util.Random;

public class Sedgewick1517 {



    public static void main(String...args){
        int[] connections = new int[98];
        double[] expected = new double[98];
        for(int i = 2; i<100;i++) {
            connections[i-2] = count(new WeightedQuickUnion(i));
            expected[i-2]=Math.log(i)*i*0.5;
        }
        for(int i = 0; i<expected.length; i++){
            System.out.println(expected[i]+" "+connections[i]);
        }

    }

    public static int count(WeightedQuickUnion weightedQuickUnion){
        int numberOfPairs =0;
        Random random = new Random();
        while(weightedQuickUnion.getCount()>1) {
            int first = random.nextInt(weightedQuickUnion.id.length);
            int second = random.nextInt(weightedQuickUnion.id.length);
            numberOfPairs++;
            if (!weightedQuickUnion.connected(first, second)) {
                weightedQuickUnion.union(first, second);
            }
        }
        return numberOfPairs;
    }




}
