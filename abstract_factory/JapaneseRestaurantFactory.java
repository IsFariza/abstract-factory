package abstract_factory;

public class JapaneseRestaurantFactory implements RestaurantFactory{
    public Meal serveMeal(){
        return new SushiMeal();
    }

    public Dessert serveDessert(){
        return new MochiDessert();
    }
}
