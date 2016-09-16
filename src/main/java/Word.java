import java.util.List;
import java.util.ArrayList;

public class Word {
  private String mText;
  private static ArrayList<Word> allWords = new ArrayList<Word>();
  private int mId;
  private List<Definition> mDefinitions;


  public Word(String text) {
    mText = text;
    allWords.add(this);
    mId = allWords.size();
    mDefinitions = new ArrayList<Definition>();
  }

  public String getText() {
    return mText;
    }

  public static ArrayList<Word> all() {
    return allWords;
  }

  public static void clear () {
    allWords.clear();
  }

  public int getId() {
    return mId;
  }

  public static Word find(int id) {
    return allWords.get(id - 1);
  }

  public List<Definition> getDefinitions() {
    return mDefinitions;
}

  public void addDefinition(Definition definition) {
    mDefinitions.add(definition);
  }

}
