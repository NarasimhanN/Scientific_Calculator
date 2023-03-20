import org.junit.*;


public class CalculatorTest {

    @Test
    public void TestSqrt(){
    Assert.assertEquals(5.0,Calculator.findSquareRoot(25),.1f);
    }
    @Test
    public void TestFact(){
        Assert.assertEquals(120.0,Calculator.findFactorial(5),.1f);
    }
    @Test
    public void TestNatLog(){
        Assert.assertEquals(1.0,Calculator.findNaturalLog(2.718),0.2f);
    }
    @Test
    public void TestPow(){
        Assert.assertEquals(8.0,Calculator.findPower(2,3),.1f);
    }

}
