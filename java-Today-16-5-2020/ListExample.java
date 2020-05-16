import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {
    //crud
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add(null);
        list.add("one");
        System.out.println(list);
        list.add(2, "six");
        System.out.println(list);
        list.remove("one");
        System.out.println(list);
        System.out.println(list);
        System.out.println(list.size());

        /*
         *
         * retrive the data from list*/


        for (int i = 0; i < list.size(); i++) {
            System.out.println("usinig for loop" + list.get(i));
        }


        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        for (String s : list) {
            System.out.println("using for each java 5" + s);
        }
        list.stream().forEach(e -> System.out.println(e));
    }


}
