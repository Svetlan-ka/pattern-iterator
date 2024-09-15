package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    private final int min;
    private final int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Random random = new Random();
            int value = 0;

            @Override
            public boolean hasNext() {
                return value != 100;
            }

            @Override
            public Integer next() {
                value = random.nextInt(max - min + 1) + min;
                return value;
            }
        };
    }
}