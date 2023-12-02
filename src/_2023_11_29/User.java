package _2023_11_29;

import java.util.List;

public class User {
    //_2023_11_29.User (Пользователь) Реализует: _2023_11_29.Searchable
    //        //        Поля:
    //        //            String name
    //        //            String id
    //        //            List<_2023_11_29.LibraryItem> borrowedItems
    private String name;
    private String id;
    private List<LibraryItem> borrowedItems;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<LibraryItem> getBorrowedItems() {
        return borrowedItems;
    }

    public void setBorrowedItems(List<LibraryItem> borrowedItems) {
        this.borrowedItems = borrowedItems;
    }
}
