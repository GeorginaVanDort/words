import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class WordTest{

  @Test
   public void word_instantiates_true() {
     Word testWord = new Word("hello");
     assertEquals(true, testWord instanceof Word);
   }

   @Test
    public void word_instantiatesWithTextValue_true() {
      Word testWord = new Word("hello");
      assertEquals("hello", testWord.getText());
    }

    @Test
    public void all_returnsAllWords_true() {
      Word testWord = new Word("Hello");
      Word testWord2 = new Word("Goodbye");
      assertEquals(true, Word.all().contains(testWord));
      assertEquals(true, Word.all().contains(testWord2));
    }

}
