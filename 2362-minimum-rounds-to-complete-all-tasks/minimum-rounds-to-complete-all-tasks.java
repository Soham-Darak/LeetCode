class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int task : tasks){
            map.put(task, map.getOrDefault(task,0)+1);
        }
        int oper = 0;
        for(int count : map.values()){
            if(count == 1){
                return -1;
            }
            oper += (count + 2) / 3;
        }
        return oper;
    }   
}