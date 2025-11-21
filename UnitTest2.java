

public class UnitTest2{

    // JUnit tests for countHi

    @org.junit.Test
    public void testcountHi1(){
        int result = TestClass2.countHi("xxhixx");
        org.junit.Assert.assertEquals(1, result);
    }

    @org.junit.Test
    public void testcountHi2(){
        int result = TestClass2.countHi("xxhixxhi");
        org.junit.Assert.assertEquals(2, result);
    }

    @org.junit.Test
    public void testcountHi3(){
        int result = TestClass2.countHi("xxxx");
        org.junit.Assert.assertEquals(0, result);
    }

    @org.junit.Test
    public void testcountHi4(){
        int result = TestClass2.countHi("");
        org.junit.Assert.assertEquals(0, result);
    }

    @org.junit.Test
    public void testcountHi5(){
        int result = TestClass2.countHi(null);
        org.junit.Assert.assertEquals(0, result);
    }


////////////////////////////////////////////////////////////////


    // JUnit tests for countEights

    @org.junit.Test
    public void testcountEights1(){
        int result = TestClass2.countEights(81818181);
        org.junit.Assert.assertEquals(4, result);
    }

    @org.junit.Test
    public void testcountEights2(){
        int result = TestClass2.countEights(8818);
        org.junit.Assert.assertEquals(4, result);
    }

    @org.junit.Test
    public void testcountEights3(){
        int result = TestClass2.countEights(1238886);
        org.junit.Assert.assertEquals(5, result);
    }

    @org.junit.Test
    public void testcountEights4(){
        int result = TestClass2.countEights(0);
        org.junit.Assert.assertEquals(0, result);
    }

    @org.junit.Test
    public void testcountEights5(){
        int result = TestClass2.countEights(8);
        org.junit.Assert.assertEquals(1, result);
    }

}