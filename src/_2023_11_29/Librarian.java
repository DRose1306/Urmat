package _2023_11_29;

import java.util.List;

public class Librarian implements Maintainable {
    //_2023_11_29.Librarian (Библиотекарь) Реализует: _2023_11_29.Maintainable
    //        //        Поля:
    //        //            String name
    //        //            String employeeId
    //        //            List<_2023_11_29.LibraryItem> managedItems
    private String name;
    private String employeeId;
    private List<LibraryItem> managedItems;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public List<LibraryItem> getManagedItems() {
        return managedItems;
    }

    public void setManagedItems(List<LibraryItem> managedItems) {
        this.managedItems = managedItems;
    }

    @Override
    public void repairItem() {

    }

    @Override
    public void updateItemCondition(ItemCondition condition) {

    }

    @Override
    public ItemCondition checkCondition() {
        return null;
    }
}
