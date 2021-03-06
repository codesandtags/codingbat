package org.codesandtags.codingbat;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Edwin on 08/12/2014.
 */
public class StringTwo {

    /**
     * Given a string, return a string where for every char in the original,
     * there are two chars.
     *
     * @param str
     * @return
     */
    public String doubleChar(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.charAt(i) + "" + str.charAt(i);
        }
        return result;
    }

    /**
     * Return the number of times that the string "hi" appears anywhere in the
     * given string.
     *
     * @param str
     * @return
     */
    public int countHi(String str) {
        int count = 0;
        if (str.length() > 1) {
            for (int i = 0; i < str.length(); i++) {
                if ((i + 2) <= str.length()
                        && str.substring(i, i + 2).equals("hi")) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * Return true if the string "cat" and "dog" appear the same number of times
     * in the given string.
     *
     * @param str
     * @return
     */
    public boolean catDog(String str) {
        int timesCat = 0;
        int timesDog = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf("cat", i) != -1) {
                timesCat++;
                i = str.indexOf("cat", i) + 1;
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf("dog", i) != -1) {
                timesDog++;
                i = str.indexOf("dog", i) + 1;
            }
        }

        return timesCat == timesDog;
    }

    /**
     *
     * Return the number of times that the string "code" appears anywhere in the
     * given string, except we'll accept any letter for the 'd', so "cope" and
     * "cooe" count.
     *
     * @param str
     * @return
     **/
    public int countCode(String str) {

        int countCode = 0;

        if (str.length() > 3) {
            for (int i = 0; i < str.length() - 3; i++) {
                if (str.charAt(i)     == 'c' &&
                        str.charAt(i + 1) == 'o' &&
                        str.charAt(i + 3) == 'e') {
                    countCode++;
                }
            }
        }

        return countCode;
    }

    /**
     * Given two strings, return true if either of the strings appears at the
     * very end of the other string, ignoring upper/lower case differences (in
     * other words, the computation should not be "case sensitive"). Note:
     * str.toLowerCase() returns the lowercase version of a string.
     *
     * @param a
     * @param b
     * @return
     */
    public boolean endOther(String a, String b) {
        return b.toLowerCase().endsWith(a.toLowerCase())
                || a.toLowerCase().endsWith(b.toLowerCase());
    }

    /**
     * Return true if the given string contains an appearance of "xyz" where the
     * xyz is not directly preceeded by a period (.). So "xxyz" counts but
     * "x.xyz" does not.
     *
     * @param str
     * @return
     */
    public boolean xyzThere(String str) {
        boolean isXyz = false;
        if(str.length() >= 3){
            for (int i = 0; i < str.length() - 2; i++) {
                if(str.charAt(i)     == 'x' &&
                        str.charAt(i + 1) == 'y' &&
                        str.charAt(i + 2) == 'z'
                        ){
                    if(i > 0 && str.charAt(i - 1) != '.' || i == 0)
                        isXyz = true;
                }
            }
        }

        return isXyz;
    }

    /**
     * Return true if the given string contains a "bob" string, but where
     * the middle 'o' char can be any char.
     *
     * @param str
     * @return
     */
    public boolean bobThere(String str) {
        boolean isBob = false;
        if(str.length() > 2){
            for (int i = 0; i < str.length() - 2; i++) {
                if(str.charAt(i)   == 'b' &&
                        str.charAt(i+2) == 'b'
                        ){
                    isBob = true;
                }
            }
        }
        return isBob;
    }

    /**
     * Given two strings, A and B, create a bigger string made of the first
     * char of A, the first char of B, the second char of A, the second char
     * of B, and so on. Any leftover chars go at the end of the result.
     *
     * @param a
     * @param b
     * @return
     */
    public String mixString(String a, String b) {
        int size = (a.length() > b.length()) ? a.length() : b.length();
        String result = "";
        for (int i = 0; i < size; i++) {
            if (i < a.length()) {
                result += a.charAt(i);
            }
            if (i < b.length()) {
                result += b.charAt(i);
                ;
            }
        }
        return result;
    }

    /**
     * We'll say that a String is xy-balanced if for all the 'x' chars
     * in the string, there exists a 'y' char somewhere later in the string. So
     * "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's.
     * Return true if the given string is xy-balanced.
     *
     * @param str
     * @return
     */
    public boolean xyBalance(String str) {
        if(!str.contains("x")) return true;
        boolean isY = false;
        boolean isX = false;
        for (int i = 0; i < str.length(); i++) {
            if( ((i+1) == str.length() && str.charAt(i) == 'x') ){
                isX = true;
                isY = false;
            }else if(str.charAt(i) == 'x'){
                isX = true;
            }else if(str.charAt(i) == 'y' && isX){
                isY = true;
            }
        }
        return isX && isY;
    }

    /**
     * Given a string and an int N, return a string made of N repetitions of the last N
     * characters of the string. You may assume that N is between 0 and the length of
     * the string, inclusive.
     * @param str
     * @param n
     * @return String
     */
    public String repeatEnd(String str, int n) {
        String result = "";
        if(str.length() >= n){
            for(int i = 0; i < n; i++){
                result += str.substring( (str.length() - n), str.length() );
            }
        }
        return result;
    }

    /**
     * Given a string and an int n, return a string made of the first n characters of the
     * string, followed by the first n-1 characters of the string, and so on. You may assume
     * that n is between 0 and the length of the string, inclusive
     * (i.e. n >= 0 and n <= str.length()).
     * @param str
     * @param n
     * @return String
     */
    public String repeatFront(String str, int n) {
        String result = "";
        if(n <= str.length() ){
            for(int i=0; i < n; i++){
                result += str.substring(0,n - i);
            }
        }
        return result;
    }

    /**
     * Given two strings, word and a separator, return a big string made of
     * count occurences of the word, separated by the separator string.
     * @param word
     * @param sep
     * @param count
     * @return String
     */
    public String repeatSeparator(String word, String sep, int count) {
        String result = "";
        for(int i = 0; i<count; i++){
            result = result.concat(word);
            if(i != (count - 1) )
                result = result.concat(sep);
        }
        return result;
    }

    /**
     * Given a string, consider the prefix string made of the first N chars of the string.
     * Does that prefix string appear somewhere else in the string? Assume that the string
     * is not empty and that N is in the range 1..str.length().
     * @param str
     * @param n
     * @return boolean
     */
    public boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        return str.indexOf(prefix, n) != -1;
    }

    /**
     * Given a string, does "xyz" appear in the middle of the string? To define middle,
     * we'll say that the number of chars to the left and right of the "xyz" must differ
     * by at most one. This problem is harder than it looks.
     * @param str
     * @return
     */
    public boolean xyzMiddle(String str) {
        int size = str.length();
        int midd = (size % 2 == 0)? size/2-1 : (size+1)/2-1;

        if(size < 3)
            return false;

        if (size > midd)
            return (str.charAt(midd) == 'y' &&
                    str.charAt(midd - 1) == 'x' &&
                    str.charAt(midd + 1) == 'z') ||
                    (str.charAt(midd) == 'x' &&
                            str.charAt(midd + 1) == 'y' &&
                            str.charAt(midd + 2) == 'z' &&
                            size / 2 - midd == 1);

        return false;
    }

    /**
     * A sandwich is two pieces of bread with something in between. Return the string
     * that is between the first and last appearance of "bread" in the given string,
     * or return the empty string "" if there are not two pieces of bread.
     * @param str
     * @return
     */
    public String getSandwich(String str) {
        int first = str.indexOf("bread");
        int end   = str.lastIndexOf("bread");
        String result = "";
        if(first != end){
            result = str.substring(first + 5, end);
        }
        return result;
    }

    /**
     * Returns true if for every '*' (star) in the string, if there are chars both
     * immediately before and after the star, they are the same.
     * @param str
     * @return
     */
    public boolean sameStarChar(String str) {
        if (str.length() == 0 || str.equals("*"))
            return true;

        boolean isStart = true;

        for(int i = 1; i < str.length() - 1; i++){
            if(str.charAt(i) == '*')
                isStart = str.charAt(i-1) == str.charAt(i+1);
        }
        return isStart;
    }

    /**
     * Look for patterns like "zip" and "zap" in the string -- length-3, starting
     * with 'z' and ending with 'p'. Return a string where for all such words,
     * the middle letter is gone, so "zipXzap" yields "zpXzp".
     * @param str
     * @return
     */
    public String zipZap(String str) {
        return "";
    }

    /**
     * Return a version of the given string, where for every star (*) in the string
     * the star and the chars immediately to its left and right are gone. So "ab*cd"
     * yields "ad" and "ab**cd" also yields "ad".
     * @param str
     * @return
     */
    public String starOut(String str) {
        return "";
    }

    /**
     * Given a string and a non-empty word string, return a version of the original
     * String where all chars have been replaced by pluses ("+"), except for
     * appearances of the word string which are preserved unchanged
     * @param str
     * @param word
     * @return
     */
    public String plusOut(String str, String word) {
        String result = "";
        for(int i = 0; i < str.length(); i++){
            if(i + word.length() <= str.length()){
                String portion = str.substring(i, i + word.length());
                if(portion.equals(word)){
                    result = result.concat(word);
                    i += word.length() - 1;
                }else{
                    result = result.concat("+");
                }
            }else{
                result = result.concat("+");
            }
        }
        return result;
    }

    /**
     * Given a string and a non-empty word string, return a string made of each
     * char just before and just after every appearance of the word in the string.
     * Ignore cases where there is no char before or after the word, and a char may
     * be included twice if it is between two words.
     * @param str
     * @param word
     * @return
     */
    public String wordEnds(String str, String word) {
        return "";
    }

}