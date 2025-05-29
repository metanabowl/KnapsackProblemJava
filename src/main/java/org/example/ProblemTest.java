package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProblemTest {
    // TEST 1: Sprawdza, czy generator tworzy dokładnie 5 przedmiotów
    @Test
    public void testGeneration() {
        Problem p = new Problem(5, 1, 1, 10);
        assertEquals(5, p.items.size());
    }

    // TEST 2: Sprawdza, czy jeśli coś się zmieści do plecaka, to wynik nie jest pusty
    @Test
    public void testPositiveSolutionExists() {
        Problem p = new Problem(3, 1, 1, 10);
        Result r = p.solve(15);
        assertTrue(r.totalValue > 0);
    }
    // TEST 3: Sprawdza, czy jeśli nic się nie mieści, to rozwiązanie ma wartość 0
    @Test
    public void testNoItemFits() {
        Problem p = new Problem(3, 1, 11, 20);
        Result r = p.solve(10);
        assertEquals(0, r.totalValue);
    }

    // TEST 4: Sprawdza, czy wszystkie wagi i wartości mieszczą się w przedziale 1–10
    @Test
    public void testWeightAndValueBounds() {
        Problem p = new Problem(10, 1, 1, 10);
        for (Item item : p.items) {
            assertTrue(item.weight >= 1 && item.weight <= 10);
            assertTrue(item.value >= 1 && item.value <= 10);
        }
    }
}

