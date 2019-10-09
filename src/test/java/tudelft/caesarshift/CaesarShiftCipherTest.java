package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import tudelft.chocolate.ChocolateBags;

public class CaesarShiftCipherTest {

    @ParameterizedTest(name = "message={0}, shift={1}, result={2}")
    @CsvSource({"abc,3,def", "abc,1,bcd", "abc,-1,zab", "abc,-3,xyz"})
    public void validCipher(String message, int shift, String expectedResult) {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String result = cipher.CaesarShiftCipher(message, shift);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest(name = "message={0}, shift={1}, result={2}")
    @CsvSource({"abc def,3,def ghi", "abc def,1,bcd efg", "abc def,-1,zab cde", "abc def,-3,xyz abc"})
    public void validCipherWithSpaces(String message, int shift, String expectedResult) {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String result = cipher.CaesarShiftCipher(message, shift);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest(name = "message={0}, shift={1}")
    @CsvSource({"abc_,3", "ab:c,1", "ab$c,-1", "abòc,-3"})
    public void invalidCipher(String message, int shift) {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String result = cipher.CaesarShiftCipher(message, shift);
        Assertions.assertEquals("invalid", result);
    }

    @Test
    public void emptyShift() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String result = cipher.CaesarShiftCipher("abc", 0);
        Assertions.assertEquals("abc", result);
    }

}
