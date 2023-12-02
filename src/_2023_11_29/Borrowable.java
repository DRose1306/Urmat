package _2023_11_29;

public interface Borrowable {
    // Интерфейсы:
    //        //    _2023_11_29.Borrowable (Заимствуемый)
    //        //        Методы:
    //        //            void borrowItem(_2023_11_29.User user)
    //        //            void returnItem(_2023_11_29.User user)
    //        //            boolean isAvailable()
    void borrowItem(User user);
    void returnItem(User user);
    boolean isAvailable();
}
