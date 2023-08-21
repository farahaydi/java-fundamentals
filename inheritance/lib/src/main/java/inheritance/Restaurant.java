package inheritance;

import java.util.ArrayList;

public class Restaurant {
    protected String restaurantName;
    protected double numberOfStars;
    protected double categoryPrice;
    protected ArrayList<Review> ReviewList;

    public Restaurant(String restaurantName, double numberOfStars, double categoryPrice) {
        this.restaurantName = restaurantName;
        setNumberOfStars(numberOfStars);
        this.categoryPrice = categoryPrice;
        this.ReviewList=new ArrayList<>();
    }


    public void setNumberOfStars(double numberOfStars) {
        if (numberOfStars>5 || numberOfStars<1)
        {
            System.out.println("Rates must be between 0 and 5");
        }
        else
            this.numberOfStars = numberOfStars;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public String getCategoryPrice() {
        return categoryPrice + "$";
    }

    public void addReview(Review reviewList) {
        if (!ReviewList.contains(reviewList)) {
            ReviewList.add(reviewList);
            double newAvg = 0;
            for (Review r : ReviewList) {
                newAvg += r.numberOfStars;
            }
            numberOfStars = newAvg / ReviewList.size();
        }else {
            System.out.println("Review is already associated with the restaurant.");
        }
    }
    public String toString() {
        return this.restaurantName + ", " + this.numberOfStars + ", " + getCategoryPrice()+", "+this.ReviewList.size() ;
    }
}
