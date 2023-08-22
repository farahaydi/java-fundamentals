package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater implements ShopOrRestaurant {
    private String name;
    private List<String> movies;

    public Theater(String name) {
        this.name = name;
        this.movies = new ArrayList<>();
    }

    public void addMovie(String movie) {
        movies.add(movie);
    }

    public void removeMovie(String movie) {
        movies.remove(movie);
    }

    public String getName() {
        return name;
    }

    public List<String> getMovies() {
        return movies;
    }

    public String toString() {
        return name + " - Movies: " + movies;
    }
}
