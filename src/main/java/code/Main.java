package code;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {

    public static void main(String[] args) {
       /*ArrayList<Integer> input= new ArrayList<>();
       input.add(1);
       input.add(5);
       input.add(6);
       input.add(7);
       input.add(9);
       input.add(5);
       input.add(4);
       input.add(2);
       input.add(6);
       System.out.println(prefixAverages(input));

       System.out.println(prefixAveragesLinear(input));

       System.out.println(powerFunction(2,0));

       System.out.println(powerLinearRecursion(2,5));
       System.out.println(powerLinearRecursionRecurrent(2,5));
       System.out.println(integerPartLog2(1));

       System.out.println(integerPartLog2Recursive(35));*/
      //int[] showOutput=findIntegersForSum(5,new int[]{2,6,7,3});
      /*for(int i=0;i<showOutput.length;i++){
          System.out.print(showOutput[i]+ " ");
      }*/

      /*int[] showOutput2=putLesserThanKLeft(new int[]{20,1,3,2,5},5);
      for(int i=0;i<showOutput2.length;i++){
            System.out.print(showOutput2[i]+" ");
      }*/


      /*int[] output=recursiveMaxAndMin(new int[]{2,6,7,3});
        for(int i=0;i<output.length;i++){
            System.out.print(output[i]+" ");
        }
*/
        /*int[] output=recursiveMaxAndMin(new int[]{2,6,7,3,5,7,1,8});
        System.out.println(" ");
        for(int i=0;i<output.length;i++){
            System.out.print(output[i]+" ");
        }*/


/*

        int[] output=recursiveMaxAndMin(new int[]{2,6,7,3,5,7,1,8});
        for(int i=0;i<output.length;i++){
            System.out.print(output[i]+" ");
        }

        output=recursiveMaxAndMin(new int[]{2,6,7,3,9,7,1,8,3,4,8,5,3,4,3,1});
        System.out.println(" ");
        for(int i=0;i<output.length;i++){
            System.out.print(output[i]+" ");
        }

        System.out.println(" ");
        System.out.println(harmonicNumber(4));


        System.out.println(polinomialValue(new double[]{1,1,0.5},3.0));
        System.out.println(hornerMethod(new double[]{1,1,0.5},3.0));

        System.out.println(recursiveProduct(4,3));


        System.out.println(recursivePalindrome("racecar"));

        System.out.println(recursiveMoreVowels("aacxd",0,5));
        System.out.println(recursiveVowels("aacxd"));

*/

      /* int[]  print=recursiveEvenFirst(new int[]{2,1,3,2,5},new int[]{0,0,0,0,0},new int[]{0,0,0,0,0},0,0,5);
       for(int i=0;i<print.length;i++){
           System.out.println(print[i]);
       }


       System.out.println(binarySum(new int[]{1,3,6,2},0,4));

       int[] out=linearFibonacci(6);
       for(int i=0;i<out.length;i++){
           System.out.println(out[i]);
       }

        out=recursiveMaxMin(new int[]{9,7,9,1});
        for(int i=0;i<out.length;i++){
            System.out.println(out[i]);
        }*/




   /*     List<LinkedList<Integer>> output=puzzleSolver(7,new LinkedList<>(),new LinkedList<Integer>(Arrays.asList(0,1,2,3,4,5,6,7,8,9)));
       int a=1;*/


        /*List<LinkedList<Integer>> permutations=getAllPermutations(3,new LinkedList<>(),new LinkedList<Integer>(Arrays.asList(0,1,2,3,4)));
        for(int i=0;i<permutations.size();i++){
           for(int j=0;j<permutations.get(i).size();j++){
               System.out.print(permutations.get(i).get(j)+ " ");

           }
            System.out.println("\n");
        }*/

        /*int[] output=insertionSortDecreasing(new int[]{5,2,4,6,1,3});
        for(int i=0;i<output.length;i++){
            System.out.println(output[i]);
        }*/

        /*int[] output=selectionSort(new int[]{5,2,4,6,1,3});
        for(int i=0;i<output.length;i++){
            System.out.println(output[i]);
        }*/

        /*int[] array=new int[]{7,7,7,7,7,7,7,7,2,4,5,7,1,2,3,6,7,7,7,7,7};
        merge(array,8,11,15);
        for(int i=0;i<array.length-1;i++){
            System.out.println(array[i]);
        }*/

        /*int[] array= new int[]{3,41,52,26,38,57,9,49};
        mergeSort(array,0,7);
        for(int i=0;i<array.length-1;i++){
            System.out.println(array[i]);
        }*/


        /*int[] array=new int[]{7,7,7,7,7,7,7,7,2,4,5,8,1,2,3,6,7,7,7,7,7};
        mergeNoSentinels(array,8,11,15);
        for(int i=0;i<array.length-1;i++){
            System.out.println(array[i]);
        }*/

        /*Map<String,Integer> persons=new HashMap<>();
        persons.put("Carlos",18);
        persons.put("Roberth",16);
        persons.put("Camilo",18);
        System.out.println(persons.get("leo"));*/

        /*int[] A= new int[50];
        int k=0;
        for(int i=0;i<100;i=i+2){
           A[k]=i;
           k=k+1;
        }

        System.out.println(binarySearch(A,50,0,99));*/

     /*  // System.out.println(bubbleSort(new int[]{2,5,2,6,3,4,8,8,9}));
       int[] A=new int[]{2,2,3,4,5,6,8,8,9};
       *//*System.out.println(binarySearchSum(A,0,0,A.length-1,1));*//*
       System.out.println(determineifTwoElementsSum(A,0,A.length-1,17));*/
       /*int[] highestSumArray=new int[]{13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};
       int[] output=highestSumSequence(highestSumArray,0,highestSumArray.length-1);
      //  int[]   output=findMaxCrossingSubarray(highestSumArray,0,1,3);
       for(int i=0;i<output.length;i++){
           System.out.println(output[i]);
       }
*/

    }



    //este algoritmo es lineal, recorre la coleccion una sola vez
    //no hay bucle interno que se ejecute un número de veces que depende del índice
    public  static ArrayList<Double> prefixAveragesLinear(ArrayList<Integer> arrayList) {
        ArrayList<Double> output = new ArrayList<>();
        double sum= (double)arrayList.get(0);
        output.add((double)arrayList.get(0));
        for(int i=1;i<arrayList.size();i++){
            sum=(double)arrayList.get(i)+sum;
            output.add(sum/(double)(i+1));
        }

        return output;
    }


    public static ArrayList<Double> prefixAverages(ArrayList<Integer> arrayList){
        ArrayList<Double> output=new ArrayList<>();
        for(int i=1; i<arrayList.size()+1;i++){
            int average=0;
            for(int j=0; j< i; j++){
                average=average+arrayList.get(j);
            }
            output.add((double)average/(double)i);
        }
        return output;
    }

    public static ArrayList<Double> printer(ArrayList<Integer> arrayList){
        ArrayList<Double> output=new ArrayList<>();
        for(int i=0;i<arrayList.size();i++){
            output.add((double)arrayList.get(i));
        }
        return output;
    }


    public static double powerFunction(double base, Integer power){
        if(power==0){
            return 1.0;
        }
        double output=base;
        for(int i=0;i<power-1;i++){
            output= output*base;
        }
        return output;
    }

    public static double powerLinearRecursion(double base, Integer power){
        if(power==0){
            return 1.0;
        }
        if(power%2==0){
            double output=1.0;
            for(int i=0; i<power/2; i++){
                output=output*base;
            }
            return output*output;
        }
        if(power%2==1){
            double output=1.0;
            for(int i=0; i<(power-1)/2; i++){
                output=output*base;
            }
            return base*output*output;
        }
        else return 0.0;
    }

    public static double powerLinearRecursionRecurrent(double base, int power){
        double output=0.0;
        if(power==0){
            return 1.0;
        }
        if(power%2==0){
           output= powerLinearRecursionRecurrent(base,power/2);
           return output*output;
        }
        if(power%2==1){
            output=powerLinearRecursionRecurrent(base,(power-1)/2);
            return base*output*output;
        }
        return output;
    }


    public static int integerPartLog2(int number){
        if(number==1){
            return 0;
        }
        int output=0;
        int y=number;
        while(y>1){
            y=y/2;
            output=output+1;
        }
        return output;
    }

    public static int integerPartLog2Recursive(int number){
        if(number==1){
            return 0;
        }
        int i=1;
        i=i+integerPartLog2Recursive(number/2);
        return i;
    }


    private static int[] findIntegersForSum(int k,int[] array){
        int[] output= new int[]{-1,-1};
        if(array.length==2){
            if(array[0]+array[1]==k){
                output[0]=array[0];
                output[1]=array[1];
                return output;
            }else{
                return output;
            }
        }
        else{
            for(int i=0;i<array.length-1;i++){
                for(int j=i+1;j<array.length;j++){
                    int[] process= new int[2];
                    process[0]=array[i];
                    process[1]=array[j];
                    output=findIntegersForSum(k,process);
                    if(output[0]!=-1 && output[1]!=-1){
                        return output;
                    }
                }
            }

        }
        return output;
    }

    private static int[]  putLesserThanKLeft(int[] array,int k){
        int temp;
        for(int i=1;i<array.length;i++){
            if(array[i]<=k){
                temp=array[i];
                for(int j=i; j>0;j--){
                    array[j]=array[j-1];
                }
                array[0]=temp;
            }
        }
        return array;
    }

    private static int[] recursiveMaxAndMin(int[] array) {
        int[] output=new int[2];

        if(array.length==2){
            if (array[0] > array[1]){
               output[0]=array[0];
               output[1]=array[1];
            }else{
                output[0]=array[1];
                output[1]=array[0];
            }
        }else{
            int limit= array.length/2;
            int[] upperhalf=new int[limit];
            int[] lowerhalf=new int[limit];

            for(int i=0;i<limit;i++){
                lowerhalf[i]=array[i];
            }
            for(int i=limit;i<array.length;i++){
                upperhalf[i-limit]=array[i];
            }
            int[] upperoutput=recursiveMaxAndMin(upperhalf);
            int[] loweroutput=recursiveMaxAndMin(lowerhalf);

            if (upperoutput[0] > loweroutput[0]){
                output[0]=upperoutput[0];
            }else{
                output[0]=loweroutput[0];
            }
            if (upperoutput[1]<loweroutput[1]){
                output[1]=upperoutput[1];
            }else{
                output[1]=loweroutput[1];
            }
        }
       return output;
    }


    private static double harmonicNumber(int n){
        double output=0.0;
        if(n==1){
            output = 1.0;
        }else{
            output=harmonicNumber(n-1)+1.0/n;
        }
        return output;
    }


    private static double polinomialValue(double[] coefficients,double number){
        double sum=0.0;
        double power=1.0;
        for(int i=0;i<coefficients.length;i++){
            sum=sum+coefficients[i]*power;
            power=power*number;
        }
        return sum;
    }

    private static  double hornerMethod(double[] coefficients, double number){

        double product=coefficients[coefficients.length-1];

        for(int i=coefficients.length-1;i>0;i--){
            product=coefficients[i-1]+number*product;
        }

        return product;
    }

    private static int recursiveProduct(int m, int n){
        int output=0;
        if(n==1){
            output= m;
        }else{
            output=m+recursiveProduct(m,n-1);
        }
        return output;

    }

    private static boolean recursivePalindrome(String string){
        boolean output=true;
        if(string.length()==1){
            output=true;
        }else if(string.length()==2){

            if(string.charAt(0)==string.charAt(1)){
                output=true;
            }else{
                output=false;
            }

        }        else{
            if(string.charAt(0)==string.charAt(string.length()-1)){
                output=true;
            }else {
                return false;
            }
            char[] substring=new char[string.length()-2];
            for(int i=1;i<string.length()-1;i++){
                substring[i-1]=string.charAt(i);
            }
            output=output&&recursivePalindrome(new String(substring));
        }
        return output;


    }


    private static boolean recursiveMoreVowels(String string, int vowels, int totalLength){
        String vowelArray="aeiou";
        boolean output=false;
        if(string.length()==1){
            for(int i=0;i<vowelArray.length();i++){
                if(string.charAt(0)==vowelArray.charAt(i)){
                    vowels=vowels+1;
                }
            }
            if (vowels > totalLength / 2) {
                output= true;
            } else {
                output= false;
            }

        }else{
            for(int i=0; i<vowelArray.length();i++){
                if(string.charAt(0)==vowelArray.charAt(i)){
                    vowels=vowels+1;
                }
            }
            char[] substring=new char[string.length()-1];
            for(int i=1; i<string.length();i++){
                substring[i-1]=string.charAt(i);
            }
            output=recursiveMoreVowels(new String(substring),vowels,totalLength);
        }
        return output;
    }

    private static int recursiveVowels(String string){
        String vowelArray="aeiou";
        boolean output=false;
        int vowels=0;
        if(string.length()==1){
            for(int i=0;i<vowelArray.length();i++){
                if(string.charAt(0)==vowelArray.charAt(i)){
                    vowels=vowels+1;
                }
            }

        }else{
            for(int i=0; i<vowelArray.length();i++){
                if(string.charAt(0)==vowelArray.charAt(i)){
                    vowels=vowels+1;
                }
            }
            char[] substring=new char[string.length()-1];
            for(int i=1; i<string.length();i++){
                substring[i-1]=string.charAt(i);
            }
            vowels=vowels+recursiveVowels(new String(substring));
        }
        return vowels;
    }

    private static int[] recursiveEvenFirst(int[] array,int[] even, int[] odd,int ie,int io,int totalLength){
        int[] output=new int[totalLength];
        if(array.length==1){
            if(array[0]%2==0){
                even[ie]=array[0];
                ie=ie+1;
            }else{
                odd[io]=array[0];
                io=io+1;
            }

            for(int i=0;i< ie;i++){
                output[i]=even[i];
            }
            for(int i=0;i<io;i++){
                if(ie!=0) {
                    output[i + ie ] = odd[i];
                }else{
                    output[i] = odd[i];
                }
            }
            return output;
        }else{
            if(array[0]%2==0){
                even[ie]=array[0];
                ie=ie+1;
            }else{
                odd[io]=array[0];
                io=io+1;
            }
            int[] subarray=new int[array.length-1];
            for(int i=1;i<array.length;i++){
                subarray[i-1]=array[i];

            }
            output=recursiveEvenFirst(subarray,even,odd,ie,io,totalLength);
        }
        return output;

    }


    /*this algorithm is painfully inefficient*/
    public static int binarySum(int[] array,int index,int length){
        if(length==1){
            return array[index];
        }else{
            int half=length/2;

            return   binarySum(array,index,half)+ binarySum(array,index+half,half);

        }
    }

    public static int[] linearFibonacci(int n){
        int[] output=new int[2];
        if(n<=1){
            output[0]=n;
            output[1]=0;
        }else{

            output=linearFibonacci(n-1);
            int temp=output[0];
            output[0]=output[0]+output[1];
            output[1]=temp;

        }
        return output;
    }


    public static int[] recursiveMaxMin(int[] array){
        int[] output= new int[2];
        if(array.length==2){
            if (array[0]>array[1]){
                output[0]=array[0];
                output[1]=array[1];
            }
            if(array[1]>array[0]){
                output[0]=array[1];
                output[1]=array[0];
            }
        }else{
            int[] partialOutput;
            int[] subarray=new int[array.length-1];
            for(int i=1;i<array.length;i++){
                subarray[i-1]=array[i];
            }
            partialOutput=recursiveMaxMin(subarray);
            if (array[0]>partialOutput[0]) {
                partialOutput[0]=array[0];

            }
            if(array[0]<partialOutput[1]){
                partialOutput[1]=array[0];
            }
            output=partialOutput;
        }
        return output;
    }

   //*P3.6*//
    public static List<LinkedList<Integer>>  puzzleSolver(int k,LinkedList<Integer> sequence, LinkedList<Integer> set){
        List<LinkedList<Integer>> output=new LinkedList<>();
        for(int i=0;i<set.size();i++){
            sequence.add(set.get(i));
            set.remove(i);
            if(k==1){
                if(sequence.get(0)*sequence.get(1)*sequence.get(2)+sequence.get(0)*sequence.get(3)*sequence.get(4)==
                        sequence.get(5)*sequence.get(6)*sequence.get(5)){
                    output.add(new LinkedList<>(sequence));

                }
            }else{
                output= puzzleSolver(k-1,sequence,set);

            }
            set.add(i,sequence.getLast());
            sequence.remove(sequence.size()-1);

        }
        return output;
    }

    public static List<LinkedList<Integer>> getAllPermutations(int k,LinkedList<Integer> sequence,LinkedList<Integer> set) {
        List<LinkedList<Integer>> output=new LinkedList<>();
        for (int i = 0; i < set.size(); i++){
            sequence.add(set.get(i));
            set.remove(i);
            if (k == 1) {
                output.add(new LinkedList<>(sequence));
            } else {
                List<LinkedList<Integer>> partialList=getAllPermutations(k - 1, sequence, set);
                output.addAll(partialList);
            }
            set.add(i,sequence.getLast());
            sequence.remove(sequence.size()-1);
        }
        return output;
    }

    public static int[] insertionSort(int[] array){
        for(int j=1;j<array.length;j++){
            int key=array[j];
            int i=j-1;
            while (i >= 0 && array[i]>key) {
                array[i + 1] = array[i];
                i = i - 1;
                }
            array[i+1]=key;
            }
            return array;
        }


    public static int[] insertionSortDecreasing(int[] array){
        for(int j=1;j<array.length;j++){
            int key=array[j];
            int i=j-1;
            while (i >= 0 && array[i]<key) {
                array[i + 1] = array[i];
                i = i - 1;
            }
            array[i+1]=key;
        }
        return array;
    }

    public static int[] selectionSort(int[] array){
        for(int k=0;k<array.length-2;k++){
            int min=array[k];
            int index=k;
            for(int j=k+1;j<array.length;j++){
                if (min > array[j]){
                    min=array[j];
                    index=j;
                    }
                }
                array[index]=array[k];
                array[k]=min;
            }
            return array;
    }


    public static void merge(int [] array,int p, int q, int r){
        int n1=q-p+1;
        int n2=r-q;
        int[] L= new int[n1+1];
        int[] R = new int[n2+1];
        for(int i=0;i<n1;i++){
            L[i]=array[p+i];
        }
        for(int j=0;j<n2;j++){
            R[j]=array[q+j+1];
        }
        L[n1]=9999;
        R[n2]=9999;
        int i=0;
        int j=0;
        for(int k=p;k<r+1;k++){
            if (L[i] <= R[j]){
                array[k]=L[i];
                i=i+1;
            }else{
                array[k]=R[j];
                j=j+1;
            }

            }
    }

    public static void mergeSort(int[] array,int p, int r){
        if(p<r){
            int q=(p+r)/2;
            mergeSort(array, p, q);
            mergeSort(array,q+1,r);
            merge(array,p,q,r);
        }
    }

    public static void mergeNoSentinels(int[] A,int p, int q, int r){
        int n1=q-p+1;
        int n2=r-q;
        int[] L=new int[n1];
        int[] R=new int[n2];
        for(int i=0;i<L.length;i++){
            L[i]=A[p+i];
        }
        for(int j=0;j<R.length;j++){
            R[j]=A[q+j+1];
        }
        int i=0;
        int j=0;
        for(int k=p;k<r+1;k++){
            if (L[i] <= R[j]){
                A[k]=L[i];
                i=i+1;
                if(i==n1){
                    k=k+1;
                    for(int m=j;m<n2;m++){
                        A[k]=R[m];
                        k=k+1;
                    }
                    return;
                }
            }else{
                A[k]=R[j];
                j=j+1;
                if(j==n2){
                    k=k+1;
                    for(int m=i;i<n1;i++){
                        A[k]=L[m];
                        k=k+1;
                    }
                    return;
                }
            }
        }

    }

    public static int binarySearch(int[] A,int v,int i,int j){
        int n=j-i;
        if(n==1){
            if (A[i]==v) {
                return i;
            } else if (A[i+1]==v) {
                return i+1;
            }else{return -1;}
        }
        if(n%2==0){
            if(A[i+n/2]<v){
                return binarySearch(A,v,i+n/2,j);
            }else if(A[i+n/2]>v){
                return binarySearch(A,v,i,j-n/2);
            }else{
                return i+n/2;
            }
        }else{
            if(A[i+(n-1)/2]<v){
                return binarySearch(A,v,i+(n-1)/2,j);
            }else if (A[i+(n-1)/2]>v){
                return binarySearch(A,v,i,j-(n-1)/2);
            }else{return i+(n-1)/2;}
        }
    }

    public static int[] bubbleSort(int[] array){
        for(int i=0;i<array.length-2;i++){
            for(int j=array.length-1;j>i+1;j--){
                if(array[j]<array[j-1]){
                    int temp;
                    temp=array[j-1];
                    array[j-1]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }


    public static boolean binarySearchSum(int[] A,int k,int start,int end, int sum){
        boolean output=false;
        if(end-start<=1){
            return false;
        }
        int j=0;
        if((start+end)%2==0){
            j=(start+end)/2;
        }else{
            j=(start+end+1)/2;
        }
        if ((A[k] + A[j])>sum) {
            start=start;
            end=j;
            output=binarySearchSum(A,k,start,end,sum);
        }else if((A[k] + A[j])<sum){
            start=j;
            end=end;
            output=binarySearchSum(A,k,start,end,sum);
        }else{
            output= true;
        }
        return output;
    }

    private static boolean determineifTwoElementsSum(int[] A,int start,int end, int sum){
        boolean output=false;
        for(int k=0;k<A.length;k++){
            output=binarySearchSum(A,k,0,A.length-1,sum);
            if(output=true){
                return output;
            }
        }
        return output;
    }





}
