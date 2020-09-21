import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Random {
    private List<String> getRandomValue(int number){
        java.util.Random random = new java.util.Random();
        List<String> randomValue = Arrays.asList("Cucumber", "Potato", "Tomato", "Carrot", "Cabbage", "Paper", "Eggplant", "Onion", "Radish", "Garlic");
        List<String> result = new ArrayList<String>();

        if (number >= 10){
            return randomValue;
        } else {
            for (int i = 0; i <= number; i++) {
                result.add(randomValue.get(i));
            }
            return result;
        }
    }
    
}
