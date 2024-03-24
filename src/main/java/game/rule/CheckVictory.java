package game.rule;

import console.ConsoleGameInput;
import console.ConsoleGameOutput;
import entity.Field;
import entity.Word;


public class CheckVictory {

    static boolean error = true;

    public static boolean findLetter() {
        for (int i = 0; i < Word.wordSise; i++) {
            if (Word.word.charAt(i) == ConsoleGameInput.letter) {
                Word.encryptedWord[i] = ConsoleGameInput.letter;
                error = false;
                return checkVictory();
            }
        }
        if (error) {
            return takeLife();
        }
        return true;
    }

    public static boolean takeLife() {
        Field.remainingLives--;
        if (Field.remainingLives == 0) {
            ConsoleGameOutput output = new ConsoleGameOutput();
            ConsoleGameInput input = new ConsoleGameInput();
            output.outLoss();
            input.restart();
            return false;
        }
        return true;
    }

    public static boolean checkVictory() {
        if (Word.word.equals(String.valueOf(Word.encryptedWord))) {
            ConsoleGameOutput output = new ConsoleGameOutput();
            output.outWinner();
            return false;
        }
        return true;
    }
}
