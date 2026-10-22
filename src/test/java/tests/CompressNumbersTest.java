package tests;

import main.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CompressNumbersTest {

    @Test
    public void shouldCollapseConsecutiveDuplicates_whenInputHasPairs() {
        int[] input = new int[]{1, 1, 2, 2, 3};
        int[] expected = new int[]{1, 2, 3};
        assertArrayEquals(expected, Main.compressNumbers(input));
    }

    @Test
    public void shouldKeepNonAdjacentDuplicates_whenSameValueReturnsLater() {
        int[] input = new int[]{1, 2, 3, 1};
        int[] expected = new int[]{1, 2, 3, 1};
        assertArrayEquals(expected, Main.compressNumbers(input));
    }

    @Test
    public void shouldReturnEmptyArray_whenInputIsEmpty() {
        int[] input = new int[]{};
        int[] expected = new int[]{};
        assertArrayEquals(expected, Main.compressNumbers(input));
    }

    @Test
    public void shouldReturnSameArray_whenNoConsecutiveDuplicates() {
        int[] input = new int[]{1, 2, 3};
        int[] expected = new int[]{1, 2, 3};
        assertArrayEquals(expected, Main.compressNumbers(input));
    }

    @Test
    public void shouldReturnSingleElement_whenInputHasOneElement() {
        int[] input = new int[]{1};
        int[] expected = new int[]{1};
        assertArrayEquals(expected, Main.compressNumbers(input));
    }

    @Test
    public void shouldReturnOneElement_whenAllValuesIdentical() {
        int[] input = new int[]{1, 1, 1, 1};
        int[] expected = new int[]{1};
        assertArrayEquals(expected, Main.compressNumbers(input));
    }

    @Test
    public void shouldCollapseGroupsOfAnyLength_whenGroupsDifferInSize() {
        int[] input = new int[]{1, 1, 2, 2, 2, 3, 3, 3, 3};
        int[] expected = new int[]{1, 2, 3};
        assertArrayEquals(expected, Main.compressNumbers(input));
    }

    @Test
    public void shouldHandleNegativeValues_whenInputContainsNegatives() {
        int[] input = new int[]{-1, -1, 0, 0, 1, 1};
        int[] expected = new int[]{-1, 0, 1};
        assertArrayEquals(expected, Main.compressNumbers(input));
    }

    @Test
    public void shouldCollapsePair_whenInputHasTwoIdentical() {
        int[] input = new int[]{1, 1};
        int[] expected = new int[]{1};
        assertArrayEquals(expected, Main.compressNumbers(input));
    }

    @Test
    public void shouldKeepAlternatingValues_whenValuesAlternate() {
        int[] input = new int[]{1, 2, 1, 2, 1, 2};
        int[] expected = new int[]{1, 2, 1, 2, 1, 2};
        assertArrayEquals(expected, Main.compressNumbers(input));
    }
}
