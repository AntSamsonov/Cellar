import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static javax.swing.UIManager.get;

public class Cellar {
    List<String> cellar = new ArrayList<String>();

    //Метод кладёт банку в погреб, принимает содержимое банки как аргумент.

    public void takeBank(String choice) throws Exception {
        try {
            int randomCrash = (int) (Math.random() * 100);
            if (randomCrash > 2) {
                for (int i = 0; i < cellar.size(); i++) {
                    if (cellar.get(i).contains(choice)) {
                        cellar.remove(i);
                        System.out.println("Вы выбрали " + choice + ". Банка с взята из погреба!");
                    }
                }
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("При попытке взять банку, она разбилась");
        }
    }

    //Метод берёт банку из погреба, принимает содержимое банки как аргумент.

        public void putBank (String choice){
            try {
                int randomCrash = (int) (Math.random() * 100);
                if (randomCrash > 1) {
                    cellar.add(choice);
                    System.out.println("Банка с " + choice + " помещена в погреб");
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("При попытке положить банку, она разбилась");
            }
        }

        //Метод показывает содержимое погреба.

        public void whatInCellar(){
        StringBuilder result = new StringBuilder();
        for (String i : cellar){
            result.append(" ").append(i);
        }
            System.out.println(result);
        }

        //Метод заполняет погреб банками со случайным содержимым из списка.

    public void getRandomValue(int number){
        List<String> randomValue = Arrays.asList("огурец", "картофель", "томат", "морковь", "чеснок", "перец",
                "баклажан", "лук", "редис", "капуста");
        List<String> result = new ArrayList<String>();

        if (number >= 10){
            cellar = randomValue;
        } else {
            for (int i = 1; i <= number; i++) {
                result.add(randomValue.get(i));
            }
            cellar = result;
        }
    }
}





