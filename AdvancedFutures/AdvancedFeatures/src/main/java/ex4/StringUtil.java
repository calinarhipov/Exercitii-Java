package ex4;

import java.util.ArrayList;
import java.util.List;

public class StringUtil {

    public List<String> convertToUppercaseIteratively(List<String> originalList) {
        List<String> result = new ArrayList<>(originalList.size());

        // method logic
        for (int i = 0; i < originalList.size(); i++) {
            result.add(originalList.get(i).toUpperCase());
        }

        return result;
    }

    public List<String> convertToUppercaseWithStreams(List<String> originalList) {
        List<String> result = new ArrayList<>(originalList.size());

        // method logic
        result = originalList.stream()
                .map(it -> it.toUpperCase())
                .toList();

        return result;
    }

}
