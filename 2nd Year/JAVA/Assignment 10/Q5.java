import java.util.LinkedList;
import java.util.Iterator;

public class Q5 {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();
        names.add("srinu");
        names.add("charan");
        names.add("venky");
        names.add("shankar");

        Iterator<String> iterator = names.iterator();
        try{
          while (iterator.hasNext()) {
              String name = iterator.next();

               if (name.equals("venky")) {
                   iterator.remove();
                   names.add("shiva");
               }
              else if (name.equals("charan")) {
                  iterator.remove();
                  names.add("suman");
              }
              else if (name.equals("srinu")) {
                  iterator.remove();
              }
          }
        }
        catch(Exception e)
        {
          System.out.println("Caught Exception: " + e.getMessage());
        }

        System.out.println(names);
    }
}