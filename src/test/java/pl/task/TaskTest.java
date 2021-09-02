package pl.task;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


public class TaskTest {

    @Test
    public void test() {
        Task task = Mockito.mock(Task.class);
        when(task.multiplicationDivisionRemainder(100, 16)).thenReturn(Arrays.asList(1600, 16, 4));
        assertEquals(Arrays.asList(1600, 16, 4), task.multiplicationDivisionRemainder(100, 16));
    }

    @Test
    public void testZero() {
        Task task = Mockito.mock(Task.class);
        when(task.multiplicationDivisionRemainder(0, 0)).thenReturn(Arrays.asList(0, 0, 0));
        assertEquals(Arrays.asList(0, 0, 0), task.multiplicationDivisionRemainder(0, 0));
    }
}
