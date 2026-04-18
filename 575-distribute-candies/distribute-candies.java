class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> hash = new HashSet<>();
        for(int num : candyType){
            hash.add(num);
        }
        return Math.min(hash.size() , candyType.length/2);
    }
}