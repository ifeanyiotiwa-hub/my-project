package dev.learninggithubactions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MvnTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void addTwoNumbers() {
        assertEquals(10, Mvn.addTwoNumbers(5, 2));
        assertEquals(130, Mvn.addTwoNumbers(13, 10))
;    }
}