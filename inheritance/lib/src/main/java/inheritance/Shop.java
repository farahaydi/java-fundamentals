package inheritance;

public class Shop implements ShopOrRestaurant {
    protected String name;
    protected String description;
    protected int numberOfDollarSigns;

    public Shop(String name, String description, int numberOfDollarSigns) {
        this.name = name;
        this.description = description;
        this.numberOfDollarSigns = numberOfDollarSigns;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getNumberOfDollarSigns() {
        return numberOfDollarSigns;
    }

    public String toString() {
        return getName() + ", " + getDescription() + ", " + getNumberOfDollarSigns();
    }
}
