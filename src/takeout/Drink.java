package takeout;

public class Drink {
    private String drinkName;
    private double drinkPrice;

            Drink (String name, double price) {
                this.drinkName = name;
                this.drinkPrice = price;
            }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public double getDrinkPrice() {
        return drinkPrice;
    }

    public void setDrinkPrice(double drinkPrice) {
        this.drinkPrice = drinkPrice;
    }
}
