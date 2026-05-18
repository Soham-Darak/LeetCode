import java.util.*;

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {

        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");

        List<String> result = new ArrayList<>();

        for(String s : arr1){

            int count1 = 0;
            int count2 = 0;

            for(String w1 : arr1){
                if(s.equals(w1)){
                    count1++;
                }
            }

            for(String w2 : arr2){
                if(s.equals(w2)){
                    count2++;
                }
            }

            if(count1 == 1 && count2 == 0){
                result.add(s);
            }
        }

        for(String s : arr2){

            int count1 = 0;
            int count2 = 0;

            for(String w1 : arr1){
                if(s.equals(w1)){
                    count1++;
                }
            }

            for(String w2 : arr2){
                if(s.equals(w2)){
                    count2++;
                }
            }

            if(count1 == 0 && count2 == 1){
                result.add(s);
            }
        }

        return result.toArray(new String[0]);
    }
}