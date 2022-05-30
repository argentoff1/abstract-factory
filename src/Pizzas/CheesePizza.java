package Pizzas;

public class CheesePizza extends Pizza {
    public CheesePizza() {
        description = "Сырная пицца";
    }

    @Override
    public void prepare() {
        System.out.print("Приготовлена сырная пицца, ");
    }

    @Override
    public void bake() {
        System.out.print("испечена сырная пицца, ");
    }

    @Override
    public void cut() {
        System.out.print("нарезана сырная пицца, ");
    }

    @Override
    public void box() {
        System.out.print("упакована сырная пицца. \n");
    }
}
