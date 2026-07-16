class Solution {
    public long gcdSum(int[] nums) {
        int max = nums[0];
        List<Integer> list = new ArrayList<>();
        for(int num : nums){
            max = Math.max(num,max);
            list.add(gcd(max,num));
        }
        Collections.sort(list);

        long sum = 0;
        int i = 0;
        int j = list.size()-1;
        while(i < j){
            sum += gcd(list.get(i),list.get(j));
            i++;
            j--;
        }
        return sum;
    }
    public int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a % b);
    }
}