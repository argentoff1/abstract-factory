package Pizzas;

public class ClamPizza extends Pizza {
    public ClamPizza() {
        description = "Пицца с молюсками";
    }

    @Override
    void prepare() {
        System.out.println(" приготовлена пицца с молюсками, "); // Можно попробовать GetClass()
    }

    @Override
    void bake() {
        System.out.println("испечена пицца с молюсками, ");
    }

    @Override
    void cut() {
        System.out.println("нарезана пицца с молюсками, ");
    }

    @Override
    void box() {
        System.out.println("упакована пицца с молюсками, \n");
    }
}
