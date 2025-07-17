
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

    public class RemovingDuplicatesFromList {
        public static void main(String[] args) {
            List<String> names = Arrays.asList("John", "Alice", "Bob", "Alice", "John");

            List<String> uniqueNames = names.stream()
                    .distinct()
                    .collect(Collectors.toList());

            System.out.println("Unique Names: " + uniqueNames);
        }
    }

