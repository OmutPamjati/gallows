package interfaces;

import entity.Field;

public interface IGameOutput {
    public void outWinner();
    public void outLoss();
    public void Start(char[] encryptedWord);

}
