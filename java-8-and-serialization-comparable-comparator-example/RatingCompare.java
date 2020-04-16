import java.util.Comparator;

class RatingCompare implements Comparator<Movie>
{
    public int compare(Movie m1, Movie m2)
    {
        if (m1.getRating() < m2.getRating() && m1.getId() < m2.getId() ) return -1;
        if (m1.getRating() > m2.getRating() && m1.getId() < m2.getId()) return 1;
        else return 0;
    }
}
