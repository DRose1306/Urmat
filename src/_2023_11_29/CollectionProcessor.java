package _2023_11_29;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionProcessor {
    public static void main(String[] args) {
        ArrayList<LibraryItem> libraryItems = new ArrayList<>();
        libraryItems.add(new Book("Война и мир", "Толстой", Genre.FICTION, BookStatus.AVAILABLE, LocalDate.of(1800, 02, 28), 1000, ItemCondition.NEW));
        libraryItems.add(new Book("Преступление и наказание", "Достоевский", Genre.HISTORY, BookStatus.LOST, LocalDate.of(1866, 12, 1), 500, ItemCondition.POOR));
        libraryItems.add(new Book("Собачье сердце", "Булгаков", Genre.FICTION, BookStatus.BORROWWED, LocalDate.of(1925, 10, 6), 700, ItemCondition.DAMAGE));

        libraryItems.add(new Magazine("Веселый садовник", "кто-то", Genre.SCIENCE, 25, LocalDate.of(2023, 11, 11), true));
        libraryItems.add(new Magazine("1000 идей для хозяйки", "хозяйки", Genre.NON_FICTION, 3, LocalDate.of(2023, 12, 3), true));

        //printAllItems(libraryItems);
        //listItemsByGenre(libraryItems, Genre.FICTION);
        //filterByAuthor(libraryItems, "Булгаков");
        //sortByTitle(libraryItems);
        //int count = countItemsByStatus(libraryItems, BookStatus.AVAILABLE);
        //System.out.println("Книги с данным статусом имеются в количестве " + count);
        //listAvailableItems(libraryItems);
        //LibraryItem oldest =  findOldestItem(libraryItems);
        //System.out.println(oldest.getTitle);
        //groupItemsByAuthor(libraryItems);
        //updateStatus(libraryItems, BookStatus.AVAILABLE, BookStatus.BORROWWED);
        //displayItemCount(libraryItems);
       // User Urmat = new User("Urmat", "13", );//TODO
       // listBorrowedItemsByUser(libraryItems, Urmat);

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
        for (LibraryItem item : items) {
            System.out.println(item.getTitle());
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

    static int countItemsByStatus(List<LibraryItem> items, BookStatus status) {
        int count = 0;
        for (LibraryItem item : items) {
            if (item instanceof Book) {
                if (((Book) item).getStatus().equals(status))
                    count++;
            }
        }
        return count;
    }

    static void updateStatus(List<LibraryItem> items, BookStatus oldStatus, BookStatus newStatus) {
        for (LibraryItem item : items) {
            if (item instanceof Book) {
                System.out.print(item + "Old Status : ");
                System.out.println(oldStatus = ((Book) item).getStatus());

                ((Book) item).setStatus(); //TODO
            }
        }
    }

    static void listAvailableItems(List<LibraryItem> items) {
        for (LibraryItem item : items) {
            if (item instanceof Book) {
                if (((Book) item).getStatus().equals(BookStatus.AVAILABLE)) {
                    System.out.print(item.getAuthor() + " ");
                    System.out.print(item.getTitle() + " ");
                    System.out.print(item.getGenre() + " ");
                    System.out.println(item);
                }
            }
        }
    }

    static LibraryItem findOldestItem(List<LibraryItem> items) {
        LocalDate currentDate = LocalDate.now();
        LibraryItem oldestItem = null;
        for (LibraryItem item : items) {
            if (item instanceof Book) {
                Book temp = (Book) item;
                if (temp.getPublishDate().isBefore(currentDate)) {
                    currentDate = temp.getPublishDate();
                    oldestItem = temp;
                }
            } else {
                Magazine temp = (Magazine) item;
                if (temp.getReleaseDate().isBefore(currentDate)) {
                    currentDate = temp.getReleaseDate();
                    oldestItem = temp;
                }
            }
        }
        return oldestItem;
    }

    static void groupItemsByAuthor(List<LibraryItem> items) {
        List<String> group = new ArrayList<>();
        for (LibraryItem item : items) {
            if (!group.contains(item.getAuthor())) {
                group.add(item.getAuthor());
            }
        }
        for (String author : group) {
            System.out.print("Author " + author + " Books : ");
            for (LibraryItem item : items) {
                if (item.getAuthor().equals(author)) {
                    System.out.println(" " + item.getTitle());
                }
            }
            System.out.println();
        }
    }

    static void listItemsForRepair(List<LibraryItem> items, ItemCondition condition) {
        for (LibraryItem item : items) {
            if (item instanceof Book) {
                if (((Book) item).checkCondition().equals(ItemCondition.DAMAGE)) {
                    //updateStatus((((Book) item));//TODO
                }
            }
        }
    }

    static void displayItemCount(List<LibraryItem> items) {
        int count = 0;
        for (int i = 0; i < items.size(); i++) {
            count = i + 1;
        }
        System.out.println("количество элементов равно : " + count);
    }


    static void listBorrowedItemsByUser(List<LibraryItem> items, User user) {
        for (LibraryItem item : items) {
            if (user.getBorrowedItems().equals(items)){
                System.out.println(item);//TODO
            }
        }
            System.out.println();
    }

    static void removeLostItems(List<LibraryItem> items) {

    }

    static void addItemToList(List<LibraryItem> items, LibraryItem item) {

    }

    static void removeItemFromList(List<LibraryItem> items, LibraryItem item) {

    }

    static void sortItemsByPublicationDate(List<LibraryItem> items) {
        for (int i = 0; i < items.size(); i++) {

        }
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
