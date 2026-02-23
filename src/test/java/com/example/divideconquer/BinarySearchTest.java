package com.example.divideconquer;

import com.divideconquer.BinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTest {

    @Test
    void testElementFoundMiddle() {
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(2, BinarySearch.search(arr, 5));
    }

    @Test
    void testElementFoundFirst() {
        int[] arr = {2, 4, 6, 8};
        assertEquals(0, BinarySearch.search(arr, 2));
    }

    @Test
    void testElementFoundLast() {
        int[] arr = {2, 4, 6, 8};
        assertEquals(3, BinarySearch.search(arr, 8));
    }

    @Test
    void testElementNotFound() {
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(-1, BinarySearch.search(arr, 4));
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        assertEquals(-1, BinarySearch.search(arr, 10));
    }

    @Test
    void testSingleElementFound() {
        int[] arr = {5};
        assertEquals(0, BinarySearch.search(arr, 5));
    }

    @Test
    void testSingleElementNotFound() {
        int[] arr = {5};
        assertEquals(-1, BinarySearch.search(arr, 1));
    }

    @Test
    void testNegativeNumbers() {
        int[] arr = {-10, -5, 0, 5, 10};
        assertEquals(1, BinarySearch.search(arr, -5));
    }
}