public class Movie implements Comparable<Movie>  {


    private String name;

    private double rating;
    private int year;

    private int id;

    public Movie(String name, double rating, int year, int id) {
        this.name = name;
        this.rating = rating;
        this.year = year;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Used to sort movies by year
    public int compareTo(Movie m)
    {
        return this.id - m.id;
    }
//+,-1,0
}
