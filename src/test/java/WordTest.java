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

  @Test
  public void clear_emptiesAllWords_0() {
    Word testWord = new Word("Hello");
    Word testWord2 = new Word("Goodbye");
    Word.clear();
    assertEquals(Word.all().size(), 0);
  }
  @Test
    public void getId_wordsInstantiateWithAnId_1() {
    Word testWord = new Word("Hello");
    assertEquals(1, testWord.getId());
  }

  @Test
    public void find_returnsWordWithSameId_secondWord() {
    Word.clear();
    Word testWord = new Word("Hello");
    Word testWord2 = new Word("Goodbye");
    assertEquals(Word.find(testWord2.getId()), testWord2);
  }

  @Test
    public void getDefinitions_initiallyReturnsEmptyList_ArrayList() {
      Word.clear();
      Word testWord = new Word("Hello");
      assertEquals(0, testWord.getDefinitions().size());
    }

  @Test
  public void addDefinition_addsDefinitionToList_true() {
    Word testWord = new Word("Hello");
    Definition testDefinition = new Definition("A boring greeting");
    testWord.addDefinition(testDefinition);
    assertTrue(testWord.getDefinitions().contains(testDefinition));
  }

  @Test
  public void addDefinition_addsMultipleDefinitionsToList_true() {
    Word testWord = new Word("Hello");
    Definition testDefinition = new Definition("A boring greeting");
    Definition testDefinition2 = new Definition("A boring greeting");
    Definition testDefinition3 = new Definition("A boring greeting");
    testWord.addDefinition(testDefinition);
    testWord.addDefinition(testDefinition2);
    testWord.addDefinition(testDefinition3);
    assertTrue(testWord.getDefinitions().contains(testDefinition));
    assertTrue(testWord.getDefinitions().contains(testDefinition2));
    assertTrue(testWord.getDefinitions().contains(testDefinition3));
  }


}
