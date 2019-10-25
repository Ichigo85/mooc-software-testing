package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TwoNumbersSumTest {

    private TwoNumbersSum adder;

    @BeforeEach
    public void initialize() {
        this.adder = new TwoNumbersSum();
    }

    @Test
    public void oneDigitSumOneDigitResult() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);

        ArrayList<Integer> sum = new ArrayList<>();
        sum.add(5);

        ArrayList<Integer> resultSum = adder.addTwoNumbers(list1, list2);
        Assertions.assertArrayEquals(sum.toArray(), resultSum.toArray());
    }

    @Test
    public void twoDigitsSumTwoDigitsResult() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);

        ArrayList<Integer> sum = new ArrayList<>();
        sum.add(2);
        sum.add(4);

        ArrayList<Integer> resultSum = adder.addTwoNumbers(list1, list2);

        Assertions.assertArrayEquals(sum.toArray(), resultSum.toArray());
    }

    @Test
    public void oneDigitSumTwoDigitsResult() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(9);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(9);

        ArrayList<Integer> sum = new ArrayList<>();
        sum.add(1);
        sum.add(8);

        ArrayList<Integer> resultSum = adder.addTwoNumbers(list1, list2);
        Assertions.assertArrayEquals(sum.toArray(), resultSum.toArray());
    }

    @Test
    public void twoDigitsSumOneDigitThreeDigitsResult() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(9);
        list1.add(9);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);

        ArrayList<Integer> sum = new ArrayList<>();
        sum.add(1);
        sum.add(0);
        sum.add(0);

        ArrayList<Integer> resultSum = adder.addTwoNumbers(list1, list2);
        Assertions.assertArrayEquals(sum.toArray(), resultSum.toArray());
    }

}
