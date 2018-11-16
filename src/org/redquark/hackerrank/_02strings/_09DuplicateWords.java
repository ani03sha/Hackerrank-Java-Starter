/*
 * In this challenge, we use regular expressions (RegEx) to remove instances of words that are
 * repeated more than once, but retain the first occurrence of any case-insensitive repeated word.
 * For example, the words love and to are repeated in the sentence I love Love to To tO code.
 *
 * To solve this challenge, complete the following three lines:
 *
 * 1. Write a RegEx that will match any repeated word.
 * 2. Complete the second compile argument so that the compiled RegEx is case-insensitive.
 * 3. Write the two necessary arguments for replaceAll such that each repeated word is replaced with
 *    the very first instance the word found in the sentence. It must be the exact first occurrence
 *    of the word, as the expected output is case-sensitive.
 */


package org.redquark.hackerrank._02strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _09DuplicateWords {

    public static void main(String[] args) {

        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }
}