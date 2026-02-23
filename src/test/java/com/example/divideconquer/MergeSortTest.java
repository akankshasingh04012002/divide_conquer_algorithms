package com.example.divideconquer;

import com.divideconquer.MergeSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MergeSortTest {

    @Test
    void testSorting() {
        int[] arr = {5, 2, 8, 1, 3};
        MergeSort.sort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 5, 8}, arr);
    }

    @Test
    void testRandomArray() {
        int[] arr = {5, 2, 8, 1, 3};
        MergeSort.sort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 5, 8}, arr);
    }

    @Test
    void testAlreadySorted() {
        int[] arr = {1, 2, 3, 4, 5};
        MergeSort.sort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void testReverseSorted() {
        int[] arr = {5, 4, 3, 2, 1};
        MergeSort.sort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void testDuplicates() {
        int[] arr = {4, 2, 4, 1, 2};
        MergeSort.sort(arr);
        assertArrayEquals(new int[]{1, 2, 2, 4, 4}, arr);
    }

    @Test
    void testNegativeNumbers() {
        int[] arr = {-3, -1, -7, 2};
        MergeSort.sort(arr);
        assertArrayEquals(new int[]{-7, -3, -1, 2}, arr);
    }

    @Test
    void testSingleElement() {
        int[] arr = {10};
        MergeSort.sort(arr);
        assertArrayEquals(new int[]{10}, arr);
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        MergeSort.sort(arr);
        assertArrayEquals(new int[]{}, arr);
    }
}