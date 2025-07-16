import java.util.ArrayList;

    public class ArrayListEqualsExample {
        public static void main(String[] args) {
            // Create first ArrayList
            ArrayList<String> list1 = new ArrayList<>();
            list1.add("Apple");
            list1.add("Banana");
            list1.add("Cherry");

            // Create second ArrayList
            ArrayList<String> list2 = new ArrayList<>();
            list2.add("Apple");
            list2.add("Banana");
            list2.add("Cherry");

            // Create third ArrayList with different elements
            ArrayList<String> list3 = new ArrayList<>();
            list3.add("Banana");
            list3.add("Apple");
            list3.add("Cherry");

            // Comparing lists using equals() method
            System.out.println("list1 equals list2: " + list1.equals(list2));  // true
            System.out.println("list1 equals list3: " + list1.equals(list3));  // false
        }
    }

