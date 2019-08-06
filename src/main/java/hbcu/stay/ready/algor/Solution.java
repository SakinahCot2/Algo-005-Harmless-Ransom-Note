package hbcu.stay.ready.algor;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public Boolean harmlessRansomNote(String message , String magazineText){
        String note [] = magazineText.split(" ");
        Map<String, Integer> ransomMap = new HashMap<String, Integer>();
        for(String ransom:note){
            if(ransomMap.get(ransom) >1){
                return false;
            }
        }
        return true;
    }
}
