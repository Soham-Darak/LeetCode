class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> hash = new HashSet<>();
        
        for(int num : nums){
            hash.add(num);
            
            int rev = 0;
            int temp = num;

            while(temp != 0){
                int digit = temp % 10;
                rev = rev * 10 + digit;
                temp = temp / 10;
            }
            hash.add(rev);
        }
        return hash.size();
    }
}