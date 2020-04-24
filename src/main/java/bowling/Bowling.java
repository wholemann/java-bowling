package bowling;

import java.util.ArrayList;
import java.util.List;

public class Bowling {
    private List<Integer> falledPins = new ArrayList<>();

    public List<String> roll(int falledPinCount) {
        falledPins.add(falledPinCount);

        List<String> result = new ArrayList<>();

        if (falledPins.get(0) == 10) {
            result.add("X");
        };

        return result;
    }
}
