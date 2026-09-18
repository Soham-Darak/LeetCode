class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        int a = 10000;
        long b = 1000000000;
        long vol =(long) length * width * height;
        boolean c = false;
        boolean h = false;
        if(length >= a || width >= a || height >= a || mass>= a || vol >= b){
            c = true;
        }
        if(mass >= 100){
            h = true;
        }
        if(c && h){
            return "Both";
        }
        if(!c && !h){
            return "Neither";
        }
        if(c && !h){
            return "Bulky";
        }
        if(h && !c){
            return "Heavy";
        }
        return "";
    }
}