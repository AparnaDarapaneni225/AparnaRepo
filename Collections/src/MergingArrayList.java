import java.util.ArrayList;

public class MergingArrayList {

    public static void main(String[] args)
    {
        ArrayList<String> al=new ArrayList<String>();
        al.add("Adharva");
        al.add("anu");
        al.add("ram");
        System.out.println(al.size());
        ArrayList<String> al1=new ArrayList<String>();
        al1.add("rishi");
        al1.add("anu");
        al.addAll(al1);
        System.out.println(al);
   System.out.println(al.size());

    }
}
