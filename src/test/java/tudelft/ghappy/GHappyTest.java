package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    @Test
    public void allHappyMisc() {
        GHappy happy = new GHappy();
        boolean result = happy.gHappy("xxggxx");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void notAllHappyMisc() {
        GHappy happy = new GHappy();
        boolean result = happy.gHappy("xxggyygxx");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void onlyHappy() {
        GHappy happy = new GHappy();
        boolean result = happy.gHappy("gggggg");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void onlyNotHappy() {
        GHappy happy = new GHappy();
        boolean result = happy.gHappy("agbg");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void oneHappy() {
        GHappy happy = new GHappy();
        boolean result = happy.gHappy("gg");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void oneNotHappy() {
        GHappy happy = new GHappy();
        boolean result = happy.gHappy("g");
        Assertions.assertEquals(false, result);
    }
}
