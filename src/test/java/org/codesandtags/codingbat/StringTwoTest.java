package org.codesandtags.codingbat;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringTwoTest {

    private StringTwo string2;

    @BeforeTest
    public void init() {
        string2 = new StringTwo();
    }

    @DataProvider(name = "doubleChar")
    public Object[][] doubleCharData() {
        return new  Object[][] {
                { "The", "TThhee" },
                { "AAbb", "AAAAbbbb" },
                { "Hi-There", "HHii--TThheerree" } };
    }


    @DataProvider(name = "countHi")
    public Object[][] countHiData() {
        return new  Object[][] {
                { "abc hi ho", 1 },
                { "ABChi hi", 2 },
                { "hihi", 2 } };
    }

    @DataProvider(name = "catDog")
    public Object[][] catDogData() {
        return new  Object[][] {
                { "catdog", true },
                { "catcat", false },
                { "1cat1cadodog", true } };
    }

    @DataProvider(name = "countCode")
    public Object[][] countCodeData() {
        return new  Object[][] {
                { "aaacodebbb", 1 },
                { "codexxcode", 2 },
                { "cozexxcope", 2 } };
    }

    @DataProvider(name = "endOther")
    public Object[][] endOtherData() {
        return new  Object[][] {
                { "Hiabc", "abc", true },
                { "AbC", "HiaBc", true },
                { "abc", "abXabc", true } };
    }

    @DataProvider(name = "xyzThere")
    public Object[][] xyzThereData() {
        return new  Object[][] {
                { "abcxyz", true },
                { "abc.xyz", false},
                { "xyz.abc", true },
                { "abc.xyzxyz", true}};
    }

    @DataProvider(name = "bobThere")
    public Object[][] bobThereData(){
        return new Object[][]{
                {"abcbob", true},
                {"b9b", true},
                {"bac", false}
        };
    }

    @DataProvider(name = "mixString")
    public Object[][] mixStringData(){
        return new Object[][]{
                {"abc", "xyz", "axbycz"},
                {"Hi", "There", "HTihere"},
                {"xxxx", "There", "xTxhxexre"}
        };
    }

    @DataProvider(name = "xyBalance")
    public Object[][] xyBalanceData(){
        return new Object[][]{
                {"aaxbby", true},
                {"aaxbb", false},
                {"yaaxbb", false}
        };
    }

    @DataProvider(name = "repeatEnd")
    public Object[][] repeatEndData(){
        return new Object[][]{
                {"Hello", 3, "llollollo"},
                {"Hello", 2, "lolo"},
                {"Hello", 1, "o"}
        };
    }

    @DataProvider(name = "repeatFront")
    public Object[][] repeatFrontData(){
        return new Object[][]{
                {"Chocolate", 4, "ChocChoChC"},
                {"Chocolate", 3, "ChoChC"},
                {"Ice Cream", 2, "IcI"}
        };
    }

    @DataProvider(name = "repeatSeparator")
    public Object[][] repeatSeparatorData(){
        return new Object[][]{
                {"Word","X", 3, "WordXWordXWord"},
                {"This","And", 2, "ThisAndThis"},
                {"This", "And", 1, "This"}
        };
    }

    @DataProvider(name = "prefixAgain")
    public Object[][] prefixAgainData(){
        return new Object[][]{
                {"abXYabc", 1, true},
                {"abXYabc", 2, true},
                {"abXYabc", 3, false}
        };
    }

    @DataProvider(name = "xyzMiddle")
    public Object[][] xyzMiddleData(){
        return new Object[][]{
                {"AAxyzBB", true},
                {"AxyzBB", true},
                {"AxyzBBB", false}
        };
    }

    @DataProvider(name = "getSandwich")
    public Object[][] getSandwichData(){
        return new Object[][]{
                {"breadjambread", "jam"},
                {"xxbreadjambreadyy", "jam"},
                {"xxbreadyy", ""}
        };
    }

    @Test(dataProvider = "countHi", timeOut = 5000)
    public void testCountHi(String str, int expected) {
        int result = string2.countHi(str);
        Assert.assertEquals(result, expected);
    }

    @Test(dataProvider="catDog", timeOut = 5000)
    public void testCatDog(String str, boolean expected){
        boolean result = string2.catDog(str);
        Assert.assertEquals(result, expected);
    }

    @Test(dataProvider="countCode", timeOut = 5000)
    public void testCountCode(String str, int expected){
        int result = string2.countCode(str);
        Assert.assertEquals(result, expected);
    }

    @Test(dataProvider="doubleChar", timeOut = 5000)
    public void testDoubleChar(String str, String expected){
        String result = string2.doubleChar(str);
        Assert.assertEquals(result, expected);
    }

    @Test(dataProvider="endOther", timeOut = 5000)
    public void testEndOtherData(String a, String b, boolean expected){
        boolean result = string2.endOther(a, b);
        Assert.assertEquals(result, expected);
    }

    @Test(dataProvider="xyzThere", timeOut = 5000)
    public void testXyzThere(String str, boolean expected) {
        boolean result = string2.xyzThere(str);
        Assert.assertEquals(result, expected);
    }

    @Test(dataProvider = "bobThere")
    public void testBobThere(String str, boolean expected) {
        boolean result = string2.bobThere(str);
        Assert.assertEquals(result, expected);
    }

    @Test(dataProvider = "mixString")
    public void testMixString(String a, String b, String expected) {
        String result = string2.mixString(a, b);
        Assert.assertEquals(result, expected);
    }

    @Test(dataProvider = "xyBalance")
    public void testXyBalance(String str, boolean expected){
        boolean result = string2.xyBalance(str);
        Assert.assertEquals(result, expected);
    }

    @Test(dataProvider = "repeatSeparator")
    public void testRepeatSeparator(String word, String separator, int count, String expected) throws Exception {
        String result = string2.repeatSeparator(word, separator, count);
        Assert.assertEquals(result, expected);
    }

    @Test(dataProvider = "prefixAgain")
    public void testPrefixAgain(String str, int n, boolean expected) throws Exception {
        boolean result = string2.prefixAgain(str, n);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void testXyzMiddle() throws Exception {

    }

    @Test
    public void testGetSandwich() throws Exception {

    }

    @Test
    public void testSameStarChar() throws Exception {

    }

    @Test
    public void testZipZap() throws Exception {

    }

    @Test
    public void testStarOut() throws Exception {

    }

    @Test
    public void testPlusOut() throws Exception {

    }

    @Test
    public void testWordEnds() throws Exception {

    }

    @Test(dataProvider = "repeatEnd")
    public void testRepeatEnd(String str, int n, String expected) throws Exception {
        String result = string2.repeatEnd(str, n);
        Assert.assertEquals(result, expected);
    }

    @Test(dataProvider = "repeatFront")
    public void testRepeatFront(String str, int n, String expected) throws Exception {
        String result = string2.repeatFront(str, n);
        Assert.assertEquals(result, expected);
    }
}