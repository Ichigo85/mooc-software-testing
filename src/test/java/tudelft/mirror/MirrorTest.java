package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MirrorTest {

    @Test
    public void palindromo(){
        Mirror mirror = new Mirror();
        String result = mirror.mirrorEnds("abba");
        Assertions.assertEquals("ab", result);
    }

    @Test
    public void nonPalindromo() {
        Mirror mirror = new Mirror();
        String result = mirror.mirrorEnds("bacca");
        Assertions.assertEquals("", result);
    }

    @Test
    public void parzialmentePalindromaPari() {
        Mirror mirror = new Mirror();
        String result = mirror.mirrorEnds("abCDba");
        Assertions.assertEquals("ab", result);
    }

    @Test
    public void parzialmentePalindromaDispari() {
        Mirror mirror = new Mirror();
        String result = mirror.mirrorEnds("ABCDCBA");
        Assertions.assertEquals("ABCDCBA", result);
    }


}
