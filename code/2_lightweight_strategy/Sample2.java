import java.util.Arrays;
import java.util.List;

public class Sample2 {
  public static int totalValues(List<Integer> numbers) {
    int total = 0;
    for (Integer number : numbers) {
      total += number;
    }
    return total;
  }

  private static int totalEvenValues(List<Integer> numbers) {
    int total = 0;
    for (Integer number : numbers) {
      if (number % 2 == 0) total += number;
    }
    return total;
  }

  private static int totalOddValues(List<Integer> numbers) {
    int total = 0;
    for (Integer number : numbers) {
      if (number % 2 != 0) total += number;
    }
    return total;
  }

  public static void main(String[] args) {
    List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);

    System.out.println(totalValues(values));
    System.out.println(totalEvenValues(values));
    System.out.println(totalOddValues(values));
  }
}
