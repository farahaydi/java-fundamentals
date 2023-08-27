package inheritance;

public class Review {
    protected String reviewBody;
    protected String author;
    protected double numberOfStars;
    private Restaurant restaurant;
    private Theater theater;
    private Shop shop;    protected String movie;

    public Review(String reviewBody,String author, int numberOfStars, Restaurant restaurant) {
        this.author = author;
        this.reviewBody = reviewBody;
        this.numberOfStars = Math.max(0, Math.min(5, numberOfStars));
        this.restaurant = restaurant;
        restaurant.addReview(this);

    }

    public Review(String reviewBody, String author, int stars, Shop shop) {
        this.author = author;
        this.reviewBody = reviewBody;
        this.numberOfStars = Math.max(0, Math.min(5, stars));
        this.shop = shop;
        shop.addReview(this);
    }
    public Review(String reviewBody, String author, int stars, Theater theater) {
        this.author = author;
        this.reviewBody = reviewBody;
        this.numberOfStars = Math.max(0, Math.min(5, stars));
        this.theater = theater;
        theater.addReview(this);
    }
    public Review(String reviewBody, String author, int stars,String movie, Theater theater) {
        this.author = author;
        this.reviewBody = reviewBody;
        this.numberOfStars = Math.max(0, Math.min(5, stars));
        this.theater = theater;
        this.movie=movie;
        theater.addReview(this);
    }

    public void setNumberOfStars(double numberOfStars) {
        if (numberOfStars > 5 || numberOfStars < 1) {
            System.out.println("Rates must be between 0 and 5");
        }
        this.numberOfStars = numberOfStars;
    }

    public double getNumberOfStars() {

        return numberOfStars;
            }
    @Override
    public String toString() {
        String establishmentName = restaurant != null ? restaurant.getName() :
                shop != null ? shop.getName() :
                        theater != null ? theater.getName() : "Unknown Place";

        String movieInfo = theater != null && movie != null ? " (Movie: " + movie + ")" : "";

        return "Review{" +
                "body='" + reviewBody + '\'' +
                ", author='" + author + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", Place=" + establishmentName + movieInfo +
                '}';
    }
}
