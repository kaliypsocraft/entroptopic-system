

import static MathHelpers.LogConversionToBaseTwo.logBaseTwo;

import java.util.PriorityQueue;


public class ShannonFanoCode {
    private double[] frequencies;
    public ShannonFanoCode(double[] frequencies) {
        this.frequencies = frequencies;
    }
    public PriorityQueue<Double> calcuateLengths() {
        PriorityQueue<Double> lengths = new PriorityQueue<>();
        for (double frequency : frequencies) {
            lengths.add(Math.ceil(logBaseTwo(frequency)));
        }
        return lengths;
    }
}
