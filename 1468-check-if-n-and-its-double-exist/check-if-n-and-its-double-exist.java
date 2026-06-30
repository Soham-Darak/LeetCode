class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> hash = new HashSet();

        for(int i : arr){
            if(hash.contains(i*2) || (hash.contains(i / 2) && i % 2 == 0)){
                return true;
            }
            hash.add(i);
        }
        return false;
    }
}