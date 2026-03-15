class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < order.length; i++){
            for(int j = 0; j < friends.length; j++){
                if(order[i] == friends[j]){
                    arr.add(order[i]);
                }
            }
        }
        int[] result = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++){
            result[i] = arr.get(i);
        }

        return result;
    }
}