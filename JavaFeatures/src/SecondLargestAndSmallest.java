
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargestAndSmallest {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(5, 12, 3, 19, 3, 7, 19);

            // Remove duplicates, sort, and collect into a list
            List<Integer> sortedUniqueNumbers = numbers.stream()
                    .distinct()
                    .sorted()
                    .collect(Collectors.toList());

            if (sortedUniqueNumbers.size() >= 2) {
                int secondSmallest = sortedUniqueNumbers.get(1);
                int secondLargest = sortedUniqueNumbers.get(sortedUniqueNumbers.size() - 2);

                System.out.println("Second Smallest: " + secondSmallest);
                System.out.println("Second Largest: " + secondLargest);
            } else {
                System.out.println("Not enough unique elements to find second smallest and second largest.");
            }
        }
    }
