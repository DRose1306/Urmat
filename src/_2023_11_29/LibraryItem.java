package _2023_11_29;

abstract class LibraryItem {
    //Абстрактный класс:
    //        //    _2023_11_29.LibraryItem (Элемент Библиотеки)
    //        //        Поля:
    //        //            String title (название)
    //        //            String author (автор)
    //        //            _2023_11_29.Genre genre (жанр)
    private String title;
    private String author;
    private Genre genre;

    public LibraryItem(String title, String author, Genre genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "_2023_11_29.LibraryItem{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre=" + genre +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
