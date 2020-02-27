package main.java;

import static java.lang.Math.floor;

public class InversionCount {


    public static void main(String[] args){
        int[] A = new int[]{3,41,52,26};
        System.out.println(countInversion(A,0,A.length-1));
        int[] B = new int[]{3,41,52,26,38,57,9,49};
        System.out.println(countInversion(B,0,B.length-1));
    }

    public static int mergeCountInversion(int[] A, int p, int q, int r){
        int[] L = new int[q-p+1];
        int[] R = new int[r-q];
        for(int i=p;i<q+1;i++){
            L[i-p]=A[i];
        }
        for(int j = q+1; j < r+1;j++){
            R[j-q-1]=A[j];
        }
        int i=0;
        int j=0;
        int count=0;
        for(int k=p;k<r+1;k++){
            if(i+p>q){
                A[k]=R[j];
                j=j+1;
            }else if( j+q+1 > r){
                A[k] = L[i];
                i=i+1;
            } else if (L[i] < R[j] && i <= q) {
                A[k] = L[i];
                i= i+1;
            } else if (R[j] < L[i] && j<= r){
                A[k] = R[j];
                j= j+1;
                count = count + q - (i+p) + 1;
            }
        }
        return count;
    }

    public static int countInversion(int[] A, int p, int r){
        if(r-p>1){
            int q = (int)floor((p+r)/2);
            int leftInversion = countInversion(A,p,q);
            int rightInversion = countInversion(A,q+1,r);
            int mergeInversion = mergeCountInversion(A, p, q , r);
            return leftInversion + rightInversion + mergeInversion;
        }else{
            int count = 0;
            if (A[p] > A[r]) {
                int temp = A[p];
                A[p] = A[r];
                A[r] = temp;
                count = count + 1;
            }
            return count;
        }
    }
}
