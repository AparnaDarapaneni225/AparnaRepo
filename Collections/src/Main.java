import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Main {

    public static void main(String[] args)
    {
        ArrayList<String> al=new ArrayList<String>();
        al.add("Aparna");//adding element to the  Arraylist
        al.add("Anu");
        al.add("radha");
        List l= Collections.unmodifiableList(al);
        List<String> synchronizedList = Collections.synchronizedList(al);
       Object[] array=al.toArray();
       for(Object temp:al)
       {
          System.out.println(temp);
       }
            l.add("adharva");
           al.add("rishi");
          al.add("appu");
          al.add("appu");
          al.add(3,"apoorva"); //add an element at specified location
          al.set(3,"apoorvani"); //replace an element
         al.clear();  //clear the all elements at a time
        al.remove(2); //Removes the element at the specified position.
       al.remove(3); //Removes the first occurrence of the specified element.
        System.out.println(al.isEmpty());	//Checks if the list is empty.
        System.out.println(al.contains("appu"));	//Checks if the list contains the specified element. returns true
        System.out.println(al.indexOf("rishi"));	//Returns the index of the first occurrence
        System.out.println(al.lastIndexOf("appu"));	//Returns the index of the last occurrence.
        System.out.println(al.size()); //get the size of Arraylist
        System.out.println(al);
        System.out.println(al.get(2));


        }


    }
