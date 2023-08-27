package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater extends addReview{
    private List<String> movies;
    public Theater(String name) {
        super(name);
        this.movies = new ArrayList<>();
    }
    public void addMovie(String movie) {
        movies.add(movie);
    }

    public void removeMovie(String movie) {
        movies.remove(movie);
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", movies='" + movies + '\'' + "," +
                " stars='" + stars + '\'' +
                '}';
    }
}
