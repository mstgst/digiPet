package virtual_pet;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class VirtualPetTest {
    String out;

    @Test
    void testBored() {
        VirtualPet testPet = new VirtualPet("test");
        testPet.setBored(25);
        testPet.play(1);
        assertTrue(testPet.getBored() == 26);
    }
}
