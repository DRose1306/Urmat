package _2023_11_29;

import java.util.List;

public interface Searchable {
    //_2023_11_29.Searchable (Поисковый)
    //        //        Методы:
    //        //            List<_2023_11_29.LibraryItem> findByTitle(String title)
    //        //            List<_2023_11_29.LibraryItem> findByAuthor(String author)
    //        //            List<_2023_11_29.LibraryItem> findByGenre(_2023_11_29.Genre genre)
    List<LibraryItem> findByTitle(String title);
    List<LibraryItem> findByAuthor(String author);
    List<LibraryItem> findByGenre(Genre genre);
}
