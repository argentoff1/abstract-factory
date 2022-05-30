import Cooking.*;

public class Main {

    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);

        pizzaStore.orderPizza("cheese");
        pizzaStore.orderPizza("pepperoni");
        pizzaStore.orderPizza("clam");
        pizzaStore.orderPizza("veggie");
    }
}
