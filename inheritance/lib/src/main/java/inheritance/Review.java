package inheritance;

public class Review {
    protected String reviewBody;
    protected String author;
    protected double numberOfStars;
    protected Restaurant restaurant;

    public Review(String reviewBody, String author, double numberOfStars, Restaurant restaurant) {
        this.reviewBody = reviewBody;
        this.author = author;
        setNumberOfStars(numberOfStars);
        this.restaurant=restaurant;
    }

    public void setNumberOfStars(double numberOfStars) {
        if (numberOfStars > 5 || numberOfStars < 1) {
            System.out.println("Rates must be between 0 and 5");
        }
        this.numberOfStars = numberOfStars;
    }

    public String toString() {
        return this.reviewBody + ", " + this.author + ", " + this.numberOfStars+", "+this.restaurant.getRestaurantName();
    }
}
