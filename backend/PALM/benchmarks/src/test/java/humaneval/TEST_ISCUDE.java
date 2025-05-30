package humaneval;

public class TEST_ISCUDE {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        boolean result = humaneval.correct.ISCUDE.iscude(1);
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        boolean result = humaneval.correct.ISCUDE.iscude(2);
        org.junit.Assert.assertEquals(
            result, false
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        boolean result = humaneval.correct.ISCUDE.iscude(-1);
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        boolean result = humaneval.correct.ISCUDE.iscude(64);
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        boolean result = humaneval.correct.ISCUDE.iscude(180);
        org.junit.Assert.assertEquals(
            result, false
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        boolean result = humaneval.correct.ISCUDE.iscude(1000);
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        boolean result = humaneval.correct.ISCUDE.iscude(0);
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        boolean result = humaneval.correct.ISCUDE.iscude(1729);
        org.junit.Assert.assertEquals(
            result, false
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        boolean result = humaneval.correct.ISCUDE.iscude(-8);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
}
