package org.codesandtags.codingbat;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StringTwoTest {

    private StringTwo string2;

    @BeforeTest
    public void init() {
        string2 = new StringTwo();
    }

    @DataProvider(name = "doubleCharData")
    public Object[][] doubleCharData() {
        return new  Object[][] {
                { "The", "TThhee" },
                { "AAbb", "AAAAbbbb" },
                { "Hi-There", "HHii--TThheerree" } };
    }


    @DataProvider(name = "countHiData")
    public Object[][] countHiData() {
        return new  Object[][] {
                { "abc hi ho", 1 },
                { "ABChi hi", 2 },
                { "hihi", 2 } };
    }

    @DataProvider(name = "catDogData")
    public Object[][] catDogData() {
        return new  Object[][] {
                { "catdog", true },
                { "catcat", false },
                { "1cat1cadodog", true } };
    }

    @DataProvider(name = "countCodeData")
    public Object[][] countCodeData() {
        return new  Object[][] {
                { "aaacodebbb", 1 },
                { "codexxcode", 2 },
                { "cozexxcope", 2 } };
    }

    @DataProvider(name = "endOtherData")
    public Object[][] endOtherData() {
        return new  Object[][] {
                { "Hiabc", "abc", true },
                { "AbC", "HiaBc", true },
                { "abc", "abXabc", true } };
    }

    @DataProvider(name = "xyzThereData")
    public Object[][] xyzThereData() {
        return new  Object[][] {
                { "abcxyz", true },
                { "abc.xyz", false},
                { "xyz.abc", true },
                { "abc.xyzxyz", true}};
    }

    @DataProvider(name = "bobThereData")
    public Object[][] bobThereData(){
        return new Object[][]{
                {"abcbob", true},
                {"b9b", true},
                {"bac", false}
        };
    }

    @DataProvider(name = "mixStringData")
    public Object[][] mixStringData(){
        return new Object[][]{
                {"abc", "xyz", "axbycz"},
                {"Hi", "There", "HTihere"},
                {"xxxx", "There", "xTxhxexre"}
        };
    }

    @DataProvider(name = "xyBalanceData")
    public Object[][] xyBalanceData(){
        return new Object[][]{
                {"aaxbby", true},
                {"aaxbb", false},
                {"yaaxbb", false}
        };
    }

    @Test(dataProvider = "countHiData", timeOut = 5000)
    public void countHi(String str, int expected) {
        int result = string2.countHi(str);
        Assert.assertEquals(result, expected);
    }

    @Test(dataProvider="catDogData", timeOut = 5000)
    public void catDog(String str, boolean expected){
        boolean result = string2.catDog(str);
        Assert.assertEquals(result, expected);
    }

    @Test(dataProvider="countCodeData", timeOut = 5000)
    public void countCode(String str, int expected){
        int result = string2.countCode(str);
        Assert.assertEquals(result, expected);
    }

    @Test(dataProvider="doubleCharData", timeOut = 5000)
    public void doubleChar(String str, String expected){
        String result = string2.doubleChar(str);
        Assert.assertEquals(result, expected);
    }

    @Test(dataProvider="endOtherData", timeOut = 5000)
    public void endOtherData(String a, String b, boolean expected){
        boolean result = string2.endOther(a, b);
        Assert.assertEquals(result, expected);
    }

    @Test(dataProvider="xyzThereData", timeOut = 5000)
    public void xyzThere(String str, boolean expected) {
        boolean result = string2.xyzThere(str);
        Assert.assertEquals(result, expected);
    }

    @Test(dataProvider = "bobThereData")
    public void bobThere(String str, boolean expected) {
        boolean result = string2.bobThere(str);
        Assert.assertEquals(result, expected);
    }

    @Test(dataProvider = "mixStringData")
    public void mixString(String a, String b, String expected) {
        String result = string2.mixString(a, b);
        Assert.assertEquals(result, expected);
    }

    @Test(dataProvider = "xyBalanceData")
    public void xyBalance(String str, boolean expected){
        boolean result = string2.xyBalance(str);
        Assert.assertEquals(result, expected);
    }
}