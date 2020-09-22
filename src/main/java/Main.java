import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Cellar cellar = new Cellar();
        int x = 1;
        while(x == 1){
            System.out.println("Выберите действие:");
            System.out.println("0. Узнать что в погребе");
            System.out.println("1. Взять банку");
            System.out.println("2. Положить банку");
            System.out.println("3. Сотворить магию и заполнить погреб");
            System.out.println("4. Выйти из приложения");

            switch (Integer.parseInt(reader.readLine())){
                case 0: System.out.println("Сейчас в погребе имеется: "); cellar.whatInCellar();
                break;
                case 1:
                    System.out.println("Банку с каким содержимым Вы хотите взять?");
                    System.out.println("Сейчас в погребе имеется: "); cellar.whatInCellar();
                    String choice = reader.readLine();
                    cellar.takeBank(choice);
                    System.out.println("Банка с " + choice + "взята из погреба!");
                    break;
                case 2:
                    System.out.println("Банку с каким содержимым Вы хотите поместить?");
                    String choice1 = reader.readLine();
                    cellar.putBank(choice1);
                    System.out.println("Банка с " + choice1 + "помещена в погреб!");
                    break;
                case 3:
                    System.out.println("Сколько банок поместить?");
                    cellar.getRandomValue(Integer.parseInt(reader.readLine()));
                    System.out.println("ВЖУХ! И погреб заполнен!");
                case 4:
                    System.out.println("Приятного аппетита!");
                    x = 0;
            }
        }
    }
}
