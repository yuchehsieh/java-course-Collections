package com.murphy;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("TW", "taiwan no.1");
        languages.put("USA", "east pacific ocean");
        System.out.println(languages.put("Daan", "city of the Taipei"));
        /**
         * 如果是新的值會 return null
         * 如果有 override 會顯示覆蓋之前的 value
         * **/
        System.out.println(languages.get("TW"));

        if (languages.containsKey("TW")) {
            System.out.println("TW has already exist");
        } else {
            languages.put("TW", "NTUE DTD"); /** 會 override 之前的 value **/
            System.out.println(languages.get("TW"));
        }

        for(String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
