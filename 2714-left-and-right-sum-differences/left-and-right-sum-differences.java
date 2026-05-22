class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[] lsum=new int[n];
        int[] rsum=new int[n];
        int[]res= new int[n];
        for(int i=1;i<n;i++){
           lsum[i]=lsum[i-1]+ nums[i-1];
        }
        for(int j=n-2;j>=0;j--){
            rsum[j]=rsum[j+1]+ nums[j+1];
        } 
        for(int k=0;k<n;k++){
            rsum[k]=Math.abs(lsum[k]-rsum[k]);
        }
        return rsum; 
    }
}