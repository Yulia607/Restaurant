package takeout.utils;

public class PrintUtils {
    public static void print(String text) {
        System.out.print(text);
    }

    public static void println() {
        System.out.println();
    }

    public static void printMenuTitle() {
        println();
        println();
        print(" _____________ Take Out Menu ____________");
        println();
        println();
    }

    public static void printMainDishesTitle() {
        print("Our Best Main Dishes");
        println();
        println();

    }

    public static void printSidesTitle() {
        print("Our Healthy Sides");
        println();
        println();


    }

    public static void printDrinksTitle() {
        print("Drinks");
        println();
        println();
    }
    public static void printPrice (double price) {
        if (price <10) {
            print ("$ " + price);
        } else {
            print("$" + price);
        }
    }
    public static void printLine(){
        println();
        print ("_______________________________");
    }


}

