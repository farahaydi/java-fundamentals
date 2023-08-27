package inheritance;

import java.util.ArrayList;

public class Restaurant extends addReview {
//    protected String restaurantName;
    protected double numberOfStars;
    protected double categoryPrice;
    protected ArrayList<Review> ReviewList;

//    public Restaurant(String restaurantName, double numberOfStars, double categoryPrice) {
//        this.restaurantName = restaurantName;
//        setNumberOfStars(numberOfStars);
//        this.categoryPrice = categoryPrice;
//        this.ReviewList = new ArrayList<>();
//    }

    public Restaurant(String name,int stars, int price) {
        super(name);
        this.stars=Math.max(0, Math.min(5, stars));
        this.categoryPrice=price;
    }


    public void setNumberOfStars(double numberOfStars) {
        if (numberOfStars > 5 || numberOfStars < 1) {
            System.out.println("Rates must be between 0 and 5");
        } else {
            this.numberOfStars = numberOfStars;
        }
    }

//    public String getRestaurantName() {
//        return restaurantName;
//    }
@Override
public String getName() {
    return name;
}

    public String getCategoryPrice() {
        return categoryPrice + "$";
    }

//    @Override
//    public void addReview(Review review) {
//        if (!ReviewList.contains(review)) {
//            ReviewList.add(review);
//            Averagee();
//        }
//    }

//    public void Averagee() {
//            double newAvg = 0;
//            for (Review r : ReviewList) {
//                newAvg += r.numberOfStars;
//            }
//            numberOfStars = newAvg / ReviewList.size();
//        System.out.println(numberOfStars);
//    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", price=" + categoryPrice +
                '}';
    }

//    public double getNumberOfStars() {
//        return numberOfStars;
//    }
}
