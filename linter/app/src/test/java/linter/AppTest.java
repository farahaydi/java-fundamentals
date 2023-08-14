package linter;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import static linter.App.JavaScriptLinter;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    @Test
    void testManyErrors() throws IOException, FileNotFoundException {
        App testLinter = new App();
        String path = "C:\\Users\\farah\\java-projects\\java-fundamentals\\linter\\app\\src\\test\\resources\\gates.js";
        String expectedErrors =
                "Line 3: Missing semicolon.\n" +
                        "Line 5: Missing semicolon.\n" +
                        "Line 11: Missing semicolon.\n" +
                        "Line 13: Missing semicolon.\n" +
                        "Line 15: Missing semicolon.\n" +
                        "Line 26: Missing semicolon.\n" +
                        "Line 28: Missing semicolon.\n" +
                        "Line 32: Missing semicolon.\n" +
                        "Line 36: Missing semicolon.\n" +
                        "Line 40: Missing semicolon.\n" +
                        "Line 41: Missing semicolon.\n" +
                        "Line 50: Missing semicolon.\n" +
                        "Line 51: Missing semicolon.\n" +
                        "Line 59: Missing semicolon.\n" +
                        "Line 60: Missing semicolon.\n" +
                        "Line 61: Missing semicolon.\n" +
                        "Line 62: Missing semicolon.\n" +
                        "Line 64: Missing semicolon.\n" +
                        "Line 70: Missing semicolon.\n" +
                        "Line 71: Missing semicolon.\n" +
                        "Line 72: Missing semicolon.\n" +
                        "Line 73: Missing semicolon.\n" +
                        "Line 74: Missing semicolon.\n" +
                        "Line 76: Missing semicolon.\n" +
                        "Line 77: Missing semicolon.\n" +
                        "Line 78: Missing semicolon.\n" +
                        "Line 79: Missing semicolon.\n" +
                        "Line 80: Missing semicolon.\n" +
                        "Line 82: Missing semicolon.\n" +
                        "Line 83: Missing semicolon.\n" +
                        "Line 84: Missing semicolon.\n" +
                        "Line 85: Missing semicolon.\n" +
                        "Line 86: Missing semicolon.\n" +
                        "Line 88: Missing semicolon.\n" +
                        "Line 89: Missing semicolon.\n" +
                        "Line 90: Missing semicolon.\n" +
                        "Line 91: Missing semicolon.\n" +
                        "Line 92: Missing semicolon.\n" +
                        "Line 94: Missing semicolon.\n" +
                        "Line 95: Missing semicolon.\n" +
                        "Line 96: Missing semicolon.\n" +
                        "Line 97: Missing semicolon.\n" +
                        "Line 98: Missing semicolon.\n" +
                        "Line 99: Missing semicolon.\n" +
                        "Line 100: Missing semicolon.\n" +
                        "Line 101: Missing semicolon.\n";
        assertEquals(expectedErrors, JavaScriptLinter(path));
    }
    @Test
    void emptyFiles() throws FileNotFoundException {
        App testEmpty =new App();
        String path = "C:\\Users\\farah\\java-projects\\java-fundamentals\\linter\\app\\src\\test\\resources\\emptyFile.js";

        assertEquals("",testEmpty.JavaScriptLinter(path));
    }

    @Test
    void oneError() throws FileNotFoundException {
        App testEmpty =new App();
        String path = "C:\\Users\\farah\\java-projects\\java-fundamentals\\linter\\app\\src\\test\\resources\\containsOneError.js";
        assertEquals("Line 1: Missing semicolon.\n", testEmpty.JavaScriptLinter(path));
    }

    @Test
    void fewErrors() throws FileNotFoundException {
        App testEmpty =new App();
        String path = "C:\\Users\\farah\\java-projects\\java-fundamentals\\linter\\app\\src\\test\\resources\\containsFewErrors.js";
        assertEquals("Line 1: Missing semicolon.\n" +
                "Line 2: Missing semicolon.\n" +
                "Line 3: Missing semicolon.\n" +
                "Line 4: Missing semicolon.\n" +
                "Line 5: Missing semicolon.\n", testEmpty.JavaScriptLinter(path));
    }

    @Test
    void noError() throws FileNotFoundException {
        App testEmpty =new App();
        String path = "C:\\Users\\farah\\java-projects\\java-fundamentals\\linter\\app\\src\\test\\resources\\containsNoErrors.js";
        assertEquals("", testEmpty.JavaScriptLinter(path));
    }



}