package MathHelpers.Codes;


import static MathHelpers.Miscellaneous.LogConversion.logBaseChange;

import java.util.ArrayList;
import java.util.PriorityQueue;

import MathHelpers.Miscellaneous.FreqLengthPair;
import MathHelpers.Miscellaneous.GetAverageLength;
import MathHelpers.Miscellaneous.Pair;


public class ShannonFanoCode<T,V> {
    private static final int BINARY = 2;
    private static ArrayList<Pair<Double,Double>> frequencyAndLengths = new ArrayList<>();
    
   
    public static PriorityQueue<Double> calcuateLengths(double[] frequencies, int base) {
        PriorityQueue<Double> lengths = new PriorityQueue<>();
        for (double frequency : frequencies) {
            lengths.add(Math.ceil(-1 * logBaseChange(frequency, base)));
            frequencyAndLengths.add(new FreqLengthPair<Double, Double>(frequency, Math.ceil(-1 * logBaseChange(frequency, base))));
        }
        frequencyAndLengths.forEach(length -> System.out.println("Frequency " + length.getKey() + " Length: " + length.getValue()));
        return lengths;
    }
    public static double getAverageLength(ArrayList<Pair<Double,Double>> frequencyAndLengths) {
        return GetAverageLength.calculate(frequencyAndLengths);
    }
}
