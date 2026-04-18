class Solution {
    public int smallestAbsent(int[] nums) {
        int sum = 0;
        for(int num : nums) sum += num;
        int avg = sum / nums.length;
        Set<Integer> hash = new HashSet<>();
        for(int num : nums) hash.add(num);
        int i = Math.max(1, avg + 1);
        while(true){
            if(!hash.contains(i)){
                return i;
            }
            i++;
        }
    }
}