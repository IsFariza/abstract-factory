package factory_method;

public class TeaDrinkFactory implements DrinksFactory{
    public Drink makeDrink(){
        return new TeaDrink();
    }
}
