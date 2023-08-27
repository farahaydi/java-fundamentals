package inheritance;

import java.util.ArrayList;
import java.util.List;

public class addReview {
    protected String name;
    protected List<Review> reviews;
    protected int stars;

    public addReview(String name) {
        this.name = name;
        this.reviews = new ArrayList<>();
    }

    public void addReview(Review review) {
        if (!reviews.contains(review)) {
            reviews.add(review);
            updateStars();
        }
    }

    protected void updateStars() {
        int totalStars = 0;
        for (Review review : reviews) {
            totalStars += review.getNumberOfStars();
        }
        stars = totalStars / reviews.size();
    }

    public String getName() {
        return name;
    }

}
