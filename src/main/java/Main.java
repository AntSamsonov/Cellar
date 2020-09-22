import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

import static jdk.javadoc.internal.doclets.toolkit.util.Utils.toUpperCase;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Cellar cellar = new Cellar();
        int x = 1;
        while(x == 1){
            System.out.println("Выберите действие: \n 0. Узнать что в погребе \n 1. Взять банку \n " +
                    "2. Положить банку \n 3. Сотворить магию и заполнить погреб \n 4. Выйти из приложения");

            switch (Integer.parseInt(reader.readLine())){
                case 0: System.out.println("Сейчас в погребе имеется: "); cellar.whatInCellar();
                break;
                case 1:
                    System.out.println("Банку с каким содержимым Вы хотите взять? \n Сейчас в погребе имеется: ");
                    cellar.whatInCellar();
                    cellar.takeBank(reader.readLine());
                    break;
                case 2:
                    System.out.println("Банку с каким содержимым Вы хотите поместить?");
                    cellar.putBank(reader.readLine());
                    break;
                case 3:
                    System.out.println("Сколько банок наколдовать?");
                    cellar.getRandomValue(Integer.parseInt(reader.readLine()));
                    System.out.println("ВЖУХ! И погреб заполнен!");
                    break;
                case 4:
                    System.out.println("Приятного аппетита!");
                    x = 0;
                    break;
                default:
                    System.out.println("В погребе темно, поэтому выбран неверный вариант. Попробуйте снова.");
            }
        }
    }
}
