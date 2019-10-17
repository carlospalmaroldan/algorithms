
class Solution {


    public static void main(String[] args){
        int[] A={1,3,4,2,2,2,1,1,2};
        int[] B=createArray();
        System.out.println(solution(B));
    }

    public static boolean solution(int[] A) {
        for(int i=1;i<A.length-2;i++){
            int firstSum=firstSum(i,A);
            int second=secondSum(i,firstSum,A);
            if(second==-1){continue;}
            int thirdSum=thirdSum(second,A);
            if(thirdSum==firstSum){
                return true;
            }
            return false;
        }
        return false;
    }


    public static int firstSum(int i,int[] A){
        int sum=0;
        for(int j=0;j<i;j++){
            sum=sum+A[j];
        }
        return sum;
    }

    public static int secondSum(int firstCut,int firstSum,int[] A){
        int sum=0;
        for(int k= firstCut+1;k<A.length-1;k++){
            sum=sum+A[k];
            if(sum==firstSum){
                return k+1;
            }
        }
        return -1;
    }

    public static int thirdSum(int k,int[] A){
        int sum=0;
        for(int l=k+1;l<A.length;l++){
            sum=sum+A[l];
        }
        return sum;
    }

    public static int[] createArray(){
        int[] A= new int[20000];
        for(int i=0;i<10000;i=i+2){
            A[i]=1;
            A[i+1]=2;
        }
        return A;
    }
}
