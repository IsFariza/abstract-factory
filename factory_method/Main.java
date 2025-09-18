package factory_method;

public class Main {
    public static void main(String[] args){
        DrinksFactory coffeeFactory = new CoffeeDrinkFactory();
        Drink coffee = coffeeFactory.makeDrink();
        coffee.sellDrink();

        DrinksFactory teaUpdatedFactory = new TeaDrinkFactory();
        Drink tea = teaUpdatedFactory.makeDrink();
        tea.sellDrink();
    }
}
