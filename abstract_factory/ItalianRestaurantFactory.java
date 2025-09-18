package abstract_factory;

public class ItalianRestaurantFactory implements RestaurantFactory{
    public Meal serveMeal(){
        return new PastaMeal();
    }

    public Dessert serveDessert(){
        return new TiramisuDessert();
    }
}
