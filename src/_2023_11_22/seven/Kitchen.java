package _2023_11_22.seven;

import java.util.List;

public class Kitchen {
    //Класс Kitchen:
    //Поля: List<Chef> chefs, List<Order> cookingOrders, boolean isOpen. //
    //Методы для управления кухней и процессом приготовления.
    private List<Chef> chefs;
    private List<Order> cookingOrders;

    @Override
    public String toString() {
        return "Kitchen{" +
                "chefs=" + chefs +
                ", cookingOrders=" + cookingOrders +
                ", isOpen=" + isOpen +
                '}';
    }

    public List<Chef> getChefs() {
        return chefs;
    }

    public void setChefs(List<Chef> chefs) {
        this.chefs = chefs;
    }

    public List<Order> getCookingOrders() {
        return cookingOrders;
    }

    public void setCookingOrders(List<Order> cookingOrders) {
        this.cookingOrders = cookingOrders;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public Kitchen(List<Chef> chefs, List<Order> cookingOrders, boolean isOpen) {
        this.chefs = chefs;
        this.cookingOrders = cookingOrders;
        this.isOpen = isOpen;
    }

    private boolean isOpen;
}
