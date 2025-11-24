

public class UnitTest{


// JUnit tests for countHi

    @org.junit.Test
    public void testcountHi1(){
        int result = countHi.count("xxhixx");
        org.junit.Assert.assertEquals(1, result);
    }

    @org.junit.Test
    public void testcountHi2(){
        int result = countHi.count("xxhixxhi");
        org.junit.Assert.assertEquals(2, result);
    }

    @org.junit.Test
    public void testcountHi3(){
        int result = countHi.count("xxxx");
        org.junit.Assert.assertEquals(0, result);
    }

    @org.junit.Test
    public void testcountHi4(){
        int result = countHi.count("");
        org.junit.Assert.assertEquals(0, result);
    }

    @org.junit.Test
    public void testcountHi5(){
        int result = countHi.count(null);
        org.junit.Assert.assertEquals(0, result);
    }


//-------------------------------------------------------------


// JUnit tests for countEights

    @org.junit.Test
    public void testcountEights1(){
        int result = countEights.count(81818181);
        org.junit.Assert.assertEquals(4, result);
    }

    @org.junit.Test
    public void testcountEights2(){
        int result = countEights.count(8818);
        org.junit.Assert.assertEquals(4, result);
    }

    @org.junit.Test
    public void testcountEights3(){
        int result = countEights.count(1238886);
        org.junit.Assert.assertEquals(5, result);
    }

    @org.junit.Test
    public void testcountEights4(){
        int result = countEights.count(0);
        org.junit.Assert.assertEquals(0, result);
    }

    @org.junit.Test
    public void testcountEights5(){
        int result = countEights.count(8);
        org.junit.Assert.assertEquals(1, result);
    }

//-------------------------------------------------------------


// JUnit tests for countHi2

    @org.junit.Test
    public void testcountXH1(){
        int result = countXHi.count("ahixhi");
        org.junit.Assert.assertEquals(1, result);
    }

    @org.junit.Test
    public void testcountXHi2(){
        int result = countXHi.count("ahibhi");
        org.junit.Assert.assertEquals(2, result);
    }

    @org.junit.Test
    public void testcountXHi3(){
        int result = countXHi.count("xhixhi");
        org.junit.Assert.assertEquals(0, result);
    }

    @org.junit.Test
    public void testcountXHi4(){
        int result = countXHi.count("");
        org.junit.Assert.assertEquals(0, result);
    }

    @org.junit.Test
    public void testcountXHi5(){
        int result = countXHi.count(null);
        org.junit.Assert.assertEquals(0, result);
    }

//-------------------------------------------------------------


// Junit tests for strCount

    @org.junit.Test
    public void strCount1(){
        int result = strCount.count("catcowcat", "cat");
        org.junit.Assert.assertEquals(2, result);
    }

    @org.junit.Test
    public void strCount2(){
        int result = strCount.count("catcowcat", "cow");
        org.junit.Assert.assertEquals(1, result);
    }

    @org.junit.Test
    public void strCount3(){
        int result = strCount.count("catcowcat", "dog");
        org.junit.Assert.assertEquals(0, result);
    }

    @org.junit.Test
    public void strCount4(){
        int result = strCount.count(null, "cat");
        org.junit.Assert.assertEquals(0, result);
    }

    @org.junit.Test
    public void strCount5(){
        int result = strCount.count("catcowcat", null);
        org.junit.Assert.assertEquals(0, result);
}

//-------------------------------------------------------------


// Junit tests for stringClean

    @org.junit.Test
    public void stringClean1(){
        String result = stringClean.clean("yyzzza");
        org.junit.Assert.assertEquals("yza", result);
    }

    @org.junit.Test
    public void stringClean2(){
        String result = stringClean.clean("abbbcdd");
        org.junit.Assert.assertEquals("abcd", result);
    }

    @org.junit.Test
    public void stringClean3(){
        String result = stringClean.clean("Hello");
        org.junit.Assert.assertEquals("Helo", result);
    }

    @org.junit.Test
    public void stringClean4(){
        String result = stringClean.clean("yyzzza");
        org.junit.Assert.assertEquals("yza", result);
    }

    @org.junit.Test
    public void stringClean5(){
        String result = stringClean.clean("yyzzza");
        org.junit.Assert.assertEquals("yza", result);
}

}