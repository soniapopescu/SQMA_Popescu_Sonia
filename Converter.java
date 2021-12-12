public class Converter {

    public String decToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    public String decToHex(int decimal) {
        return Integer.toHexString(decimal);
    }

    public Integer binaryToDec(String binary) {
        return Integer.parseInt(binary,2);
    }

}
