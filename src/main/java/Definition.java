import java.util.List;
import java.util.ArrayList;

public class Definition {
  private String mText;
  private static List<Definition> allDefintions = new ArrayList<Definition>();
  private int mId;

  public Definition(String text) {
    mText = text;
    allDefintions.add(this);
    mId = allDefintions.size();
  }

  public String getText(){
    return mText;
  }

  public static List<Definition> all() {
    return allDefintions;
  }

  public int getId() {
    return mId;
  }

  public static Definition find(int id) {
    return allDefintions.get(id - 1);
  }

  public static void clear () {
    allDefintions.clear();
  }

}
