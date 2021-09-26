package com.aminhjz.one;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ChOne {

    /**
     * P90 1.1
     * @param sample
     * @return
     */
    public static boolean uniqueCharString(char[] sample) {
        for (int i=0; i< sample.length; i++) {
            for (int j=i+1; j < sample.length; j++){
                if (sample[i] == sample[j]){
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * P90 1.1
     * @param sample
     * @return
     */
    public static boolean uniqueCharString2(char[] sample) {
        Set<Character> characters = new HashSet<>();
        for (int i=0; i< sample.length; i++) {
            if (!characters.add(sample[i])){
                return false;
            }
        }
        return true;
    }

    /**
     * P90 1.2
     */
    public static boolean permutations(char[] first, char[] second) {
        if (first.length != second.length) {
            return false;
        }
        Map<Character, Boolean> characterIntegerHashMap = new HashMap<>();

        for (char ch: first){
            characterIntegerHashMap.put(ch, false);
        }
        for (char ch: second){
            characterIntegerHashMap.computeIfPresent(ch, (character, integer) -> true);
        }

        return characterIntegerHashMap.values().stream().reduce((aBoolean, aBoolean2) -> aBoolean && aBoolean2).get();
    }

    /**
     *
     */
    public static char[] encodeSpaces(char[] string, int trueLength){
        char rch = ' ';
        char[] charr = "%20".toCharArray();

        int finalIndex = trueLength;
        for (int i = 0; i < trueLength; i++){
            char ch = string[i];
            if (ch == rch){
                finalIndex += charr.length - 1;
            }
        }

        for (int i = trueLength - 1; i >= 0; i--){
            char ch = string[i];
            if (ch == rch){
                for (int j = charr.length - 1; j >= 0 ; j--){
                    string[finalIndex - 1] = charr[j];
                    finalIndex--;
                }
            } else {
                string[finalIndex - 1] = string[i];
                finalIndex--;
            }

        }
        return string;
    }

    /**
     *
     */
    public static boolean palindromPermutation(char[] string){
        return true;
    }

}
