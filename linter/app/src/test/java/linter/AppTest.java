package linter;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void testNoErrors() {
        try {
            JavaScriptLinter("src/test/resources/no_errors.js");
        } catch (FileNotFoundException e) {
            fail("Test file not found.");
        }
    }

    @Test
    void testOneError() {
        try {
            JavaScriptLinter("src/test/resources/one_error.js");
        } catch (FileNotFoundException e) {
            fail("Test file not found.");
        }
    }

    @Test
    void testFewErrors() {
        try {
            JavaScriptLinter("src/test/resources/few_errors.js");
        } catch (FileNotFoundException e) {
            fail("Test file not found.");
        }
    }

    @Test
    void testManyErrors() {
        try {
            JavaScriptLinter("src/test/resources/many_errors.js");
        } catch (FileNotFoundException e) {
            fail("Test file not found.");
        }
    }

    @Test
    void testEmptyFile() {
        try {
            JavaScriptLinter("src/test/resources/empty_file.js");
        } catch (FileNotFoundException e) {
            fail("Test file not found.");
        }
    }

    private void JavaScriptLinter(String path) throws FileNotFoundException {

    }
}
