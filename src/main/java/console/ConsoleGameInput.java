package console;

import interfaces.IGameInput;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleGameInput implements IGameInput {
    public static char letter; //TODO: убрать

    public void getLetter() {// TODO: Возвращать char
        try {
            InputStreamReader isr = new InputStreamReader(System.in, "UTF-8"); // Вынести в переменную
            BufferedReader br = new BufferedReader(isr);
            letter = (char) br.read(); //оставить только это
            System.out.println("буква " + letter); //убарть
            //LetterBank.addLetter(letter);

        } catch (java.io.IOException e) {
            // Вернуть какой то статус код
            // обработка исключения
        }
    }

    public void restart() { //убрать весь метод
        char restart = 0;
        try {
            InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");
            BufferedReader br = new BufferedReader(isr);
            restart = (char) br.read();
        } catch (java.io.IOException e) {
            //
        }
        if (restart == 'д' || restart == 'Д' || restart == 'Y') {
            //
        }
    }

}
