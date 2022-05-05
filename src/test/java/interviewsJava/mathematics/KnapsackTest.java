package interviewsJava.mathematics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KnapsackTest {

    @Test
    void zeroOneKnapsackTest ()
    {
        int[] values;
        int[] weights;
        int capacity;
        int[] result;

        values = new int[] {1,2,3};
        weights = new int[] {4,5};
        capacity = 4;
        assertArrayEquals(null, Knapsack.zeroOneKnapsack(values, weights, capacity));

        values = new int[] {0};
        weights = new int[] {0};
        capacity = 4;
        result = new int[] {};
        assertArrayEquals(result, Knapsack.zeroOneKnapsack(values, weights, capacity));

        values = new int[] {1,2,3};
        weights = new int[] {4,5,1};
        capacity = 4;
        assertArrayEquals(new int[]{2}, Knapsack.zeroOneKnapsack(values, weights, capacity));

    }

}