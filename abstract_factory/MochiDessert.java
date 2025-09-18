package abstract_factory;

public class MochiDessert implements Dessert{
    @Override
    public String setDessert(String topping){
        return "Additional dessert Mochi with " + topping + " topping.";
    }
}
