import org.junit.*;


public class CalculatorTest {

    @Test
    public void TestAddition1(){
    Assert.assertEquals(3,Calculator.addition(1,2));
    }
    @Test
    public void TestAddition2(){
        Assert.assertEquals(0,Calculator.addition(121,-121));
    }
    @Test
    public void TestSubtraction1(){
        Assert.assertEquals(-1,Calculator.subtraction(1,2));
    }
    @Test
    public void TestSubtraction2(){
        Assert.assertEquals(8,Calculator.subtraction(10,2));
    }

}
