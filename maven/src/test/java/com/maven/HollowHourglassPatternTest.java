package com.maven;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class HollowHourglassPatternTest {

    @Test
    public void testPrintNameInStars() {
        // Redirecting output to capture it for testing
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Test with a sample name
        String name = "safu";
        HollowHourglassPattern.printNameInStars(name);

        // Expected output
        String expectedOutput = "* * * * \n"; // Adjust based on the actual output format

        // Check if the output matches
        assertEquals(expectedOutput, outContent.toString().trim());

        // Reset the output
        System.setOut(System.out);
    }

    @Test
    public void testEmptyName() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        String name = "";
        HollowHourglassPattern.printNameInStars(name);

        // Expected output for empty name
        String expectedOutput = ""; // No output for empty name

        assertEquals(expectedOutput, outContent.toString().trim());

        System.setOut(System.out);
    }

    @Test
    public void testSingleCharacterName() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        String name = "A";
        HollowHourglassPattern.printNameInStars(name);

        // Expected output for single character 'A'
        String expectedOutput = "  *   * *  ***** ***** *   * *   * "; // Adjust based on the actual output format

        assertEquals(expectedOutput, outContent.toString().trim());

        System.setOut(System.out);
    }
}
