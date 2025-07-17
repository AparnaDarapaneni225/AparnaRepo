
import java.util.Arrays;
import java.util.List;

    public class StreamSumEvenOdd {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);

            int evenSum = numbers.stream()
                    .filter(n -> n % 2 == 0)
                    .mapToInt(Integer::intValue)
                    .sum();

            int oddSum = numbers.stream()
                    .filter(n -> n % 2 != 0)
                    .mapToInt(Integer::intValue)
                    .sum();

            System.out.println("Sum of Even Numbers: " + evenSum);
            System.out.println("Sum of Odd Numbers: " + oddSum);
        }
    }

