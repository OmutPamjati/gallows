import console.ConsoleGameOutput;
import console.ConsoleGameInput;
import entity.Word;
import interfaces.IGameInput;
import interfaces.IGameOutput;

public class Main {
    public static void main(String[] args){
        IGameInput gameInput = new ConsoleGameInput();
        IGameOutput gameOutput = new ConsoleGameOutput();
        Word word = new Word();

        Game game = new Game(
                gameOutput,
                gameInput,
                word
        );

        boolean step = true;

        while (step) {
                step = game.step();
        }
    }
}
