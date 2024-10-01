import org.example.StringProcessing;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringProcessingTest {

    @Test
    public void isStrongPasswordTest() {
        StringProcessing string = new StringProcessing();

        // Test the isStrongPassword method with various password scenarios
        assertEquals(true, string.isStrongPassword("Password123!"));
        assertEquals(false, string.isStrongPassword("weakpassword1@"));
        assertEquals(false, string.isStrongPassword("WEAKPASSWORD1@"));
        assertEquals(false, string.isStrongPassword("Password@"));
        assertEquals(true, string.isStrongPassword("Foisbjy9872!"));

    }

    // Test the calculateDigits method with various input sentences
    @Test
    public void calculateDigitsTest() {
        StringProcessing string = new StringProcessing();

        assertEquals(3, string.calculateDigits("Am875"));
        assertEquals(7, string.calculateDigits("1230826asdh"));
        assertEquals(8, string.calculateDigits("mnb98643456gd"));
        assertEquals(9, string.calculateDigits("poi098096387kgd"));
        assertEquals(10, string.calculateDigits("asd098753961jgs8"));
    }


    // Test the calculateWords method with various input sentences
    @Test
    public void calculateWordsTest(){
        StringProcessing string = new StringProcessing();

        assertEquals(2, string.calculateWords("Hello World"));
        assertEquals(1, string.calculateWords("Hello"));
        assertEquals(3, string.calculateWords("Hello Java World"));
        assertEquals(4, string.calculateWords("Hello Aiganysh, Java World"));
        assertEquals(0, string.calculateWords(""));
    }


    // Test the calculateExpression method with various mathematical expressions
    @Test
    public void calculateExpressionTest() {
        StringProcessing string = new StringProcessing();

        assertEquals(10, string.calculateExpression("5 + 5"), 0.001, "Expected result: 10.0");
        assertEquals(20, string.calculateExpression("2 * (3 + 4)"), 0.001, "Expected result: 20.0");
        assertEquals(17, string.calculateExpression("2 + 3 * 5 - 1"), 0.001, "Expected result: 17.0");
        assertEquals(3, string.calculateExpression("(12 / 4) + 2"), 0.001, "Expected result: 3.0");
        assertEquals(7, string.calculateExpression("3.5 + 3.7"), 0.001, "Expected result: 7.2");
    }

}