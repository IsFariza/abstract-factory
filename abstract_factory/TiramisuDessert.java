package abstract_factory;

public class TiramisuDessert implements Dessert{
    @Override
    public String setDessert(String topping){
        return "Additional dessert Tiramisu with " + topping + " topping.";
    }
}
