package com.example.divideconquer;

import com.divideconquer.StrassenMatrixMultiplication;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StrassenMatrixMultiplicationTest {

    @Test
    void test2x2MatrixMultiplication() {
        int[][] A = {
                {1, 2},
                {3, 4}
        };

        int[][] B = {
                {5, 6},
                {7, 8}
        };

        int[][] expected = {
                {19, 22},
                {43, 50}
        };

        int[][] result = StrassenMatrixMultiplication.multiply(A, B);

        assertArrayEquals(expected, result);
    }

    @Test
    void test1x1Matrix() {
        int[][] A = {{5}};
        int[][] B = {{4}};

        int[][] result = StrassenMatrixMultiplication.multiply(A, B);

        assertEquals(20, result[0][0]);
    }
}
