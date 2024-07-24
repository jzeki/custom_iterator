package org.codeline;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class EvenNumberIterator implements Iterator<Integer> {

    private final List<Integer> numbers;
    private int currentIndex = -1;

    public EvenNumberIterator(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public boolean hasNext() {
        // Find the next even element from the current position
        for (int i = currentIndex + 1; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        // Move to the next even element
        do {
            currentIndex++;
        } while (currentIndex < numbers.size() && numbers.get(currentIndex) % 2 != 0);
        return numbers.get(currentIndex);
    }
}