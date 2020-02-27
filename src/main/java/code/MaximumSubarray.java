package main.java;

public class MaximumSubarray {

    public static void main(String[] args){

        int[] A={13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};
        int[] output=bruteForceMethod(A);

        for(int i=0;i<3;i++) {
            System.out.println(output[i]);
        }

        output=findMaximumSubarray(A,0,A.length-1);
        for(int i=0;i<3;i++) {
            System.out.println(output[i]);
        }

        output=findMaximumSubarrayLinear(A);
        for(int i=0;i<3;i++) {
            System.out.println(output[i]);
        }
    }

    private static int[] bruteForceMethod(int[] A){
        int max_sum=0;
        int initial_index=0;
        int final_index=0;
        int acc=0;
        for(int i=0;i<A.length;i++){
             acc=A[i];
             for(int j=i+1;j<A.length;j++){
                 acc=acc+A[j];
                 if(acc>max_sum){
                     max_sum=acc;
                     initial_index=i;
                     final_index=j;
                 }
             }
        }
        int[] output=new int[3];
        output[0]=initial_index;
        output[1]=final_index;
        output[2]=max_sum;
        return output;
    }

    private static int[] findMaxCrossingSubarray(int[] A,int low,int mid,int high){
        int left_sum=-10000;
        int right_sum=-10000;
        int sum=0;
        int max_left=0;
        int max_right=0;
        int[] output= new int[3];
        for(int i=mid;i>=low;i--){
            sum=sum+A[i];
            if(sum>left_sum){
                left_sum=sum;
                max_left=i;
            }
        }
        sum=0;
        for(int j=mid+1;j<=high;j++){
            sum=sum+A[j];
            if(sum > right_sum){
                right_sum=sum;
                max_right=j;
            }
        }
        output[0]=max_left;
        output[1]=max_right;
        output[2]=left_sum+right_sum;
        return output;
    }

    private static int[] findMaximumSubarray(int[] A,int low,int high){
        int[] output = new int[3];
        if(low==high){
            output[0]=low;
            output[1]=high;
            output[2]=A[low];
            return  output;
        }else{
            int mid=(low+high)/2;
            int[] left = new int[3];
            left= findMaximumSubarray(A,low,mid);
            int[] right = new int[3];
            right=findMaximumSubarray(A,mid+1,high);
            int[] cross = new int[3];
            cross=findMaxCrossingSubarray(A,low,mid,high);
            if(left[2]>=right[2] && left[2]>=cross[2]){
                return left;
            }else if(right[2]>=left[2] && right[2]>=cross[2]){
                return  right;
            }else{
                return cross;
            }
        }
    }

    private static int[] findMaximumSubarrayLinear(int[] A){
        int[] B={13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};
        int[] output=new int[3];
        int sum=A[0];
        int positivesum=0;
        int negativesum=0;
        int left=0;
        int right=0;
        for(int i=0;i<A.length;i++){
            if(A[i]>=0){
                positivesum=positivesum+A[i];
                if(positivesum+negativesum>0){
                    if(positivesum+negativesum>sum){
                        right=i;
                        sum=positivesum+negativesum;
                    }
                }else{
                    left=i;
                    right=i;
                    positivesum=A[i];
                    negativesum=0;
                    sum=A[i];
                }
            }else{
                negativesum=negativesum+A[i];
            }

        }
        output[0]=left;
        output[1]=right;
        output[2]=sum;
        return output;
    }

}
