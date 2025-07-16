import java.util.ArrayList;

public class CloningArrayList {
    public static void main(String[] args)
    {
        ArrayList<String> al=new ArrayList();
        al.add("anu");
        al.add("adharva");
        al.add("rishi");
        ArrayList all= (ArrayList) al.clone();
        System.out.println(all);


    }
}
