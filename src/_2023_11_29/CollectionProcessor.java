package _2023_11_29;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionProcessor {
    public static void main(String[] args) {
        ArrayList<LibraryItem> libraryItems = new ArrayList<>();
        libraryItems.add(new Book("Война и мир", "Толстой", Genre.FICTION, BookStatus.AVAILABLE, LocalDate.of(1800, 02, 28), 1000));
        libraryItems.add(new Book("Преступление и наказание", "Достоевский", Genre.HISTORY, BookStatus.LOST, LocalDate.of(1866, 12, 1), 500));
        libraryItems.add(new Book("Собачье сердце", "Булгаков", Genre.FICTION, BookStatus.BORROWWED, LocalDate.of(1925, 10, 6), 700));

        libraryItems.add(new Magazine("Веселый садовник", "кто-то", Genre.SCIENCE, 25, LocalDate.of(2023, 11, 11), true));
        printAllItems(libraryItems);
        System.out.println();
        listItemsByGenre(libraryItems, Genre.FICTION);
        System.out.println();
        filterByAuthor(libraryItems, "Булгаков");
        System.out.println();
        sortByTitle(libraryItems);


    }

    static void printAllItems(List<LibraryItem> items) {
        for (LibraryItem item : items) {
            System.out.print(item.getAuthor() + " ");
            System.out.print(item.getTitle() + " ");
            System.out.print(item.getGenre() + " ");
            System.out.print(item);
            System.out.println();
        }
    }

    static void listItemsByGenre(List<LibraryItem> items, Genre genre) {
        for (LibraryItem item : items) {
            if (item.getGenre().equals(genre)) {
                System.out.print(item.getAuthor() + " ");
                System.out.print(item.getTitle() + " ");
                System.out.print(item.getGenre() + " ");
                System.out.print(item);
                System.out.println();
            }
        }
    }

    static void sortByTitle(List<LibraryItem> items) {
        Collections.sort(items, Comparator.comparing(LibraryItem::getTitle));
        for(LibraryItem item: items){
            System.out.println(item);
        }
    }

    static void filterByAuthor(List<LibraryItem> items, String author) {
        for (LibraryItem item : items) {
            if (item.getAuthor().equals(author)) {
                System.out.print(item.getAuthor() + " ");
                System.out.print(item.getTitle() + " ");
                System.out.print(item.getGenre() + " ");
                System.out.print(item);
                System.out.println();
            }
        }
    }

    static void countItemsByStatus(List<LibraryItem> items, BookStatus status) {    
    }

    static void updateStatus(List<LibraryItem> items, BookStatus oldStatus, BookStatus newStatus) {

    }

    static void listAvailableItems(List<LibraryItem> items) {

    }

    static void findOldestItem(List<LibraryItem> items) {

    }

    static void groupItemsByAuthor(List<LibraryItem> items) {

    }

    static void listItemsForRepair(List<LibraryItem> items) {

    }

    static void displayItemCount(List<LibraryItem> items) {

    }

    static void listBorrowedItemsByUser(List<LibraryItem> items, User user) {

    }

    static void removeLostItems(List<LibraryItem> items) {

    }

    static void addItemToList(List<LibraryItem> items, LibraryItem item) {

    }

    static void removeItemFromList(List<LibraryItem> items, LibraryItem item) {

    }

    static void sortItemsByPublicationDate(List<LibraryItem> items) {

    }

    static void findMostPopularGenre(List<LibraryItem> items) {

    }

    static void calculateAveragePageCount(List<Book> books) {

    }

    static void listMonthlyMagazines(List<Magazine> magazines) {

    }

    static void listItemsByCondition(List<LibraryItem> items, ItemCondition condition) {

    }

}
