package abstract_factory;

import java.util.Scanner;

public class ToppingForDessert {
    public static String askForTopping(Meal meal){
        System.out.println("We give you Free Dessert for your meal!");
        if(meal instanceof PastaMeal){
            System.out.println("What topping you want for your Tiramisu?");
        } else if (meal instanceof SushiMeal){
            System.out.println("What topping you want for your Mochi?");
        }
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
