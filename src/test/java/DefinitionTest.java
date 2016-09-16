import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class DefinitionTest{

  @Test
  public void Definition_instantiatesCorrectly_true() {
    Definition testDefinition = new Definition("A common greeting");
    assertEquals(true, testDefinition instanceof Definition);
  }

  @Test
  public void Definition_instantiatesWithText_String() {
    Definition testDefinition = new Definition("A common greeting");
    assertEquals("A common greeting", testDefinition.getText());
  }

  @Test
  public void all_returnsAllDefinitions_true() {
    Definition testDefinition = new Definition("A common greeting");
    Definition testDefinition2 = new Definition("An unusual greeting");
    assertEquals(true, Definition.all().contains(testDefinition));
    assertEquals(true, Definition.all().contains(testDefinition2));
  }

  @Test
  public void getId_definitionsInstantiatesWithAnID_1() {
    Definition.clear();
    Definition testDefinition = new Definition("A common greeting");
    assertEquals(1, testDefinition.getId());
  }

  @Test
  public void find_returnsDefinitionWithSameId_Definition2() {
    Definition testDefinition = new Definition("A common greeting");
    Definition testDefinition2 = new Definition("An unusual greeting");
    assertEquals(Definition.find(testDefinition2.getId()), testDefinition2);
  }


}
