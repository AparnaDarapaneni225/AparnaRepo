
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindingMaxAndMin {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(10, 45, 23, 78, 5);

            // Find Maximum Value
            Optional<Integer> max = numbers.stream()
                    .max(Integer::compareTo);

            // Find Minimum Value
            Optional<Integer> min = numbers.stream()
                    .min(Integer::compareTo);

            max.ifPresent(value -> System.out.println("Maximum Value: " + value));
            min.ifPresent(value -> System.out.println("Minimum Value: " + value));
        }
    }
