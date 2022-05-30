package Pizzas;

public class ClamPizza extends Pizza {
    public ClamPizza() {
        description = "Пицца с молюсками";
    }

    @Override
    public void prepare() {
        System.out.print("Приготовлена пицца с молюсками, ");
    }

    @Override
    public void bake() {
        System.out.print("испечена пицца с молюсками, ");
    }

    @Override
    public void cut() {
        System.out.print("нарезана пицца с молюсками, ");
    }

    @Override
    public void box() {
        System.out.print("упакована пицца с молюсками. \n");
    }
}
