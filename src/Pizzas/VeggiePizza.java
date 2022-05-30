package Pizzas;

public class VeggiePizza extends Pizza {
    public VeggiePizza() {
        description = "Вегетарианская пицца";
    }

    @Override
    void prepare() {
        System.out.println(" приготовлена вегетарианская пицца, "); // Можно попробовать GetClass()
    }

    @Override
    void bake() {
        System.out.println("испечена вегетарианская пицца, ");
    }

    @Override
    void cut() {
        System.out.println("нарезана вегетарианская пицца, ");
    }

    @Override
    void box() {
        System.out.println("упакована вегетарианская пицца, \n");
    }
}
