package entity;
import java.util.ArrayList;
import java.util.List;

public class WordBank {
    static public List<String> WordBank = new ArrayList<>(List.of(
            "любовь",
            "котенок",
            "солнышко"));

    public static String getWord()
    {
        int randomIndex = (int) (Math.random() * WordBank.size());
        String randomWord = WordBank.get(randomIndex);
        //System.out.println(randomWord);
        return randomWord;
    }

}


