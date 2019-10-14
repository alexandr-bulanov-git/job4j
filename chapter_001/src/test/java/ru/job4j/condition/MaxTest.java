package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

     /**
      * Right max.
      */
    @Test
    public void whenLeftLessRight() {
        int result = Max.max(1,2);
        assertThat(result, is(2));
    }
     /**
      * Left max.
      */
    @Test
    public void whenRightLessLeft() {
            int result = Max.max(2, -1);
            assertThat(result, is(2));
    }
    /**
     * Left equally Right max.
     */
    @Test
    public void whenRightEquallyLeft() {
        int result = Max.max(2, 2);
        assertThat(result, is(2));
    }


}
