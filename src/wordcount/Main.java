package wordcount;

public class Main {

    // Easy way to grab some words
    public String getWords(String words) {
        return words;
    }

    // Trim the string
    public static String trimWords(String words, String regex) {
        return words.replaceAll(regex, "");
    }
    public static void main(String[] args) {
        String myString = getWords(Words.myString);

        System.out.println(myString);
        String trimmedWords = trimWords(myString, "[[\\.\\?\\!\\,\\;\\:\\{\\}\\(\\)\\']]");

        // Show new String
        System.out.println("\n\n\n\n\n" + trimmedWords);
    }
}