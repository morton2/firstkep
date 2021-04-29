package hu.nive.ujratervezes.adddigits;

import java.util.Arrays;

public class AddDigits {
    public int addDigits(String input) {
        int result;
        if(input == null || input.equals("")) {
            result = -1;
        } else {
            result = Arrays
                    .stream(input.split(""))
                    .filter((s) -> s.matches("\\d+"))
                    .mapToInt(Integer::parseInt)
                    .sum(); // Sum
        }
        return result;
    }
}
