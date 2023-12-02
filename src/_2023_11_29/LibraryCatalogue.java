package _2023_11_29;

import java.util.List;

public class LibraryCatalogue implements Searchable{
    //_2023_11_29.LibraryCatalogue (Каталог Библиотеки) Реализует: _2023_11_29.Searchable
    //        //        Поля:
    //        //            List<_2023_11_29.Book> books
    //        //            List<_2023_11_29.Magazine> magazines
    private List<Book> books;
    private List<Magazine> magazines;


    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Magazine> getMagazines() {
        return magazines;
    }

    public void setMagazines(List<Magazine> magazines) {
        this.magazines = magazines;
    }

    @Override
    public List<LibraryItem> findByTitle(String title) {
        return null;
    }

    @Override
    public List<LibraryItem> findByAuthor(String author) {
        return null;
    }

    @Override
    public List<LibraryItem> findByGenre(Genre genre) {
        return null;
    }
}
