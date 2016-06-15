import org.junit.Assert;

import static org.junit.Assert.*;

/**
 * Created by azubrilkin on 6/9/2016.
 */
public class CalculatorTest {
    @org.junit.Test
    public void sum() throws Exception {
        Calculator calc = new Calculator();
        int result = calc.Sum(2, 3);
        Assert.assertEquals(result, 5);
    }

    @org.junit.Test
    public void multiply() throws Exception {
        Calculator calc = new Calculator();
        int result = calc.Multiply(2, 3);
        Assert.assertEquals(result, 6);
    }

}