package MathHelpers;

public class FreqLengthPair<Frequency, Length> implements Pair<Frequency,Length> {
    private Frequency frequency;
    private Length length;
    public FreqLengthPair(Frequency frequency, Length length) {
        this.frequency = frequency;
        this.length = length;
    }
    public Frequency getKey() {
        return frequency;
    }
    public Length getValue() {
        return length;
    }
}
