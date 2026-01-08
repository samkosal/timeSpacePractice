import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PracticeTest {
  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient

  //Time: basic
  @Test
  void testMostCommonTimeEfficient_basic() {
      int[] arr = {1, 2, 2, 3, 3, 3};
      // the answer Should be 2, because its the largest
      assertEquals(3, Practice.mostCommonTimeEfficient(arr));
  }
  //Space: basic
  @Test
  void testMostCommonSpaceEfficient_basic() {
      int[] arr = {1, 2, 2, 3, 3, 3};
      // the answer Should be 2, because its the largest
      assertEquals(3, Practice.mostCommonSpaceEfficient(arr));
  }

  //Time: Tie
  @Test
  void testMostCommonTimeEfficient_tie() {
      int[] arr = {4, 5, 4, 5};
      // Both 4 and 5 appear twice, but 4 appears first
      assertEquals(4, Practice.mostCommonTimeEfficient(arr));
  }
  //Space: Tie
  @Test
  void testMostCommonSpaceEfficient_tie() {
      int[] arr = {4, 5, 4, 5};
      // Both 4 and 5 appear twice, but 4 appears first
      assertEquals(4, Practice.mostCommonSpaceEfficient(arr));
  }

  //Time: Empty
  @Test
  void testMostCommonTimeEfficient_Empty() {
      int[] arr = {};
      // the array is empty, it should return 0
      assertEquals(0, Practice.mostCommonTimeEfficient(arr));
  }
  //Space: Empty
  @Test
  void testMostCommonSpaceEfficient_Empty() {
      int[] arr = {};
      // the array is empty, it should return 0
      assertEquals(0, Practice.mostCommonSpaceEfficient(arr));
  }

  //Time: One
  @Test
  void testMostCommonTimeEfficient_One() {
      int[] arr = {100};
      // the array has one number, it should return 100
      assertEquals(100, Practice.mostCommonTimeEfficient(arr));
  }
  //Space: One
  @Test
  void testMostCommonSpaceEfficient_One() {
      int[] arr = {100};
      // the array has one number, it should return 100
      assertEquals(100, Practice.mostCommonSpaceEfficient(arr));
  }

  //Time: Large
  @Test
  void testMostCommonTimeEfficient_Large() {
      int[] arr = {1,100,100,2,1,2,4,1,2,4,100,100};
      // the array has a large number difference.
      assertEquals(100, Practice.mostCommonTimeEfficient(arr));
  }
  //Space: large
  @Test
  void testMostCommonSpaceEfficient_Large() {
      int[] arr = {1,100,100,2,1,2,4,1,2,4,100,100};
      // the array has a large number difference.
      assertEquals(100, Practice.mostCommonSpaceEfficient(arr));
  }
  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls
}
