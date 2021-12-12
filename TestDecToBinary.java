import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestDecToBinary {

    Converter converter;

    @Before
    public void setUp() {
        converter = new Converter();
    }

    @Test
    public void testDecToBinary() {
        String actualResult = converter.decToBinary(1234);
        String expectedResult = "10011010010";
        Assert.assertEquals("Decimal to binary conversion is not as expected", expectedResult, actualResult);
    }
}