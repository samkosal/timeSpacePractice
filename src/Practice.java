import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Practice {

  // Time Complexity: O(n)
  // Space Complexity: O(n)
  public static List<Integer> findEvens(int[] array) {
    List<Integer> evens = new ArrayList<>();
    for (int num : array) {
      if (num % 2 == 0) {
        evens.add(num);
      }
    }
    return evens;
  }

  // Time Complexity: O(n)
  // Space Complexity: O(n)
  public static int sumDiagonal(int[][] matrix) {
    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {
      sum += matrix[i][i];
    }
    return sum;
  }
  

  // Time Complexity: O(n)
  // Space Complexity: O(n^2)
  // Does the 'T' look confusing? Consider refreshing on generic methods
  // We'll revisit generics as a class later
  public static <T> Map<T, Integer> countFrequencies(T[] array) {
    HashMap<T, Integer> frequencies = new HashMap<>();
    for (T val : array) {
      frequencies.put(val, frequencies.getOrDefault(val, 0) + 1);
    }
    return frequencies;
  }

  // Time Complexity: O(n^2)
  // Space Complexity: O(n^2)
  public static List<Integer> evensToSquare(int n) {
    List<Integer> evens = new ArrayList<>();
    for(int i = 0; i <= n*n; i+=2) {
      evens.add(i);
    }
    return evens;
  }

  /**
   * Returns the integer that shows up most frequently in an array.
   * If there is a tie, tiebreak by returning the one that shows up first
   * in the array.
   * 
   * THIS METHOD MUST RUN IN O(n) TIME. n = nums.size()
   * 
   * Once you finish, WRITE TESTS FOR IT in PracticeTest.java
   * 
   * Time Complexity: 
   * Space Complexity: 
   * 
   * @param nums An array of integers
   * @return the integer that shows up most commonly
   */
  public static int mostCommonTimeEfficient(int[] nums) {
    // TODO: Complete this method with an implementation that runs
    // in O(n) time. n = nums.size()
    // create a hashmap
    if (nums.length == 0) {
      return 0;
    }
    HashMap<Integer, Integer> frequencies = new HashMap<>();

    // loop over nums
    for (int val : nums) {
      // add into keys and values
      frequencies.put(val, frequencies.getOrDefault(val, 0) + 1);
    }
    int max = 0;
    int highestkey = nums[0];
    for (Map.Entry<Integer, Integer> entry : frequencies.entrySet()) {
      if (entry.getValue() > max) {
        max = entry.getValue();
        highestkey = entry.getKey();
      }
    }
    return highestkey;
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 2, 3, 3, 3, 2};
    System.out.println(mostCommonSpaceEfficient(arr));
    System.out.println(mostCommonTimeEfficient(arr));

  }

  /**
   * Returns the integer that shows up most frequently in an array.
   * If there is a tie, tiebreak by returning the one that shows up first
   * in the array.
   * 
   * THIS METHOD MUST USE ONLY O(1) SPACE.
   * 
   * Once you finish, WRITE TESTS FOR IT in PracticeTest.java
   * 
   * Time Complexity: 
   * Space Complexity: 
   * 
   * @param nums An array of integers
   * @return the integer that shows up most commonly
   */
  public static int mostCommonSpaceEfficient(int[] nums) {
    // TODO: Complete this method with an implementation that runs
    // in O(1) space.
    int largestnumber = 0;
    int highestfrequencies = 0;
    int highestfrequenciesnumber = 0;

    // loop nums array to find the highest number
    for (int num : nums) {
      //if the current number is higher than highest number
      if (num > largestnumber) {
        // store the number in highestnumber
        largestnumber = num;
      }
    }
    // loop from 0 to the highest number
    for (int i = 0; i <= largestnumber; i++) {
      //store the current interation in current1 (throughout this loop, we are going to see how many time current1 will appear)
      int current1 = i;
      int highestcurrentfrequencies = 0;
      //loop nums array again
      for (int num : nums) {
        //if the current1 mathces with the current num number.
        if (current1 == num) {
          //increment one into highestcurrentfrequencies
          highestcurrentfrequencies += 1;
          //if highestcurrentfrequencies is greater than highestfrequencies
          if (highestcurrentfrequencies > highestfrequencies) {
            // set highestfrequencies to highestcurrentfrequencies
            highestfrequencies = highestcurrentfrequencies;
            // set highestfrequenciesnumber to current num
            highestfrequenciesnumber = num;
          }
        }
      }
      // System.out.println(highestcurrentfrequencies);
      
    }
    // System.out.println(highestfrequencies);
    // System.out.println(highestfrequencies);
    //return highest frequenciesnumber
    return highestfrequenciesnumber;
  }
}