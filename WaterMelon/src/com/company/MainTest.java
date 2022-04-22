package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void equal() {
        String ans = "YES";
        String ans2= "NO";
        var equal = new Main();
        assertEquals(ans2,equal.watermelon(3));
    }
    @Test
    void equal1() {
        String ans = "YES";
        String ans2= "NO";
        var equal1 = new Main();
        assertEquals(ans,equal1.watermelon(8));
      }
    @Test
    void equal2() {
        String ans = "YES";
        String ans2= "NO";
        var equal = new Main();
        assertEquals(ans2,equal.watermelon(0));}

    @Test
    void equal3() {
        String ans = "YES";
        String ans2= "NO";
        var equal = new Main();
        assertEquals(ans2,equal.watermelon(99));}
    }