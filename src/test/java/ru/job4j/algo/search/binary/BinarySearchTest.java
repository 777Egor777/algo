package ru.job4j.algo.search.binary;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void getIndexOfValue() {
        int[] array = {1, 3, 6, 10, 11, 12, 16, 20, 111, 234, 444, 500, 511, 1243, 2344};
        BinarySearch search = new BinarySearch(array);
        assertThat(search.getIndexOfValue(11), is(4));
    }
}