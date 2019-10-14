package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    /*
     * Triangle exists
     */
    @Test
    public void whenExist() {
        boolean result = Triangle.exist(2.0, 2.0, 2.0);
        assertThat(result, is(true));
    }

    /*
     * Triangle does not exist
     */
    @Test
    public void whenDoesNotExist() {
        boolean result = Triangle.DoesNotExist(5.0, 2.0, 1.0);
        assertThat(result, is(true));
    }

}

