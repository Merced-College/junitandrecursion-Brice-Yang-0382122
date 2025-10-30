

public class UnitTest2{
    //JUnit tests for countHi
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



}