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

    @DataProvider(name = "deFront")
    public Object[][] deFrontData() {
        return new  Object[][] {
                { "Hello", "llo" },
                { "java", "va" },
                { "away", "aay" } };
    }

    @DataProvider(name = "without2")
    public Object[][] without2Data() {
        return new  Object[][] {
                { "HelloHe", "lloHe" },
                { "HelloHi", "HelloHi" },
                { "Hi", "" } };
    }

    @DataProvider(name = "extraFront")
    public Object[][] extraFrontData() {
        return new  Object[][] {
                { "Hello", "HeHeHe" },
                { "ab", "ababab" },
                { "H", "HHH" } };
    }

    @DataProvider(name = "minCat")
    public Object[][] minCatData() {
        return new  Object[][] {
                { "Hello", "Hi", "loHi" },
                { "Hello", "java", "ellojava" },
                { "java", "Hello", "javaello" } };
    }

    @DataProvider(name = "frontAgain")
    public Object[][] frontAgainData() {
        return new  Object[][] {
                { "edited", true },
                { "edit", false },
                { "ed", true} };
    }

    @DataProvider(name = "seeColor")
    public Object[][] seeColorData() {
        return new  Object[][] {
                { "redxx", "red" },
                { "xxred", "" },
                { "blueTimes", "blue" } };
    }

    @DataProvider(name = "lastTwo")
    public Object[][] lastTwoData() {
        return new  Object[][] {
                { "coding", "codign" },
                { "cat", "cta" },
                { "ab", "ba" } };
    }

    @DataProvider(name = "conCat")
    public Object[][] conCatData() {
        return new  Object[][] {
                { "abc", "cat", "abcat" },
                { "dog", "cat", "dogcat" },
                { "abc", "", "abc" } };
    }

    @DataProvider(name = "lastChars")
    public Object[][] lastCharsData() {
        return new  Object[][] {
                { "last", "chars", "ls" },
                { "yo", "java", "ya" },
                { "hi", "", "h@" } };
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

    @Test(dataProvider = "lastChars")
    public void testLastChars(String a, String b, String expected) throws Exception {
        String result = stringOne.lastChars(a, b);
        Assert.assertEquals(result, expected);
    }

    @Test(dataProvider = "conCat")
    public void testConCat(String a, String b, String expected) throws Exception {
        String result = stringOne.conCat(a, b);
        Assert.assertEquals(result, expected);
    }

    @Test(dataProvider = "lastTwo")
    public void testLastTwo(String str , String expected) throws Exception {
        String result = stringOne.lastTwo(str);
        Assert.assertEquals(result, expected);
    }

    @Test(dataProvider = "seeColor")
    public void testSeeColor(String str, String expected) throws Exception {
        String result = stringOne.seeColor(str);
        Assert.assertEquals(result, expected);
    }

    @Test(dataProvider = "frontAgain")
    public void testFrontAgain(String str, boolean expected) throws Exception {
        boolean result = stringOne.frontAgain(str);
        Assert.assertEquals(result, expected);
    }

    @Test(dataProvider = "minCat")
    public void testMinCat(String a, String b, String expected) throws Exception {
        String result = stringOne.minCat(a, b);
        Assert.assertEquals(result, expected);
    }

    @Test(dataProvider = "extraFront")
    public void testExtraFront(String str, String expected) throws Exception {
        String result = stringOne.extraFront(str);
        Assert.assertEquals(result, expected);
    }

    @Test(dataProvider = "without2")
    public void testWithout2(String str, String expected) throws Exception {
        String result = stringOne.without2(str);
        Assert.assertEquals(result, expected);
    }

    @Test(dataProvider = "deFront")
    public void testDeFront(String str, String expected) throws Exception {
        String result = stringOne.deFront(str);
        Assert.assertEquals(result, expected);
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