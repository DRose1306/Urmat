package _2023_11_29;

import java.time.LocalDate;

public class Book extends LibraryItem implements Borrowable, Maintainable{
    //_2023_11_29.Book (Книга) Реализует: _2023_11_29.LibraryItem, _2023_11_29.Borrowable, _2023_11_29.Maintainable
    //        //        Поля:
    //        //            _2023_11_29.BookStatus status
    //        //            LocalDate publishDate
    //        //            int pageCount
    private BookStatus status;
    private LocalDate publishDate;
    private int pageCount;
    private ItemCondition condition;

    private ItemCondition getCondition() {
        return condition;
    }

    public BookStatus getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "_2023_11_29.Book{" +
                "status=" + status +
                ", publishDate=" + publishDate +
                ", pageCount=" + pageCount +
                '}';
    }

    public Book(String title, String author, Genre genre, BookStatus status, LocalDate publishDate, int pageCount, ItemCondition condition) {
        super(title, author, genre);
        this.status = status;
        this.publishDate = publishDate;
        this.pageCount = pageCount;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public void borrowItem(User user) {
        user.getBorrowedItems().add(this);
        this.status = BookStatus.BORROWWED;
    }

    @Override
    public void returnItem(User user) {

    }

    @Override
    public boolean isAvailable() {
        return false;
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
