import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingElementInJava8 {

    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8.3, 2015, 2));
        list.add(new Movie("Star Wars", 8.7, 1977, 4));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980, 6));
        list.add(new Movie("Return of the Jedi", 8.4, 1983, 78));

        //natural sorng order
        List<Movie> sortedList = list.stream()
                .sorted(Comparator.comparing(Movie::getRating).thenComparing(Movie::getName))
                .collect(Collectors.toList());
        //more then one filed you can use this method
        /*Comparator<Movie> compareByName = Comparator
                .comparing(Movie::getName)
                .thenComparing(Movie::getId);

        Collections.sort(list, compareByName);*/
        list.sort(Comparator.comparing(Movie::getRating).thenComparing(Movie::getName));
        list.forEach(e -> {
            System.out.println(e.getId());
        });

    }
}
