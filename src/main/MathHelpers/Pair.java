package MathHelpers;

public class Pair<T,V> {
    private T frequency;
    private V length;
    public Pair(T frequency, V length) {
        this.frequency = frequency;
        this.length = length;
    }
    public T getFrequency() {
        return frequency;
    }
    public V getLength() {
        return length;
    }
}
