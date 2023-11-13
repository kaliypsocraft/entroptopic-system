

import static MathHelpers.LogConversion.logBaseChange;

import java.util.ArrayList;
import java.util.PriorityQueue;

import MathHelpers.FreqLengthPair;
import MathHelpers.GetAverageLength;
import MathHelpers.Pair;


public class ShannonFanoCode<T,V> {
    private static final int BINARY = 2;
    private static ArrayList<Pair<Double,Double>> frequencyAndLengths = new ArrayList<>();
    
   
    public static PriorityQueue<Double> calcuateLengths(double[] frequencies) {
        PriorityQueue<Double> lengths = new PriorityQueue<>();
        for (double frequency : frequencies) {
            lengths.add(Math.ceil(-1 * logBaseChange(frequency, BINARY)));
            frequencyAndLengths.add(new FreqLengthPair<Double, Double>(frequency, Math.ceil(-1 * logBaseChange(frequency, BINARY))));
        }
        return lengths;
    }
    public static double getAverageLength(ArrayList<Pair<Double,Double>> frequencyAndLengths) {
        return GetAverageLength.calculate(frequencyAndLengths);
    }
}
