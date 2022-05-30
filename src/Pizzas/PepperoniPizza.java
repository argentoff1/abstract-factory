package Pizzas;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        description = "Пицца пепперони";
    }

    @Override
    public void prepare() {
        System.out.print("Приготовлена пицца пепперони, ");
    }

    @Override
    public void bake() {
        System.out.print("испечена пицца пепперони, ");
    }

    @Override
    public void cut() {
        System.out.print("нарезана пицца пепперони, ");
    }

    @Override
    public void box() {
        System.out.print("упакована пицца пепперони. \n");
    }
}
