package basiclibrary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static basiclibrary.Library.AnalyzingWeatherData;
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
    public void testTallyWinner() {
        // Arrange
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

        // Act
        String result = Library.tally(votes);

        // Assert
        assertEquals("Bush Is Winner , Contes 5 Votes!", result);
    }

    @Test
    public void testTallyTie() {
        // Arrange
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");

        // Act
        String result = Library.tally(votes);

        // Assert
        assertEquals("Bush Is Winner , Contes 2 Votes!", result);
    }

    @Test
    public void testAnalyzingWeatherData() {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        String expected = "High:72\nLow:51\nNever saw temperatures: 63 67 68 69";
        String result = Library.AnalyzingWeatherData(weeklyMonthTemperatures);

        assertEquals(expected, result);
    }
}