import java.util.ArrayList;

public class RemovingDupArray {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        ArrayList<String> ul = new ArrayList<String>();
        al.add("Aparna");//adding element to the  Arraylist
        al.add("Anu");
        al.add("radha");
        al.add("radha");
        for (Object temp : al)
        {
            if (!ul.contains(temp))
            {
                ul.add((String) temp);
            }
            System.out.println(temp);

        }

    }
}
