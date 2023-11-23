package MathHelpers.Ciphers;

import java.util.HashMap;

public class GetFrequencies<T> {
public  HashMap<T, Integer> getFrequencies(T[] cs) {
        HashMap<T, Integer> frequencies = new HashMap<>();
        for (T element : cs) {
            if (frequencies.containsKey(element)) {
                int prevFrequency = frequencies.get(element);
                frequencies.put(element, prevFrequency + 1);
            } else {
                frequencies.put(element, 0);
            }
        }
        return frequencies;
    }
}
