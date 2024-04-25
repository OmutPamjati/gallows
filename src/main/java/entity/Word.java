package entity;

public class Word {
    public static String word;//всё сделать приватными и добавить get методы
    public static int wordSise;
    public static char[] encryptedWord;

    public Word() //конструктор
    {
        word = WordBank.getWord();
        wordSise = word.length();
        encryptedWord = new char[wordSise];

        for (int i = 0; i < wordSise; i++) {
            encryptedWord[i] = '_';
        }
    }
}
