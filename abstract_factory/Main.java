package abstract_factory;

public class Main {
    public static void main(String[] args){

        RestaurantFactory italianFactory = new ItalianRestaurantFactory();
        Meal italianMeal = italianFactory.serveMeal();
        Dessert italianDessert = italianFactory.serveDessert();

        RestaurantFactory japaneseFactory = new JapaneseRestaurantFactory();
        Meal japaneseMeal = japaneseFactory.serveMeal();
        Dessert japaneseDessert = japaneseFactory.serveDessert();

        System.out.println(italianMeal.setMeal());
        System.out.println(italianDessert.setDessert(ToppingForDessert.askForTopping(italianMeal)));
        System.out.println();
        System.out.println(japaneseMeal.setMeal());
        System.out.println(japaneseDessert.setDessert(ToppingForDessert.askForTopping(japaneseMeal)));

    }
}
