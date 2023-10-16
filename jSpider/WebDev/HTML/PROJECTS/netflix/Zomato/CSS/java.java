import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String input=sc.nextLine();
   
        String output = reverseEvenPositionWords(input);
        System.out.println(output);
    }

    public static String reverseEvenPositionWords(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        String[] words = input.split(" ");
        for (int i = 1; i < words.length; i += 2) {
            words[i] = reverseWord(words[i]);
        }

        return String.join(" ", words);
    }

    public static String reverseWord(String word) {
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }

        return new String(charArray);
    }
}   