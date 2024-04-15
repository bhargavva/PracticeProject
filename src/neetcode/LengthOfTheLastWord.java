package neetcode;

public class LengthOfTheLastWord {

    public static void main(String[] args) {
       int lastWordLen = findLengthOfTheLastWord("   fly me   to   the moon  ");
        System.out.println(lastWordLen);
    }

    private static int findLengthOfTheLastWord(String str) {
        int length = 0;
        int i = str.length() - 1;
        //Stage 1 : we passed the spaces in the end
        while (str.charAt(i) == ' '){
            i -= 1;
        }
        //Stage 2 : we started counting the last word length as log as the two conditions are true.
        while (i >= 0 && str.charAt(i) != ' '){
            length += 1;
            i -= 1;
        }
        return length;
    }
}
