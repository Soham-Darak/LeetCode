class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> arr = new ArrayList<>();
        while(left<=right){
            int num = left;
            int temp = left;
            boolean isValid = true;
            while(temp > 0){
                int digit = temp % 10;
                if(digit == 0 || num % digit != 0){
                    isValid = false;
                    break;
                }
                temp = temp / 10;
            }
            if(isValid){
                arr.add(num);
            }
            left++;
        }
        return arr;
    }
}