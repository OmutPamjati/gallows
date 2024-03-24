import entity.Word;
import game.rule.CheckVictory;
import interfaces.IGameInput;
import interfaces.IGameOutput;


public class Game {
    private final IGameOutput gameOutput;
    private final IGameInput gameInput;
    private final Word word;

    //public static int remainingLives = 7;


    public Game(IGameOutput gameOutput,
                IGameInput gameInput,
                Word word) {
        this.gameOutput = gameOutput;
        this.gameInput = gameInput;
        this.word = word;

    } // конструктор

    public boolean step() {

        gameOutput.Start(Word.encryptedWord);
        gameInput.getLetter();
        boolean checkResult = CheckVictory.findLetter();

        if(checkResult == false)
        {
            return false;
        }
        return true;
    }
}
