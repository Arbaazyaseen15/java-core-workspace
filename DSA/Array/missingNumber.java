import java.lang.Math;
import java.util.ArrayList;
class missingNumber {
    static int missingNumber(int array[], int n) {
        // Your Code Here
        int sum =0,missing;
        float res;
        if(n==2)
        {
            return Math.abs(3-array[0]);
        }
        else{
        for(int i = 0; i<n-1; i++){
            sum += array[i];
        }
       
        
        res = (n*(n+1)/2) - sum;
        missing = (int)res;
        return missing;
        }
    }
    public static void main(String args[]){
        int a[] = {1,2,3,5};
        int result = missingNumber(a,5);
        System.out.println(result);

    }
}