
    import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

    public class CovertingUpperStream
    {
        public static void main(String[] args) {
            List<String> names = Arrays.asList("Aparna", "Anil", "Bob");

            // Convert to Uppercase
            List<String> upperCaseNames = names.stream()
                    .map(String::toUpperCase)
                    .collect(Collectors.toList());

            System.out.println("Uppercase: " + upperCaseNames);

            // Convert to Lowercase
            List<String> lowerCaseNames = names.stream()
                    .map(String::toLowerCase)
                    .collect(Collectors.toList());

            System.out.println("Lowercase: " + lowerCaseNames);
        }
    }
