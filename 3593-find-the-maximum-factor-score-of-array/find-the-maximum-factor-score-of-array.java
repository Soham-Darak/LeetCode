class Solution {
    public long maxScore(int[] nums) {
        long ans = 0;
        for(int remove = -1; remove < nums.length; remove++){
            long gcd = 0;
            long lcm = 1;
            boolean first = true;

            for(int i = 0; i < nums.length; i++){
                if(i == remove) continue;

                if(first){
                    gcd = nums[i];
                    lcm = nums[i];
                    first = false;
                }else{
                    gcd = gcd(gcd,nums[i]);
                    lcm = lcm(lcm,nums[i]);
                }
            }
            ans = Math.max(ans, gcd * lcm);
        }
        return ans;
    }
    public long gcd(long a, long b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
    public long lcm(long a, long b){
        return (a * b)/gcd(a,b);
    }
}