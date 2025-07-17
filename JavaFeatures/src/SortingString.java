
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingString {
        public static void main(String[] args) {
            List<String> fruits = Arrays.asList("Banana", "Apple", "Mango", "Cherry");

            // Sort A–Z (Ascending)
            List<String> sortedAsc = fruits.stream()
                    .sorted()
                    .collect(Collectors.toList());
            System.out.println("Sorted A–Z: " + sortedAsc);

            // Sort Z–A (Descending)
            List<String> sortedDesc = fruits.stream()
                    .sorted((s1, s2) -> s2.compareTo(s1))
                    .collect(Collectors.toList());
            System.out.println("Sorted Z–A: " + sortedDesc);
        }
    }

