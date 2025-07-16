
import java.util.ArrayList;
import java.util.Collections;

    public class ArrayListSortingExample {
        public static void main(String[] args) {
            ArrayList<String> fruits = new ArrayList<>();
            fruits.add("B");
            fruits.add("A");
            fruits.add("M");
            fruits.add("C");

            System.out.println("Before Sorting: " + fruits);

            // Sorting in ascending (alphabetical) order
            Collections.sort(fruits);
            System.out.println("After Sorting (Ascending): " + fruits);

            // Sorting in descending order
            Collections.sort(fruits, Collections.reverseOrder());
            System.out.println("After Sorting (Descending): " + fruits);
        }
    }

