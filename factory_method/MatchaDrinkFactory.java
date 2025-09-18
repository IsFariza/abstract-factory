package factory_method;

public class MatchaDrinkFactory implements DrinksFactory{
    public Drink makeDrink(){
        return new MatchaDrink();
    }
}
