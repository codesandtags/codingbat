package org.codesandtags.codingbat;

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
        if(!str.contains("x")){
            return true;
        }
        boolean isBalance   = false;
        boolean isX         = false;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'x' && (i+1) < str.length()){
                isX = true;
                continue;
            }
            if(isX && str.charAt(i) == 'y'){
                isBalance = true;
                isX = false;
            }else if(str.charAt(i) == 'x'){
                isBalance = false;
            }
        }
        return isBalance;
    }
}
