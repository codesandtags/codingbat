package org.codesandtags.codingbat;

/**
 * Created by Edwin on 10/12/2014.
 */
public class StringOne {

    /**
     * Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
     * @param name
     * @return
     */
    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    /**
     * Given two strings, a and b, return the result of putting them together in
     * the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
     * @param a
     * @param b
     * @return
     */
    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    /**
     * The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic
     * text. In this example, the "i" tag makes <i> and </i> which surround the word
     * "Yay". Given tag and word strings, create the HTML string with tags around the
     * word, e.g. "<i>Yay</i>".
     * @param tag
     * @param word
     * @return
     */
    public String makeTags(String tag, String word) {
        return String.format("<%1$s>%2$s</%1$s>",tag,word);
    }

    /**
     * Given an "out" string length 4, such as "<<>>", and a word, return a new string
     * where the word is in the middle of the out string, e.g. "<<word>>". Note: use
     * str.substring(i, j) to extract the String starting at index i and going up to but
     * not including index j.
     * @param out
     * @param word
     * @return
     */
    public String makeOutWord(String out, String word) {
        return out.substring(0,2) + word + out.substring(2,4);
    }

    /**
     * Given a string, return a new string made of 3 copies of the last 2 chars of the
     * original string. The string length will be at least 2.
     * @param str
     * @return
     */
    public String extraEnd(String str) {
        if(str.length() < 3){
            return str + str + str;
        }else{
            String s = str.substring(str.length() - 2);
            return s + s + s;
        }
    }

    /**
     * Given a string, return the string made of its first two chars, so the String "Hello"
     * yields "He". If the string is shorter than length 2, return whatever there is,
     * so "X" yields "X", and the empty string "" yields the empty string "". Note that
     * str.length() returns the length of a string.
     * @param str
     * @return
     */
    public String firstTwo(String str) {
        if(str.length() <= 2){
            return str;
        }else{
            return str.substring(0,2);
        }
    }

    /**
     * Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
     * @param str
     * @return
     */
    public String firstHalf(String str) {
        return str.substring(0,str.length() / 2);
    }

    /**
     * Given a string, return a version without the first and last char, so "Hello" yields "ell".
     * The string length will be at least 2
     * @param str
     * @return
     */
    public String withoutEnd(String str) {
        if(str.length() >= 2){
            return str.substring(1,str.length() - 1);
        }
        return str;
    }

    /**
     * Given 2 strings, a and b, return a string of the form short+long+short, with the shorter
     * string on the outside and the longer string on the inside. The strings will not be the
     * same length, but they may be empty (length 0). *
     * @param a
     * @param b
     * @return
     */
    public String comboString(String a, String b) {
        if(a.length() > b.length()){
            return b + a + b;
        }else{
            return a + b + a;
        }
    }

    /**
     * Given 2 strings, return their concatenation, except omit the first char of each. The strings
     * will be at least length 1.
     * @param a
     * @param b
     * @return
     */
    public String nonStart(String a, String b) {
        if(a.length() > 0 && b.length() > 0){
            return a.substring(1) + b.substring(1);
        }else{
            return a + b;
        }
    }

    /**
     * Given a string, return a "rotated left 2" version where the first 2 chars are moved to the
     * end. The string length will be at least 2.
     * @param str
     * @return
     */
    public String left2(String str) {
        if(str.length() > 2){
            int length = str.length();
            return str.substring(2, length) + str.substring(0, 2);
        }
        return str;
    }

    /**
     * Given a string, return a "rotated right 2" version where the last 2 chars are moved to the
     * start. The string length will be at least 2.
     * @param str
     * @return
     */
    public String right2(String str) {
        if(str.length() > 2){
            int length = str.length();
            return str.substring(length - 2, length) + str.substring(0, length - 2);
        }
        return str;
    }

    /**
     * Given a string, return a string length 1 from its front, unless front is false, in
     * which case return a string length 1 from its back. The string will be non-empty.
     * @param str
     * @param front
     * @return
     */
    public String theEnd(String str, boolean front) {
        if(front){
            return str.substring(0,1);
        }else{
            return str.substring(str.length() - 1,str.length());
        }
    }

    /**
     * Given a string, return a version without both the first and last char of the string.
     * The string may be any length, including 0.
     * @param str
     * @return
     */
    public String withouEnd2(String str) {
        if(str.length() > 2){
            return str.substring(1,str.length() - 1);
        }else{
            return "";
        }
    }

    /**
     * Given a string of even length, return a string made of the middle two chars,
     * so the string "string" yields "ri". The string length will be at least 2.
     * @param str
     * @return
     */
    public String middleTwo(String str) {
        int middle = str.length() / 2 - 1;
        if(str.length() > 2){
            return str.substring(middle, middle + 2);
        }else{
            return str;
        }
    }

    /**
     * Given a string, return true if it ends in "ly".
     * @param str
     * @return
     */
    public boolean endsLy(String str) {
        return (str.endsWith("ly"));
    }

    /**
     * Given a string and an int n, return a string made of the first and last n chars from
     * the string. The string length will be at least n.
     * @param str
     * @param n
     * @return
     */
    public String nTwice(String str, int n) {
        if(n <= str.length()){
            return str.substring(0,n) + str.substring(str.length() - n);
        }
        return str;
    }

    /**
     * Given a string and an index, return a string length 2 starting at the given index.
     * If the index is too big or too small to define a string length 2, use the first 2
     * chars. The string length will be at least 2.
     * @param str
     * @param index
     * @return
     */
    public String twoChar(String str, int index) {
        if(index + 2 <= str.length() && str.length() > 0 && index > 0){
            return str.substring(index, index + 2);
        }else{
            return str.substring(0,2);
        }

    }

    /**
     * Given a string of odd length, return the string length 3 from its middle, so "Candy"
     * yields "and". The string length will be at least 3.
     * @param str
     * @return
     */
    public String middleThree(String str) {
        if(str.length() > 3){
            int middle = str.length() / 2 - 1;
            return str.substring(middle, middle + 3);
        }
        return str;
    }

    /**
     * Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
     * such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length,
     * including 0. Note: use .equals() to compare 2 strings.
     * @param str
     * @return
     */
    public boolean hasBad(String str) {
        if(str.indexOf("bad") < 2 && str.indexOf("bad") != -1){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Given a string, return a string length 2 made of its first 2 chars. If the string
     * length is less than 2, use '@' for the missing chars.
     * @param str
     * @return
     */
    public String atFirst(String str) {
        if(str.length() < 2){
            if(str.length() == 0) return "@@";
            return str + "@";
        }else{
            return str.substring(0,2);
        }
    }

    /**
     * Given 2 strings, a and b, return a new string made of the first char of a and the
     * last char of b, so "yo" and "java" yields "ya". If either string is length 0, use
     * '@' for its missing char.
     * @param a
     * @param b
     * @return
     */
    public String lastChars(String a, String b) {
        a = (a.length() == 0)?"@":a;
        b = (b.length() == 0)?"@":b;
        return "" + a.charAt(0) + b.charAt(b.length() - 1);
    }

    /**
     * Given two strings, append them together (known as "concatenation") and return the
     * result. However, if the concatenation creates a double-char, then omit one of the
     * chars, so "abc" and "cat" yields "abcat".
     * @param a
     * @param b
     * @return
     */
    public String conCat(String a, String b) {
        if(a.length() > 0 && b.length() > 0 && a.charAt(a.length() - 1) == b.charAt(0)){
            return a + b.substring(1);
        }
        return a + b;
    }

    /**
     * Given a string of any length, return a new string where the last 2 chars, if
     * present, are swapped, so "coding" yields "codign".
     * @param str
     * @return
     */
    public String lastTwo(String str) {
        if(str.length() > 1){
            int l = str.length();
            return "" + str.substring(0, l - 2) + str.charAt(l - 1) + str.charAt(l - 2);
        }
        return str;
    }

    /**
     * Given a string, if the string begins with "red" or "blue" return that color string,
     * otherwise return the empty string.
     * @param str
     * @return
     */
    public String seeColor(String str) {
        if(str.startsWith("red")){
            return "red";
        }else if (str.startsWith("blue")){
            return "blue";
        }
        return "";
    }

    /**
     * Given a string, return true if the first 2 chars in the string also appear at the end
     * of the string, such as with "edited".
     * @param str
     * @return
     */
    public boolean frontAgain(String str) {
        if(str.length() > 1){
            int x = str.length();
            if(str.charAt(0) == str.charAt(x-2) && str.charAt(1) == str.charAt(x-1)){
                return true;
            }
        }
        return false;
    }

    /**
     * Given two strings, append them together (known as "concatenation") and return the result.
     * However, if the strings are different lengths, omit chars from the longer string so it is
     * the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may
     * be any length.
     * @param a
     * @param b
     * @return
     */
    public String minCat(String a, String b) {
        if(a.length() >= b.length()){
            return a.substring(a.length() - b.length()) + b;
        }else{
            return a + b.substring(b.length() - a.length());
        }
    }

    /**
     * Given a string, return a new string made of 3 copies of the first 2 chars of the original
     * string. The string may be any length. If there are fewer than 2 chars, use whatever is
     * there.
     * @param str
     * @return
     */
    public String extraFront(String str) {
        if(str.length() > 1){
            String front = str.substring(0,2);
            return front + front + front;
        }
        return str + str + str;
    }

    /**
     * Given a string, if a length 2 substring appears at both its beginning and end, return a
     * string without the substring at the beginning, so "HelloHe" yields "lloHe". The substring
     * may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.
     * @param str
     * @return
     */
    public String without2(String str) {
        if(str.length() >= 2){
            int x = str.length();
            if(str.substring(0,2).equals(str.substring(x - 2))){
                return str.substring(2);
            }else{
                return str;
            }
        }
        return str;
    }

    /**
     * Given a string, return a version without the first 2 chars. Except keep the first char
     * if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder
     * than it looks.
     * @param str
     * @return
     */
    public String deFront(String str) {
        String result = "";
        if(str.length() >= 2){
            if(str.charAt(0) == 'a')
                result += "a";
            if(str.charAt(1) == 'b')
                result += "b";
            result += str.substring(2);
        }
        return result;
    }

    /**
     * Given a string and a second "word" string, we'll say that the word matches the string
     * if it appears at the front of the string, except its first char does not need to match
     * exactly. On a match, return the front of the string, or otherwise return the empty string.
     * So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The
     * word will be at least length 1.
     * @param str
     * @param word
     * @return
     */
    public String startWord(String str, String word) {
        if(str.startsWith(word)){
            return word;
        }else if(str.length() > 2 &&
                word.length() > 0 &&
                str.indexOf(word.substring(1),1) > 0){
            return str.substring(0,word.length());
        }else if(str.length() == 1 && word.length() == 1){
            return str;
        }
        return "";
    }

    /**
     * Given a string, if the first or last chars are 'x', return the string without those
     * 'x' chars, and otherwise return the string unchanged.
     * @param str
     * @return
     */
    public String withoutX(String str) {
        if(str.startsWith("x") || str.endsWith("x")){
            str = (str.startsWith("x"))?str.substring(1):str;
            str = (str.endsWith("x"))?str.substring(0,str.length() - 1):str;
            return str;
        }
        return str;
    }

    /**
     * Given a string, if one or both of the first 2 chars is 'x', return the string without
     * those 'x' chars, and otherwise return the string unchanged. This is a little harder
     * than it looks.
     * @param str
     * @return
     */
    public String withoutX2(String str) {
        if(str.length() > 1){
            String from = str.substring(0,2).replace("x","");
            String end = str.substring(2,str.length());
            return from + end;
        }
        if(str.length() == 1 && str.charAt(0) == 'x'){ return ""; }
        return str;
    }

}