package chances;

import exceptions.InvalidProbability;

import java.util.Objects;

public class Probability {
    private static final double CERTAINTY = 1.0;
    private static final double ZERO = 0.0;
    private final double probability;

    public Probability(double probability) {
        this.probability = probability;
    }

    public static Probability init(double probability) throws InvalidProbability {
        if (probability < ZERO || probability >  CERTAINTY) {
            throw new InvalidProbability("Probability must be between 0 and 1");
        }
        return new Probability(probability);
    }

    public Probability not() throws InvalidProbability {
        return Probability.init(1 - this.probability);
    }

    public Probability add(Probability probability2) throws InvalidProbability {
        return Probability.init(this.probability * probability2.probability);
    }

    public Probability or(Probability probability2) throws InvalidProbability {
        return not().add(probability2.not()).not();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Probability that = (Probability) o;
        return Double.compare(probability, that.probability) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(probability);
    }
}
