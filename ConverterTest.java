public class ConverterTest {

    Converter converter;

    @Before
    public void setUp(){
        converter=new Converter();
    }

    @Test
    public void testDecToBinary() {
        String actualResult = converter.decToBinary(1234);
        String expectedResult = "10011010010";
        Assert.assertEquals("Decimal to binary conversion is not as expected", expectedResult, actualResult);
    }

    @Test
    public void testDecToHex() {
        String actualResult = converter.decToHex(1234);
        String expectedResult = "4D2";
        Assert.assertEquals("Decimal to hex conversion is not as expected", expectedResult.toLowerCase(), actualResult.toLowerCase());
    }

    @Test
    public void testBinaryToDec() {
        int actualResult = converter.binaryToDec("10011010010");
        int expectedResult = 1234;
        Assert.assertEquals("Binary to decimal conversion is not as expected", expectedResult, actualResult);
    }
}