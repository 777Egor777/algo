package ru.job4j.algo.search.ternar;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TernarSearchTest {

    @Test
    public void findPeak() {
        TernarSearch search = new TernarSearch();
        assertThat(search.findPeak(new int[]{
                1, 3, 5, 8, 27, 33, 55, 70, 99, 100, 88, 70, 56, 40, 33, 20, 15, 10, 7, 2, 1
        }), is(100));
    }
}