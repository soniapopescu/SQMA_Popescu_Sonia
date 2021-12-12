import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestDecToHex {

    Converter converter;

    @Before
    public void setUp() {
        converter = new Converter();
    }

    @Test
    public void testDecToHex() {
        String actualResult = converter.decToHex(1234);
        String expectedResult = "4D2";
        Assert.assertEquals("Decimal to hex conversion is not as expected", expectedResult.toLowerCase(), actualResult.toLowerCase());
    }
}