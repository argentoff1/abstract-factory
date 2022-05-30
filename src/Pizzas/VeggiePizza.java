package Pizzas;

public class VeggiePizza extends Pizza {
    public VeggiePizza() {
        description = "Вегетарианская пицца";
    }

    @Override
    public void prepare() {
        System.out.print("Приготовлена вегетарианская пицца, ");
    }

    @Override
    public void bake() {
        System.out.print("испечена вегетарианская пицца, ");
    }

    @Override
    public void cut() {
        System.out.print("нарезана вегетарианская пицца, ");
    }

    @Override
    public void box() {
        System.out.print("упакована вегетарианская пицца.");
    }
}
