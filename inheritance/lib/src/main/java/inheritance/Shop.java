package inheritance;

public class Shop extends addReview{
    protected String name;
    protected String description;
    protected int numberOfDollarSigns;

    public Shop(String name,String description,int numberOfDollarSigns) {
        super(name);
        this.description=description;
        this.numberOfDollarSigns=numberOfDollarSigns;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", numberOfDollarSigns=" + numberOfDollarSigns +
                ", stars=" + stars +
                '}';
    }
}
