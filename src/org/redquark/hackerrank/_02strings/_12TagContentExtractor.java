/*
 * In a tag-based language like XML or HTML, contents are enclosed between a start tag
 * and an end tag like <tag>contents</tag>. Note that the corresponding end tag starts with a /.
 *
 * Given a string of text in a tag-based language, parse this text and retrieve the contents
 * enclosed within sequences of well-organized tags meeting the following criterion:
 *
 * 1. The name of the start and end tags must be same. The HTML code <h1>Hello World</h2> is not valid,
 *    because the text starts with an h1 tag and ends with a non-matching h2 tag.
 *
 * 2. Tags can be nested, but content between nested tags is considered not valid.
 *    For example, in <h1><a>contents</a>invalid</h1>, contents is valid but invalid is not valid.
 *
 * 3. Tags can consist of any printable characters.
 */


package org.redquark.hackerrank._02strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _12TagContentExtractor {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String line = in.nextLine();

            boolean flag = false;


            /* \<(.+)\>([^\<\>]+)\<\/\1\>
             *
             * The first group <(.+)\> will match one or more character in between <>
             * the second group ([^\<\>]+) will contain any character which does not include < >
             * the third group <\/\1\> will contain any chracters in between < >
             * or it will repeat the first group again.
             */
            Pattern p = Pattern.compile("<(.+?)>([^<>]+)</\\1>");
            Matcher m = p.matcher(line);

            while (m.find()) {
                System.out.println(m.group(2));
                flag = true;
            }

            if (!flag) {
                System.out.println("None");
            }

            testCases--;
        }

        in.close();
    }
}
