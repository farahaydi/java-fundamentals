package basiclibrary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test
    void testSomeLibraryMethodReturnsTrue() {
        Library sut = new Library();
        assertTrue(sut.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }

    @Test
    void roll() {
        Library sut = new Library();
        ArrayList<Integer> rolledNumbers = sut.roll(3);
        Assertions.assertEquals(3, rolledNumbers.size());
    }


    @Test
    void containsDuplicates() {
        Library sut = new Library();
        int[] array = {1, 2, 3, 4, 7, 1};
        Assertions.assertTrue(sut.containsDuplicates(array));
    }

    @Test
    void calculatingAverages() {
        Library sut = new Library();
        int[] array = {1, 2, 3, 4, 5};
        Assertions.assertEquals(3.0, sut.calculatingAverages(array));
    }

    @Test
    void arraysOfArrays() {
        Library sut = new Library();
        int[][] testingArray = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        Assertions.assertArrayEquals(testingArray[2], sut.arraysOfArrays(testingArray));
    }

    @Test
    void tally() {
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
        String result = Library.tally(votes);

        Assertions.assertEquals("Bush Is Winner, Contest 5 Votes!", result);
    }

    @Test
    void AnalyzingWeatherData() {
        int[][] octoberSeattleWeatherData = {
                {50, 55, 60},
                {62, 65, 70},
                {51, 54, 57}
        };
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Library.AnalyzingWeatherData(octoberSeattleWeatherData);

        System.setOut(System.out);

        String output = outputStream.toString();
        Assertions.assertTrue(output.contains("Minimum Number is : 50"));
        Assertions.assertTrue(output.contains("Maximum Number is : 70"));
        Assertions.assertTrue(output.contains("51 Was Not Found"));
    }
}