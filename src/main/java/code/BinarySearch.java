package main.java;

import static java.lang.Math.ceil;

public class BinarySearch {


    public static void main(String[] args){
        int[] A={1,3,4,7,9,12};
        System.out.println(binarySearch(A,0,A.length-1,12));
        System.out.println(binarySearch(A,0, A.length-1,8));
    }

    public static Double binarySearch(int[] A,double start, double end, int v){
        if(end-start>1){
            double mid=ceil((end-start)/2) + start;
            if (A[(int)mid] > v){
                return binarySearch(A,start, mid, v);
            }else if(A[(int)mid] < v){
                return binarySearch(A,mid,end,v);
            }else if(A[(int)mid]== v){
                return mid;
            }
        } else {
            if(A[(int)start]==v){
                return Double.valueOf(start);
            }else if(A[(int)end]==v){
                return Double.valueOf(end);
            }
            else return null;
        }
        return null;
    }


}
