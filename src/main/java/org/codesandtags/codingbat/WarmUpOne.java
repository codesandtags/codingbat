package org.codesandtags.codingbat;

/**
 * Created by Edwin on 08/12/2014.
 */
public class WarmUpOne {

    /**
     * The parameter weekday is true if it is a weekday, and the parameter vacation
     * is true if we are on vacation. We sleep in if it is not a weekday or we're
     * on vacation. Return true if we sleep in.
     *
     * @param weekday
     * @param vacation
     * @return boolean
     */
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return (!weekday || vacation);
    }

}
