

import static MathHelpers.LogConversion.logBaseChange;

import java.util.ArrayList;
import java.util.PriorityQueue;

import MathHelpers.FreqLengthPair;
import MathHelpers.GetAverageLength;
import MathHelpers.Pair;


public class ShannonFanoCode<T,V> {
    private static final int BINARY = 2;
    private double[] frequencies;
    private ArrayList<Pair<Double,Double>> frequencyAndLengths = new ArrayList<>();
    
    public ShannonFanoCode(double[] frequencies) {
        this.frequencies = frequencies;
    }
    public PriorityQueue<Double> calcuateLengths() {
        PriorityQueue<Double> lengths = new PriorityQueue<>();
        for (double frequency : frequencies) {
            lengths.add(Math.ceil(-1 * logBaseChange(frequency, BINARY)));
            frequencyAndLengths.add(new FreqLengthPair<Double, Double>(frequency, Math.ceil(-1 * logBaseChange(frequency, BINARY))));
        }
        return lengths;
    }
    public double getAverageLength() {
        return GetAverageLength.calculate(frequencyAndLengths);
    }
}
