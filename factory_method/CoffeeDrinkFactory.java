package factory_method;

public class CoffeeDrinkFactory implements DrinksFactory{
    public Drink makeDrink(){
        return new CoffeeDrink();
    }
}
