package org.codesandtags.codingbat;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StringOneTest {

    StringOne stringOne;

    @BeforeTest
    public void setUp() throws Exception {
        stringOne = new StringOne();
    }

    @DataProvider(name = "withoutX2")
    public Object[][] withoutX2Data() {
        return new  Object[][] {
                { "xHi", "Hi" },
                { "Hxi", "Hi" },
                { "Hi", "Hi" } };
    }

    @DataProvider(name = "withoutX")
    public Object[][] withoutXData() {
        return new  Object[][] {
                { "xHix", "Hi" },
                { "xHi", "Hi" },
                { "Hxix", "Hxi" } };
    }

    @DataProvider(name = "startWord")
    public Object[][] startWordData() {
        return new  Object[][] {
                { "hippo", "hi", "hi" },
                { "hippo", "xip", "hip" },
                { "hippo", "i", "h" } };
    }

    @Test
    public void testHelloName() throws Exception {

    }

    @Test
    public void testMakeAbba() throws Exception {

    }

    @Test
    public void testMakeTags() throws Exception {

    }

    @Test
    public void testMakeOutWord() throws Exception {

    }

    @Test
    public void testExtraEnd() throws Exception {

    }

    @Test
    public void testFirstTwo() throws Exception {

    }

    @Test
    public void testFirstHalf() throws Exception {

    }

    @Test
    public void testWithoutEnd() throws Exception {

    }

    @Test
    public void testComboString() throws Exception {

    }

    @Test
    public void testNonStart() throws Exception {

    }

    @Test
    public void testLeft2() throws Exception {

    }

    @Test
    public void testRight2() throws Exception {

    }

    @Test
    public void testTheEnd() throws Exception {

    }

    @Test
    public void testWithouEnd2() throws Exception {

    }

    @Test
    public void testMiddleTwo() throws Exception {

    }

    @Test
    public void testEndsLy() throws Exception {

    }

    @Test
    public void testNTwice() throws Exception {

    }

    @Test
    public void testTwoChar() throws Exception {

    }

    @Test
    public void testMiddleThree() throws Exception {

    }

    @Test
    public void testHasBad() throws Exception {

    }

    @Test
    public void testAtFirst() throws Exception {

    }

    @Test
    public void testLastChars() throws Exception {

    }

    @Test
    public void testConCat() throws Exception {

    }

    @Test
    public void testLastTwo() throws Exception {

    }

    @Test
    public void testSeeColor() throws Exception {

    }

    @Test
    public void testFrontAgain() throws Exception {

    }

    @Test
    public void testMinCat() throws Exception {

    }

    @Test
    public void testExtraFront() throws Exception {

    }

    @Test
    public void testWithout2() throws Exception {

    }

    @Test
    public void testDeFront() throws Exception {

    }

    @Test(dataProvider = "startWord")
    public void testStartWord(String str, String word, String expected) throws Exception {
        String result = stringOne.startWord(str, word);
        Assert.assertEquals(result, expected);
    }

    @Test(dataProvider = "withoutX")
    public void testWithoutX(String str, String expected) throws Exception {
        String result = stringOne.withoutX(str);
        Assert.assertEquals(result, expected);
    }

    @Test(dataProvider = "withoutX2")
    public void testWithoutX2(String str, String expected) throws Exception {
        String result = stringOne.withoutX2(str);
        Assert.assertEquals(result, expected);
    }
}