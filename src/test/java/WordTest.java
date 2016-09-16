import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class WordTest{

  @Test
   public void word_instantiatesCorrectly_true() {
     Word testWord = new Word("hello");
     assertEquals(true, testWord instanceof Word);
   }

}
