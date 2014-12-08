package org.codesandtags.codingbat;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WarmUpOneTest {

    private WarmUpOne warmUpOne;

    @BeforeTest
    public void init(){
        warmUpOne = new WarmUpOne();
    }

    @DataProvider(name="sleepIn")
    public Object[][] sleepInData(){
        return new Object[][]{
                {false, false, true},
                {true, false, false},
                {false, true, true}
        };
    }

    @Test(dataProvider = "sleepIn")
    public void testSleepIn(boolean weekday, boolean vacation, boolean expected) {
        boolean result = warmUpOne.sleepIn(weekday, vacation);
        Assert.assertEquals(result, expected);
    }
}