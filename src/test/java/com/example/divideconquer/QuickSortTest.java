package com.example.divideconquer;

import com.divideconquer.QuickSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuickSortTest {

    @Test
    void testSorting() {
        int[] arr = {10, 7, 8, 9, 1, 5};
        QuickSort.sort(arr);
        assertArrayEquals(new int[]{1, 5, 7, 8, 9, 10}, arr);
    }

    @Test
    void testRandomArray() {
        int[] arr = {10, 7, 8, 9, 1, 5};
        QuickSort.sort(arr);
        assertArrayEquals(new int[]{1, 5, 7, 8, 9, 10}, arr);
    }

    @Test
    void testAlreadySorted() {
        int[] arr = {1, 2, 3, 4, 5};
        QuickSort.sort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void testReverseSorted() {
        int[] arr = {5, 4, 3, 2, 1};
        QuickSort.sort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void testDuplicates() {
        int[] arr = {3, 1, 2, 3, 1};
        QuickSort.sort(arr);
        assertArrayEquals(new int[]{1, 1, 2, 3, 3}, arr);
    }

    @Test
    void testNegativeNumbers() {
        int[] arr = {-2, -5, 3, 0};
        QuickSort.sort(arr);
        assertArrayEquals(new int[]{-5, -2, 0, 3}, arr);
    }

    @Test
    void testSingleElement() {
        int[] arr = {100};
        QuickSort.sort(arr);
        assertArrayEquals(new int[]{100}, arr);
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        QuickSort.sort(arr);
        assertArrayEquals(new int[]{}, arr);
    }
}