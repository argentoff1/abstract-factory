package Pizzas;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        description = "Пицца пепперони";
    }

    @Override
    void prepare() {
        System.out.println(" приготовлена пицца пепперони, "); // Можно попробовать GetClass()
    }

    @Override
    void bake() {
        System.out.println("испечена пицца пепперони, ");
    }

    @Override
    void cut() {
        System.out.println("нарезана пицца пепперони, ");
    }

    @Override
    void box() {
        System.out.println("упакована пицца пепперони, \n");
    }
}
