import java.util.ArrayList;

class sumOfSubArray{
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        int start = 0, i, currentSum = arr[0], p=0;
        ArrayList<Integer> res = new ArrayList<Integer>();
        res.add(-1);
        
        for(i=1; i<=n; i++){
            while(currentSum > s && start < i-1){
                currentSum = currentSum - arr[start];
                start++;
            }
            if(currentSum == s){
                p = i;
                res.set(0,start+1);
                res.add(p);
                return res;
            }
           if (i < n)
                currentSum = currentSum + arr[i];
        }
        
        return res;
    }
    public static void main(String args[]){
        int a[] = {1,2,3,7,5};
        ArrayList<Integer> result = new ArrayList<Integer>(null);
        result = subarraySum(a,a.length,12);
        System.out.println(result);

    }
}