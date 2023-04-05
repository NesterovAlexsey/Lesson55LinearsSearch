//Задача 1
//Найти минимальное чётное число в последовательности положительных чисел
// или вывести -1, если такого числа не существует.
//
//Оценить временную и пространственную сложность алгоритма.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1MinimumEven {
  public static void main(String[] args) throws IOException {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter the quantity of numbers in sequence");
    int numbers = Integer.parseInt(read.readLine());

    System.out.println("Enter the numbers (each number from new line):");

    int result = Integer.MAX_VALUE;
    boolean findNewResult = false;
    int incomeNumber = -1;

    for(int i = 0; i < numbers; ++i) {
      incomeNumber = Integer.parseInt(read.readLine());

      if (incomeNumber < 0) {
        System.err.println("Incorrect input number" + incomeNumber);
        break;
      }

      if ((incomeNumber % 2 == 0) && (incomeNumber < result)) {
        result = incomeNumber;
        findNewResult = true;
      }
    }

    if (findNewResult) {
      System.out.println(result);
    } else {
      System.out.println("-1");
    }
  }
}
