import java.util.Arrays;
import java.util.stream.IntStream;

public class DebugStreaming {
  public static void main(String[] args) {
    int[] listOutputSorted = IntStream.of(-3, 10, -4, 1, 3).sorted().toArray();

    System.out.println(Arrays.toString(listOutputSorted));
  }
}
