import java.util.*;

class IsogramChecker {

    boolean isIsogram(String phrase) {

        if (repeatingLetters(phrase)) {
            return false;
        }

        return true;
    }

    private boolean repeatingLetters(String phrase) {
        // to check for repeating letters
        // ignore spaces and hyphens
        // add letters to hashmap, 
        // if letter already exists in hashmap, return false
        Hashtable<Character, Integer> hmap = new Hashtable<Character, Integer>();

        for (char c : phrase.toCharArray()) {
            if (!isSpaceOrHyphen(c)) {
                c = Character.toLowerCase(c);
                if (hmap.containsKey(c)) {
                    return true;
                }
                hmap.put(c, 1);
            }
        }
        return false;
    }

    private boolean isSpaceOrHyphen(char c) {
        if (c == ' ' || c == '-') {
            return true;
        }
        return false;
    }

}
