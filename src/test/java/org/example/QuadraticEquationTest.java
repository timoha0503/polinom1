package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class QuadraticEquationTest {

    @Test
    void solveEquation() {
        assertEquals(Arrays.asList(-2.0), new QuadraticEquation(1, 4, 4).solveEquation());
        assertEquals(Arrays.asList(), new QuadraticEquation(1, 1, 1).solveEquation());
        assertEquals(Arrays.asList(3.0, 2.0), new QuadraticEquation(1, -5, 6).solveEquation());
        assertEquals(Arrays.asList(-4.0), new QuadraticEquation(0, 1, 4).solveEquation());
    }
}