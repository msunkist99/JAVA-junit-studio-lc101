package test;
import main.BonusBinarySearch;
import org.junit.Test;

import static org.junit.Assert.*;

public class BonusBinarySearchTest {
    @Test
    public void checkForValidIndexFromSearch() {
        int array[] = new int[]{1, 3, 5, 6, 7, 8};
        assertEquals(3, BonusBinarySearch.binarySearch(array,6),0);
    }

    @Test
    public void emptyArray() {
        int array[] = new int[]{};
        assertEquals(-1, BonusBinarySearch.binarySearch(array,6),0);
    }

    @Test
    public void notFound() {
        int array[] = new int[]{};
        assertEquals(-1, BonusBinarySearch.binarySearch(array,4),0);
    }

    @Test
    public void arrayNotSorted() {
        int array[] = new int[]{1, 8, 5, 6, 7, 3};
        assertEquals(-1, BonusBinarySearch.binarySearch(array,4),0);
    }
}
