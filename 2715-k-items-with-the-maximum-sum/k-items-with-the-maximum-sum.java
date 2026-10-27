class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int count = 0;
        while(k > 0){
            if(numOnes > 0){
                k--;
                count++;
                numOnes--;
            }else if(numZeros > 0){
                k--;
                numZeros--;
            }else{
                k--;
                count--;
                numNegOnes--;
            }
        }
        return count;
    }
}