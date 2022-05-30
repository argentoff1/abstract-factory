package Pizzas;

public abstract class Pizza {
    public String description;

    public void prepare() {
        System.out.println(" приготовлена, ");
    }

    public void bake() {
        System.out.println("испечена, ");
    }

    public void cut() {
        System.out.println("нарезана, ");
    }

    public void box() {
        System.out.println("упакована.");
    }
}
