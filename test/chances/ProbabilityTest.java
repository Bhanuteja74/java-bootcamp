package chances;

import exceptions.InvalidProbability;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
    @Test
    void not() throws InvalidProbability {
        Probability probability = Probability.init(0.2);
        assertEquals(Probability.init(0.8),probability.not());
    }


    @Test
    void add() throws InvalidProbability {
        Probability probability = Probability.init(0.5);
        Probability probability2 = Probability.init(0.5);
        assertEquals(Probability.init(0.25),probability.add(probability2));
    }

    @Test
    void InvalidProbability() {
        assertThrows(InvalidProbability.class, () -> Probability.init(1.5));
    }

    @Test
    void negitiveProbability() {
        assertThrows(InvalidProbability.class, () -> Probability.init(-0.3));
    }

    @Test
    void or() throws InvalidProbability {
        Probability probability = Probability.init(0.5);
        Probability probability2 = Probability.init(0.5);
        assertEquals(Probability.init(0.75),probability.or(probability2));
    }

}