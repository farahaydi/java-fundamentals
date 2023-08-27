# java-fundamentals

# **LAB01**
> On This Lab I work on 3 Function in this path => [MainJava](./basics/Main.java)
- Pluralize
- flipNHeads
- clock

# **LAB02**
>on This Lab I work on 4 Function in this path => [Library](./basicLibrary/lib/src/main/java/basiclibrary/Library.java)
> and make testing on this path => [testing](./basicLibrary/lib/src/test/java/basiclibrary/LibraryTest.java)

- roll
- containsDuplicates
- calculatingAverages
- arraysOfArrays

# **LAB03**
> on this file I work on 3 Function first 2 Function using Hashing => [Library](./basicLibrary/lib/src/main/java/basiclibrary/Library.java)
> Testing [HashingTest](./basicLibrary/lib/src/test/java/basiclibrary/LibraryTest.java)
> and last function using File I/O => [App](./linter/app/src/main/java/linter/App.java) 
> testing [linterTesting](./linter/app/src/test/java/linter/AppTest.java)

- AnalyzingWeatherData
- tally
- JavaScriptLinter
- 
- # **LAB06**

>on this lab I create 2 class
- Restaurant -> on this class we have some Attribute: 1- restaurantName 2-numberOfStars 3-categoryPrice 4-ReviewList 'from type Review'
- [RestaurantClass](./inheritance/lib/src/main/java/inheritance/Restaurant.java)
- 
    and some method :1- setNumberOfStars =>(to check that number of star between 1 and 5)
                     2- toString => to display all data we set on this class.
                     3- getRestaurantName => return Restaurant Name
                     4- getCategoryPrice => to return Category Price with '$'
                     5-addReview => to make sure that review associate with restaurant and calculate the avg of numberOfStars

- Review -> on this class we have 1-reviewBody 2-author 3-numberOfStars 4-restaurant
- [ReviewClass](./inheritance/lib/src/main/java/inheritance/Review.java)
- 
    and some method :- 1- setNumberOfStars =>(to check that number of star between 1 and 5)
                       2- toString => to display all data we set on this class.
- Library -> I just create an object from RestaurantClass and ReviewClass and check the method 
- [LibraryClass](./inheritance/lib/src/main/java/inheritance/Library.java)

- Testing 
- I make 3 test on this file 
- [LibraryTest](./inheritance/lib/src/test/java/inheritance/LibraryTest.java)

- 
- # **LAB07**
>on this lab I create 2 class and 1 Interface
- Shop -> on this class we have some Attribute: 1- name 2-description 3-numberOfDollarSigns 
- [ShopClass](./inheritance/lib/src/main/java/inheritance/Shop.java)
-
and some method :
1- getName => override it from superClass addReview
2- toString => to display all data we set on this class.

- Theater -> on this class we have 1-movies 
- [TheaterClass](./inheritance/lib/src/main/java/inheritance/Theater.java)
-
and some method :- 1- addMovie
2-removeMovie
3- getName => override it from superClass addReview
4- toString => to display all data we set on this class.

-Super Class called addReview 
> we make this super class for all common method then exdends all subclass from this super
[addReview](./inheritance/lib/src/main/java/inheritance/addReview.java)

- Testing
- I make 4 test on this file, for both review and toString
- [LibraryTest](./inheritance/lib/src/test/java/inheritance/LibraryTest.java)

