package console;

import entity.Field;
import interfaces.IGameOutput;
import java.util.Arrays;

public class ConsoleGameOutput implements IGameOutput {

     public void Start(char[] encryptedWord)
     {
          System.out.println(Arrays.toString(encryptedWord) + "\n");
          System.out.println("У вас осталось " + Field.remainingLives + "жизней\n");
          System.out.println("Введите букву\n");
     }
     public void outWinner() {
          System.out.print("Вы победили\n");
     }
     public void outLoss() {
          System.out.print("Вы проиграли\n Начать заново?\nД Н\n");
     }

}
