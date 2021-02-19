package unittesting;

import org.testng.Assert;
import org.testng.annotations.Test;
public class CalculatorTest {

    @Test
    public int addTest(){
        Calculator calculator = new Calculator();
        int actualResult = calculator.add(2, 4);
        int expectResults = 6;
        Assert.assertEquals(expectResults, actualResult);
        return actualResult;
    }
}
