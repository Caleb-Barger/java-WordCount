package wordcount;

import java.util.*;

public class Main {

    // Easy way to grab some words
    public static String getWords(String words) {
        return words;
    }

    // Trim the string
    public static String trimWords(String words, String regex) {
        return words.replaceAll(regex, "");
    }
    public static void main(String[] args) {
        // Bind the string
        String myString = getWords(Words.myString);

        String trimmedString = trimWords(myString, "[[\\.\\?\\!\\,\\;\\:\\{\\}\\(\\)\\']]");

        // Split the string into an array
        String[] words = trimmedString.split(" +");

        // Print out the words
        // for (String w : words) {
        //     System.out.println(w);
        // }

        // Hashmap time!
        Map<String, Integer> wordsHashMap = new HashMap<>();
        for (String w : words) {
            if (!wordsHashMap.containsKey(w)) {
                wordsHashMap.put(w, 1);
            } else {
                int count = wordsHashMap.get(w);
                wordsHashMap.put(w, count + 1);
            }
        }

        // convert into a ArrayList 
        List<HashMap.Entry> sortedCount = new ArrayList<>(wordsHashMap.entrySet());
        sortedCount.sort(Comparator.comparing(o -> (int) o.getValue(), Comparator.reverseOrder()));

        // Display Hashmap
        for (HashMap.Entry e : sortedCount) {
            System.out.println("\nWord: " + e.getKey() + " appears " + e.getValue() + " times.");
        }




        
    }
}