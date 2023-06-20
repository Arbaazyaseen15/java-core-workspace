
class MinJumps{
    static int minJumps(int[] arr){
        // your code here
        int n = arr.length, i=0, currentNum, jumps =0, index=0;
        if(n > 1)
            return 0;
        if (arr[0] == 0) 
            return -1;
            
       while(index < n){
                currentNum = arr[index];
                index += currentNum; 
                i = currentNum;
                n -= i;
                jumps++;
                
            }
             return jumps;
    }
    public static void main(String args[]){
        int a[] = {21,37,58,86,100,97,73,44,67,60,90,58,13,31,49,63,44,73,76,76,77,73,16,83,100,4,67,51,56};
        int result = minJumps(a);
        System.out.println(result);

    }
       
}
