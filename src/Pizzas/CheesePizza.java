package Pizzas;

public class CheesePizza extends Pizza {
    public CheesePizza() {
        description = "Сырная пицца";
    }

    @Override
    void prepare() {
        System.out.println(" приготовлена сырная пицца, "); // Можно попробовать GetClass()
    }

    @Override
    void bake() {
        System.out.println("испечена сырная пицца, ");
    }

    @Override
    void cut() {
        System.out.println("нарезана сырная пицца, ");
    }

    @Override
    void box() {
        System.out.println("упакована сырная пицца, \n");
    }
}
