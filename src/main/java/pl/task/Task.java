package pl.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task {

    public List<Integer> multiplicationDivisionRemainder(int numberOne, int numberTwo) {
        List<Integer> results = new ArrayList<>();
        int multiplication = numberOne * numberTwo;
        int division = numberOne / numberTwo;
        int remainder = numberOne % numberTwo;
        results.addAll(Arrays.asList(multiplication, division, remainder));
        return results;
    }
}
