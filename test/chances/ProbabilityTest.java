package chances;

import exceptions.InvalidProbability;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
    @Test
    void createProbability() throws InvalidProbability {
        Probability probability = Probability.init(0.5);
        assertEquals(probability,Probability.init(0.5));
    }

    @Test
    void complement() throws InvalidProbability {
        Probability probability = Probability.init(0.5);
        assertEquals(probability.complement(),Probability.init(0.5));
    }

    @Test
    void add() throws InvalidProbability {
        Probability probability = Probability.init(0.5);
        Probability probability2 = Probability.init(0.5);
        assertEquals(probability.add(probability2),Probability.init(0.25));
    }

    @Test
    void InvalidProbability() throws InvalidProbability {
        assertThrows(InvalidProbability.class, () -> Probability.init(1.5));
    }
}