class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();

        int max = Integer.MIN_VALUE;
        for(int ele : candies){
            max = Math.max(max,ele);
        }
        for(int ele: candies){

            if((ele+extraCandies) >= max){
                list.add(true);
            }else{
                list.add(false);
            }
        }
    
        return list;
    }
}