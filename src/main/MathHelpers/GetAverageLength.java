package MathHelpers;

import java.util.ArrayList;

public class GetAverageLength {
    public static double calculate(ArrayList<Pair<Double, Double>> frequenciesAndLengths) {
        double average = 0.0;
        for(Pair<Double, Double> frequencyAndLength : frequenciesAndLengths) {
            System.out.println(frequencyAndLength.getLength());
            average += frequencyAndLength.getFrequency() * frequencyAndLength.getLength();
        }
        return average;
    }
}
