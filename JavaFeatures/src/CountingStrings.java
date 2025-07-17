
    import java.util.Arrays;
import java.util.List;

    public class CountingStrings {
        public static void main(String[] args) {
            List<String> names = Arrays.asList("Apple", "Banana", "Avocado", "Cherry", "Apricot");

            long count = names.stream()
                    .filter(name -> name.startsWith("A"))
                    .count();

            System.out.println("Number of strings starting with 'A': " + count);
        }
    }

