//Задача 1
//Найти минимальное чётное число в последовательности положительных чисел
// или вывести -1, если такого числа не существует.
//
//Оценить временную и пространственную сложность алгоритма.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1MinimumEven {
  public static void main(String[] args) throws IOException { //Result: O(n) time, O(1) space

    // O(1) time, O(1) space
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter the quantity of numbers in sequence");  // O(1) time, O(1) space
    int numbers = Integer.parseInt(read.readLine()); // O(1) time, O(1) space
    if (numbers < 0) {
      // O(1) time, O(1) space - ?
      throw new IllegalArgumentException("Size of list couldn't be negative: " + numbers);
    }

    if (numbers != 0) {
      System.out.println("Enter the numbers (each number from new line):"); // O(1) time, O(1) space
    }

    int result = Integer.MAX_VALUE; // O(1) time, O(1) space
    boolean findNewResult = false; // O(1) time, O(1) space
    int incomeNumber; // O(1) time, O(1) space

    for(int i = 0; i < numbers; ++i) { // O(1)*n time = O(n), O(1) space (always in new variable);
      incomeNumber = Integer.parseInt(read.readLine()); // O(1) time, O(1) space

      if (incomeNumber < 0) {
        // O(1) time, O(1) space - ?
        throw new IllegalArgumentException("Incorrect input number" + incomeNumber);
      }

      if ((incomeNumber % 2 == 0) && (incomeNumber < result)) {
        result = incomeNumber; // O(1) time, O(1) space
        findNewResult = true; // O(1) time, O(1) space
      }
    }

    if (findNewResult) {
      System.out.println(result); // O(1) time, O(1) space
    } else {
      System.out.println("-1"); // O(1) time, O(1) space
    }
  }
}
