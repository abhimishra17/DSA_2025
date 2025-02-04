package array;

public class kadaneAlgo {
    //brute force
    public static int brute(int []arr,int n ){
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<j;k++){
                   sum=sum+arr[k];
                }
                max=Math.max(sum,max);
            }
        }
return max;
    }
    public static int better(int []arr,int n ){
        int max=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                 sum=sum+arr[j];
                max=Math.max(sum,max);
            }
        }
return max;
    }
    public static void main(String[] args) {
        int[]arr={10,5,-1,1,-1,6,-2,-6};
        int n=arr.length;
       System.out.println("bruteforce approach");
       System.out.println(brute(arr,n));
       System.out.println(" better approach ");
       System.out.println(better(arr, n));
        
    }
    
}
