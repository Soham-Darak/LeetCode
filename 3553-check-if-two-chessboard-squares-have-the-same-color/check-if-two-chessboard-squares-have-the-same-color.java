class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        return ((coordinate1.charAt(0) + coordinate1.charAt(1)) % 2) ==
               ((coordinate2.charAt(0) + coordinate2.charAt(1)) % 2);
        // if( coordinate1.charAt(0) == 'a' || 
        //     coordinate1.charAt(0) == 'c'||
        //     coordinate1.charAt(0) == 'e'||
        //     coordinate1.charAt(0) == 'g' ||
        //     coordinate2.charAt(0) == 'a' || 
        //     coordinate2.charAt(0) == 'c'||
        //     coordinate2.charAt(0) == 'e'||
        //     coordinate2.charAt(0) == 'g'){
        //     if(coordinate1.charAt(1) % 2 == 0 && coordinate2.charAt(1) % 2 == 0){
        //         return false;
        //     }
        // }
        // if( coordinate1.charAt(0) == 'b' || 
        //     coordinate1.charAt(0) == 'd'||
        //     coordinate1.charAt(0) == 'f'||
        //     coordinate1.charAt(0) == 'h' ||
        //     coordinate2.charAt(0) == 'b' || 
        //     coordinate2.charAt(0) == 'd'||
        //     coordinate2.charAt(0) == 'f'||
        //     coordinate2.charAt(0) == 'h'){
        //     if(coordinate1.charAt(1) % 2 != 0 && coordinate2.charAt(1) % 2 != 0){
        //         return false;
        //     }
        // }
        // return true;
    }
}