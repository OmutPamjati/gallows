package console;

import interfaces.IGameInput;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleGameInput implements IGameInput {
    public static char letter;

    public void getLetter() {
        try {
            InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");
            BufferedReader br = new BufferedReader(isr);
            letter = (char) br.read();
            System.out.println("буква " + letter);
            //LetterBank.addLetter(letter);

        } catch (java.io.IOException e) {
            // обработка исключения
        }
    }

    public void restart() {
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
