package _2023_11_22.seven;

import java.time.LocalDate;
import java.util.List;

public class Menu {
    //kласс Menu:
    //Поля: List<MenuItem> items, String description, LocalDate lastUpdated.
    //Методы для управления меню.
    private List<MenuItem> items;
    private String description;

    @Override
    public String toString() {
        return "Menu{" +
                "items=" + items +
                ", description='" + description + '\'' +
                ", lastUpdated=" + lastUpdated +
                '}';
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public void setItems(List<MenuItem> items) {
        this.items = items;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Menu(List<MenuItem> items, String description, LocalDate lastUpdated) {
        this.items = items;
        this.description = description;
        this.lastUpdated = lastUpdated;
    }

    private LocalDate lastUpdated;
}
