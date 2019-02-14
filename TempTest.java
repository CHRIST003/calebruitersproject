package za.ac.cput;

import org.junit.Assert;
import org.junit.Test;

public class TempTest {

    Temperature temp = new Temperature();

    @Test
    public void runCelsiusTemp()
    {
        Assert.assertEquals(32, temp.toCelsius(1));
    }

    @Test
    public void runFahrenheitTemp()
    {
        Assert.assertEquals(0, temp.toFahrenheit(32));
        System.out.print("edited");
    }

}
