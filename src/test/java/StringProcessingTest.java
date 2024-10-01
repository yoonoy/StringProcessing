import org.example.StringProcessing;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringProcessingTest {

    @Test
    public void isStrongPasswordTest() {
        StringProcessing string = new StringProcessing();

        // Test case 1: Strong password
        assertEquals(true, string.isStrongPassword("Password123!"));
        assertEquals(false, string.isStrongPassword("weakpassword1@"));
        assertEquals(false, string.isStrongPassword("WEAKPASSWORD1@"));
        assertEquals(false, string.isStrongPassword("Password@"));
        assertEquals(true, string.isStrongPassword("Foisbjy9872!"));

    }

    @Test
    public void calculateDigitsTest() {
        StringProcessing string = new StringProcessing();

        assertEquals(3, string.calculateDigits("Am875"));
        assertEquals(7, string.calculateDigits("1230826asdh"));
        assertEquals(8, string.calculateDigits("mnb98643456gd"));
        assertEquals(9, string.calculateDigits("poi098096387kgd"));
        assertEquals(10, string.calculateDigits("asd098753961jgs8"));
    }



}