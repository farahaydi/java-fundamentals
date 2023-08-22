package inheritance;

public class Review {
    protected String reviewBody;
    protected String author;
    protected double numberOfStars;
    protected ShopOrRestaurant reviewedItem;
    protected String movie;

    public Review(String reviewBody, String author, double numberOfStars, ShopOrRestaurant reviewedItem) {
        this.reviewBody = reviewBody;
        this.author = author;
        setNumberOfStars(numberOfStars);
        this.reviewedItem = reviewedItem;
        this.movie = null; // Default value for movie
    }

    public Review(String reviewBody, String author, double numberOfStars, ShopOrRestaurant reviewedItem, String movie) {
        this.reviewBody = reviewBody;
        this.author = author;
        setNumberOfStars(numberOfStars);
        this.reviewedItem = reviewedItem;
        this.movie = movie;
    }

    public void setNumberOfStars(double numberOfStars) {
        if (numberOfStars > 5 || numberOfStars < 1) {
            System.out.println("Rates must be between 0 and 5");
        }
        this.numberOfStars = numberOfStars;
    }

    public String toString() {
        String itemTypeName;
        String itemName;

        if (reviewedItem instanceof Shop) {
            itemTypeName = "Shop";
            itemName = ((Shop) reviewedItem).getName();
        } else if (reviewedItem instanceof Restaurant) {
            itemTypeName = "Restaurant";
            itemName = ((Restaurant) reviewedItem).getRestaurantName();
        } else if (reviewedItem instanceof Theater) {
            itemTypeName = "Theater";
            itemName = ((Theater) reviewedItem).getName();
        } else {
            itemTypeName = "Unknown";
            itemName = "Unknown";
        }

        return reviewBody + ", " + author + ", " + numberOfStars + ", " + itemTypeName + ": " + itemName +
                (movie != null ? ", Movie: " + movie : "");
    }
}
