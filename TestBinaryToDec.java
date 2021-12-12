import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestBinaryToDec extends TestCase {

    Converter converter;

    @Before
    public void setUp() {
        converter = new Converter();
    }

    @Test
    public void testBinaryToDec() {
        int actualResult = converter.binaryToDec("10011010010");
        int expectedResult = 1234;
        Assert.assertEquals("Binary to decimal conversion is not as expected", expectedResult, actualResult);
    }
}