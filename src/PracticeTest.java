import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PracticeTest {
  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient
  @Test
  public void mostCommonTimeEfficientTest() {
    int[] nums = {0, 1, 2, 3, 4, 5, 6, 3};
    int result = Practice.mostCommonSpaceEfficient(nums);
    assertEquals(3, result);
  }
  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls
}
