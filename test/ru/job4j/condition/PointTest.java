package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when000to020then2() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 3, 0);
        double rsl = a.distance(b);
        assertThat(rsl, closeTo(2, 001));
    }
}