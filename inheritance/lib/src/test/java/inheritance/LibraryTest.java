/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test
    public void testRestaurantToString()
    {
        Restaurant testDisplayRestaurant=new Restaurant("FarahRest",5,30);
        Review review = new Review("Alice", "Great food!", 5, testDisplayRestaurant);
        testDisplayRestaurant.addReview(review);
        String expected ="Restaurant{name='FarahRest', stars=5, price=30.0}";
        assertEquals(expected,testDisplayRestaurant.toString());
        assertEquals(1, testDisplayRestaurant.reviews.size());
        assertEquals(review, testDisplayRestaurant.reviews.get(0));
    }
    @Test
    public void testReviewToString()
    {
        Restaurant testDisplayRestaurant=new Restaurant("FarahRest",5,30);
        Review review1 = new Review("test1", "nice food", 5, testDisplayRestaurant);
        Review review2 = new Review("test2", "Amazing food", 3, testDisplayRestaurant);
        testDisplayRestaurant.addReview(review1);
        testDisplayRestaurant.addReview(review2);

        assertEquals(4, testDisplayRestaurant.stars);
        }
//    @Test
//    public void testAddReview() {
//        Restaurant testDisplayRestaurant = new Restaurant("FarahRest", 5, 30);
//        Review testDisplayReview1 = new Review("Great Food!", "Farah", 4.5, testDisplayRestaurant);
//        Review testDisplayReview2 = new Review("Great Food!", "Farah", 4.5, testDisplayRestaurant);
//        Review testDisplayReview3 = new Review("Great Food!", "Farah", 4.5, testDisplayRestaurant);
//        testDisplayRestaurant.addReview(testDisplayReview1);
//        testDisplayRestaurant.addReview(testDisplayReview2);
//        testDisplayRestaurant.addReview(testDisplayReview3);
//        assertEquals(4.5, testDisplayRestaurant.numberOfStars);
//    }
    @Test
    public void testShopClass()
    {
        Shop testShop =new Shop("Zara","it's really nice place",3);
        Review review = new Review("test3", "good fruite", 4, testShop);
        testShop.addReview(review);

        String expected = "Shop{name='null', description='it's really nice place', numberOfDollarSigns=3, stars=4}";
        assertEquals(expected, testShop.toString());
        assertEquals(1, testShop.reviews.size());
        assertEquals(review, testShop.reviews.get(0));
    }
    @Test
    public void testTheater() {
        Theater theater = new Theater("Farah");
        Review review = new Review("test4", "nice movie", 5, "One Piece", theater);
        theater.addReview(review);

        String expected = "Theater{name='Farah', movies='[]', stars='5'}";
        assertEquals(expected, theater.toString());
        assertEquals(1, theater.reviews.size());
        assertEquals(review, theater.reviews.get(0));
    }


}
