public class Chapter4 {


    public static void main(String[] args){
        /*int[][] C= new int[1][1];
        System.out.println(C.length);

        int[][] A=new int[4][4];
        A[0][0]=1; A[0][1]=1;A[0][2]=1;A[0][3]=1;
        A[1][0]=1; A[1][1]=1;A[1][2]=1;A[1][3]=1;
        A[2][0]=1; A[2][1]=1;A[2][2]=1;A[2][3]=1;
        A[3][0]=1; A[3][1]=1;A[3][2]=1;A[3][3]=1;

        System.out.println(A[2].length);


        int[][] B=new int[4][4];
        B[0][0]=1; B[0][1]=1;B[0][2]=1;B[0][3]=1;
        B[1][0]=1; B[1][1]=1;B[1][2]=1;B[1][3]=1;
        B[2][0]=1; B[2][1]=1;B[2][2]=1;B[2][3]=1;
        B[3][0]=1; B[3][1]=1;B[3][2]=1;B[3][3]=1;

        printMatrix(A);
        printMatrix(sumMatrices(A,B));



        int[][] C11 =new int[2][2];
        C11[0][0]=1; C11[0][1]=1;
        C11[1][0]=1; C11[1][1]=1;

        int[][] C12 =new int[2][2];
        C12[0][0]=2; C12[0][1]=2;
        C12[1][0]=2; C12[1][1]=2;

        int[][] C21 =new int[2][2];
        C21[0][0]=3; C21[0][1]=3;
        C21[1][0]=3; C21[1][1]=3;

        int[][] C22=new int[2][2];
        C22[0][0]=4; C22[0][1]=4;
        C22[1][0]=4; C22[1][1]=4;

        printMatrix(concatenateMatrices(C11,C12,C21,C22));

*/
        int[][] D=new int[2][2];
        int[][] E=new int[2][2];
        int[][] Answer=new int[2][2];

        D[0][0]=1; D[0][1]=3;
        D[1][0]=-1; D[1][1]=2;

        E[0][0]=3; E[0][1]=2;
        E[1][0]=8; E[1][1]=5;

        Answer[0][0]=27; Answer[0][1]=17;
        Answer[1][0]=13; Answer[1][1]=8;


        int[][] G=new int[4][4];
        int[][] H=new int[4][4];

        G[0][0]=1; G[0][1]=2; G[0][2]=3; G[0][3]=-5;
        G[1][0]=2; G[1][1]=0; G[1][2]=4; G[1][3]=2;
        G[2][0]=2; G[2][1]=-1; G[2][2]=2; G[2][3]=3;
        G[3][0]=5; G[3][1]=3; G[3][2]=5; G[3][3]=0;

        H[0][0]=1; H[0][1]=2; H[0][2]=3; H[0][3]=1;
        H[1][0]=2; H[1][1]=0; H[1][2]=3; H[1][3]=4;
        H[2][0]=-1; H[2][1]=0; H[2][2]=1; H[2][3]=2;
        H[3][0]=0; H[3][1]=1; H[3][2]=3; H[3][3]=2;

        int[][] Answer4=new int[4][4];
        Answer4[0][0]=2; Answer4[0][1]=-3; Answer4[0][2]=-3; Answer4[0][3]=5;
        Answer4[1][0]=-2; Answer4[1][1]=6; Answer4[1][2]=16; Answer4[1][3]=14;
        Answer4[2][0]=-2; Answer4[2][1]=7; Answer4[2][2]=14; Answer4[2][3]=8;
        Answer4[3][0]=6; Answer4[3][1]=10; Answer4[3][2]=29; Answer4[3][3]=27;

        //printMatrix(createSubmatrix(Answer4,2,3,2,3));

        int[][] output=naiveRecursiveMatrixMultiplication(2,D,E);
        printMatrix(output);
        int[][] output4=naiveRecursiveMatrixMultiplication(4,G,H);
        printMatrix(output4);

        int[][] outputStrassen=strassenAlgorithm(D,E);
        printMatrix(outputStrassen);
        int[][] output4Strassen=strassenAlgorithm(G,H);
        printMatrix(output4Strassen);

    }

    private static int[] highestSumSequence(int[] A, int low, int high) {

        if (low == high) {
            int[] basecase = new int[3];
            basecase[0] = low;
            basecase[1] = high;
            basecase[2] = A[low];
            return basecase;
        } else {
            int mid;
            if ((high + low) % 2 == 0) {
                mid = (high + low) / 2;
            } else {
                mid = (high + low - 1) / 2;
            }
            int[] loweroutput = highestSumSequence(A, low, mid);
            int[] upperoutput = highestSumSequence(A, mid + 1, high);
            int[] crossoutput = findMaxCrossingSubarray(A, low, mid, high);
            if (loweroutput[2] > upperoutput[2] && loweroutput[2] > crossoutput[2]) {
                return loweroutput;
            } else if (upperoutput[2] > loweroutput[2] && upperoutput[2] > crossoutput[2]) {
                return upperoutput;
            } else {
                return crossoutput;
            }
        }
    }

    private static int[] findMaxCrossingSubarray(int[] A, int low, int mid, int high) {
        int leftsum = -10000;
        int rightsum = -10000;
        int[] output = new int[3];
        int sum = 0;
        int maxleft = 0;
        int maxright = 0;
        for (int i = mid; i >= low; i--) {
            sum = sum + A[i];
            if (sum > leftsum) {
                leftsum = sum;
                maxleft = i;
            }
        }
        sum = 0;
        for (int j = mid + 1; j <= high; j++) {
            sum = sum + A[j];
            if (sum > rightsum) {
                rightsum = sum;
                maxright = j;
            }
        }
        output[0] = maxleft;
        output[1] = maxright;
        output[2] = leftsum + rightsum;
        return output;
    }

    private static int[][] naiveRecursiveMatrixMultiplication(int size, int[][] A, int B[][]) {
        if (size == 1) {
            int[][] number = new int[1][1];
            number[0][0] = A[0][0] * B[0][0];
            return number;
        } else {
            int[][] C ;
            int[][] A11=createSubmatrix(A,0,size / 2 - 1,0, size / 2 - 1);
            int[][] A12=createSubmatrix(A,0, size / 2 - 1, size/2, size-1);
            int[][] A21=createSubmatrix(A,size/2, size  - 1, 0, size / 2 - 1);
            int[][] A22=createSubmatrix(A,size/2, size  - 1,size/2, size  - 1);

            int[][] B11=createSubmatrix(B,0,size / 2 - 1,0, size / 2 - 1);
            int[][] B12=createSubmatrix(B,0, size / 2 - 1, size/2, size-1);
            int[][] B21=createSubmatrix(B,size/2, size  - 1, 0, size / 2 - 1);
            int[][] B22=createSubmatrix(B,size/2, size  - 1,size/2, size  - 1);

            int[][] C11 = sumMatrices(naiveRecursiveMatrixMultiplication(size / 2, A11,  B11)
                    , naiveRecursiveMatrixMultiplication(size / 2, A12,  B21));

            int[][] C12 = sumMatrices(naiveRecursiveMatrixMultiplication(size / 2, A11,  B12)
                    , naiveRecursiveMatrixMultiplication(size / 2, A12,B22));

            int[][] C21 = sumMatrices(naiveRecursiveMatrixMultiplication(size / 2,A21,B11),
            naiveRecursiveMatrixMultiplication(size / 2, A22,B21));

            int[][] C22 = sumMatrices(naiveRecursiveMatrixMultiplication(size / 2, A21, B12),
            naiveRecursiveMatrixMultiplication(size / 2, A22, B22));

            C = concatenateMatrices(C11, C12, C21, C22);

            return C;
        }
    }


    private static int[][] strassenAlgorithm(int[][] A,int[][] B){
        int size=A.length;
        if (size == 1) {
            int[][] number = new int[1][1];
            number[0][0] = A[0][0] * B[0][0];
            return number;
        } else {
            int[][] A11 = createSubmatrix(A, 0, size / 2 - 1, 0, size / 2 - 1);
            int[][] A12 = createSubmatrix(A, 0, size / 2 - 1, size / 2, size - 1);
            int[][] A21 = createSubmatrix(A, size / 2, size - 1, 0, size / 2 - 1);
            int[][] A22 = createSubmatrix(A, size / 2, size - 1, size / 2, size - 1);

            int[][] B11 = createSubmatrix(B, 0, size / 2 - 1, 0, size / 2 - 1);
            int[][] B12 = createSubmatrix(B, 0, size / 2 - 1, size / 2, size - 1);
            int[][] B21 = createSubmatrix(B, size / 2, size - 1, 0, size / 2 - 1);
            int[][] B22 = createSubmatrix(B, size / 2, size - 1, size / 2, size - 1);

            int[][] S1 = sumMatrices(B12, negateMatrix(B22));
            int[][] S2 = sumMatrices(A11, A12);
            int[][] S3 = sumMatrices(A21, A22);
            int[][] S4 = sumMatrices(B21, negateMatrix(B11));
            int[][] S5 = sumMatrices(A11, A22);
            int[][] S6 = sumMatrices(B11, B22);
            int[][] S7 = sumMatrices(A12, negateMatrix(A22));
            int[][] S8 = sumMatrices(B21, B22);
            int[][] S9 = sumMatrices(A11, negateMatrix(A21));
            int[][] S10 = sumMatrices(B11, B12);

            int[][] P1 = strassenAlgorithm(A11, S1);
            int[][] P2 = strassenAlgorithm(S2, B22);
            int[][] P3 = strassenAlgorithm(S3, B11);
            int[][] P4 = strassenAlgorithm(A22, S4);
            int[][] P5 = strassenAlgorithm(S5, S6);
            int[][] P6 = strassenAlgorithm(S7, S8);
            int[][] P7 = strassenAlgorithm(S9, S10);

            int[][] C11 = sumMatrices(P5, P4);
            C11 = sumMatrices(C11, negateMatrix(P2));
            C11 = sumMatrices(C11, P6);

            int[][] C12 = sumMatrices(P1, P2);
            int[][] C21 = sumMatrices(P3, P4);
            int[][] C22 = sumMatrices(P5, P1);
            C22 = sumMatrices(C22, negateMatrix(P3));
            C22 = sumMatrices(C22, negateMatrix(P7));

            int[][] C = concatenateMatrices(C11, C12, C21, C22);

            return C;
        }

    }

    private static void printMatrix(int[][] A) {
        System.out.print("[ ");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(A[i][j] + " ");

            }
            if (i == A.length - 1) {
                System.out.println(" ]");
            }
            String newLine = System.getProperty("line.separator");
            System.out.println(newLine);
        }

    }

    private static int[][] sumMatrices(int[][] A, int[][] B) {
        int[][] C = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }

    private static int[][] concatenateMatrices(int[][] C11, int[][] C12, int[][] C21, int[][] C22) {
        int[][] C = new int[C11.length * 2][C11.length * 2];

        for (int i = 0; i < C11.length; i++) {
            for (int j = 0; j < C11.length; j++) {
                C[i][j] = C11[i][j];
            }
        }
        for(int i=0;i<C11.length;i++){
            for(int j=0;j<C11.length;j++){
                C[i][j+C11.length]=C12[i][j];
            }
        }

        for(int i=0;i<C11.length;i++){
            for(int j=0;j<C11.length;j++){
                C[i+C11.length][j]=C21[i][j];
            }
        }

        for(int i=0;i<C11.length;i++){
            for(int j=0;j<C11.length;j++){
                C[i+C11.length][j+C11.length]=C22[i][j];
            }
        }
        return C;
    }

    private static int[][] createSubmatrix(int[][] A,int row,int rowFinal,int col, int colFinal){
        int[][] submatrix=new int[A.length/2][A.length/2];
        for(int i=row;i<rowFinal+1;i++){
            for(int j=col;j<colFinal+1;j++){
                submatrix[i-row][j-col]=A[i][j];

            }
        }
        return submatrix;
    }

    private static int[][] negateMatrix(int[][] A){
        int[][] negate=new int[A.length][A[0].length];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                negate[i][j]=-1*A[i][j];
            }
        }
        return negate;
    }

}