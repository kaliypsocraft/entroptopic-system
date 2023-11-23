package MathHelpers.Miscellaneous;

import java.util.ArrayList;

public class GetAverageLength {
    public static double calculate(ArrayList<Pair<Double, Double>> frequenciesAndLengths) {
        double average = 0.0;
        for(Pair<Double, Double> frequencyAndLength : frequenciesAndLengths) {
            System.out.println("Frequency: " + frequencyAndLength.getKey() + "Length: " + frequencyAndLength.getValue());
            average += frequencyAndLength.getKey() * frequencyAndLength.getKey();
        }
        return average;
    }
}
