class Solution {
    public int[] decimalRepresentation(int n) {
        String str = String.valueOf(n);
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < str.length(); i++){
            int digit = Character.getNumericValue(str.charAt(i));
            if(digit == 0) continue;
            int placevalue = digit * (int) Math.pow(10 ,str.length() - 1 - i);
            list.add(placevalue);
        }
        int[] arr = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}