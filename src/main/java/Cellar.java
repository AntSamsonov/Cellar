import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static javax.swing.UIManager.get;

public class Cellar {
    List<String> cellar = new ArrayList<String>();

    private String takeBank(String choice) {
        for (int i = 0; i < cellar.size(); i++) {
            if (cellar.get(i).contains(choice)) {
                cellar.remove(i);
                return choice;
            }
        }
        return null;
    }

    private void putBank(String choice) {
        cellar.add(choice);
        System.out.println("Банка с " + choice + " помещена в погреб");
    }




}
