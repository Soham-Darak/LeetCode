class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        int ans = -1;
        int maxCount = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int num = entry.getKey();
            int count = entry.getValue();

            if(num % 2 == 0){
                if(count > maxCount || (count == maxCount && num < ans)){
                    maxCount = count;
                    ans = num;
                }
            }   
        }
        return ans;
    }
}