package code;

import java.util.Random;

public class Sedgewick1517 {



    public static void main(String...args){
        WeightedQuickUnion weightedQuickUnion = new WeightedQuickUnion(10);
        int connections = count(weightedQuickUnion,10);
        System.out.println(connections);
    }

    private static int count(WeightedQuickUnion weightedQuickUnion,int  N){
        int numberOfConnections =0;
        Random random = new Random();
        while(weightedQuickUnion.getCount()!=0) {
            int first = random.nextInt(N);
            int second = random.nextInt(N);

            if (!weightedQuickUnion.connected(first, second)) {
                System.out.println("union "+first+", "+second);
                weightedQuickUnion.union(first, second);
                numberOfConnections++;
            }

        }
        return numberOfConnections;
    }




}
