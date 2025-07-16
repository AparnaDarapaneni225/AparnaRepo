import java.util.ArrayList;

public class RemoveNonDup {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList();
        al.add("anu");
        al.add("aparna");
        al.add("ram");
        al.add("rishi");

        ArrayList<String> ul = new ArrayList();
        ul.add("anu");
        ul.add("hari");
        ul.add("rishi");
        //al.removeAll(ul);

        al.retainAll(ul);
        System.out.println(al);

        //al.retainAll(ul);

      /*  for (Object temp : al) {
            if (!ul.contains(temp)) {
                ul.add((String) temp);

            }
        }
        System.out.println(ul);

    } */
    }
}
