package ex6;

import java.util.List;
import java.util.stream.Collectors;

public class AlteringForm {

    private String convertOddEverIntegers(int value) {
        if (value % 2 == 0) {
            return "e" + value;
        } else {
            return "o" + value;
        }
    }

    public String alterForm(List<Integer> list) {
        return list.stream()
                .map(it -> convertOddEverIntegers(it))
                .collect(Collectors.joining(","));
    }
}
