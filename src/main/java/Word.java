import java.util.List;
import java.util.ArrayList;

public class Word {
  private String mText;
  private static ArrayList<Word> allWords = new ArrayList<Word>();

public Word(String text) {
  mText = text;
  allWords.add(this);
}

public String getText() {
  return mText;
  }

public static ArrayList<Word> all() {
  return allWords;
}



}
