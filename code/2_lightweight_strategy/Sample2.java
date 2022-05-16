import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Sample2 {
  public static int totalValues(List<Integer> numbers, Predicate<Integer> filterCondition) {
    return numbers.stream().filter(filterCondition).mapToInt(number -> number).sum();
  }

  public static void main(String[] args) {
    List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);

    System.out.println("Total value: " + totalValues(values, number -> true));
    System.out.println("Total even value: " + totalValues(values, number -> number % 2 == 0));
    System.out.println("Total odd value: " + totalValues(values, number -> number % 2 != 0));
  }
}
