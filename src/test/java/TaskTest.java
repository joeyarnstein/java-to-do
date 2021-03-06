import org.junit.*;
import static org.junit.Assert.*;

public class TaskTest {

  @Test
  public void Task_instantiatesCorrectly_true() {
    Task myTask = new Task("Mow lawn");
    assertEquals(true, myTask instanceof Task);
  }

  @Test
  public void Task_instantiatesWithDescription_true() {
    Task myTask = new Task("Mow lawn");
    assertEquals("Mow lawn", myTask.getDescription());
  }
}
