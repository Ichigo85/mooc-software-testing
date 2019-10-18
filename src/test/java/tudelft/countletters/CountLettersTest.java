package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatchWithS() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void lastWordDoesNotMatchWithR() {
        int words = new CountLetters().count("artr|dog");
        Assertions.assertEquals(1, words);
    }

    @Test
    void firstWordDoesNotMatchWithS() {
        int words = new CountLetters().count("cat|dogs");
        Assertions.assertEquals(1, words);
    }

    @Test
    void firstWordDoesNotMatchWithR() {
        int words = new CountLetters().count("cat|artr");
        Assertions.assertEquals(1, words);
    }

}