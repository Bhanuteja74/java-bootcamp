package chances;

import exceptions.InvalidProbability;

import java.util.Objects;

public class Probability {

    private final double probability;

    public Probability(double probability) {
        this.probability = probability;
    }

    public static Probability init(double probability) throws InvalidProbability {
        if (probability < 0 || probability >=  1) {
            throw new InvalidProbability("Probability must be between 0 and 1");
        }
        return new Probability(probability);
    }

    public Probability complement() throws InvalidProbability {
        return Probability.init(1 - this.probability);
    }

    public Probability add(Probability probability2) throws InvalidProbability {
        return Probability.init(this.probability * probability2.probability);
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
