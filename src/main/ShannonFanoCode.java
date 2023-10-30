

import static MathHelpers.LogConversionToBaseTwo.logBaseTwo;

import java.util.ArrayList;
import java.util.PriorityQueue;

import MathHelpers.GetAverageLength;
import MathHelpers.Pair;


public class ShannonFanoCode<T,V> {
    private double[] frequencies;
    private ArrayList<Pair<Double,Double>> frequencyAndLengths = new ArrayList<>();
    
    public ShannonFanoCode(double[] frequencies) {
        this.frequencies = frequencies;
    }
    public PriorityQueue<Double> calcuateLengths() {
        PriorityQueue<Double> lengths = new PriorityQueue<>();
        for (double frequency : frequencies) {
            lengths.add(Math.ceil(-1 * logBaseTwo(frequency)));
            frequencyAndLengths.add(new Pair<Double, Double>(frequency, Math.ceil(-1 * logBaseTwo(frequency))));
        }
        return lengths;
    }
    public double getAverageLength() {
        return GetAverageLength.calculate(frequencyAndLengths);
    }
}
