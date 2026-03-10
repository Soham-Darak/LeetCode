class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int i = 0;
        HashSet<Integer> set = new HashSet<>();
        while( i < n){
            int count = 1;
            int j = i+1;
            while(j < n && arr[i] == arr[j]){
                count++;
                j++;
            }
            if(set.contains(count)){
                return false;
            }
            set.add(count);
            i = j;
        }
        return true;
    }
}