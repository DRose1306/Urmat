package _2024_02_21.taski;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.never;

@ExtendWith(MockitoExtension.class)
class LibraryManagerTest {
    private final String bookId = "123";
    private final Book book = new Book(bookId, "Title", "Author", true);
    private final List<Book> bookList = Arrays.asList(
            new Book("1", "Book1", "Author1", true),
            new Book("2", "Book2", "Author2", true),
            new Book("3", "Book3", "Author3", true)
    );
    BookRepository bookRepository = Mockito.mock(BookRepository.class);
    LibraryManager libraryManager = new LibraryManager(bookRepository);


    @Test
    void findBookByIdTest() {
        Mockito.when(bookRepository.findById(bookId)).thenReturn(Optional.of(book));
        Optional<Book> result = libraryManager.findBookById(bookId);

        Assertions.assertTrue(result.isPresent());
        assertEquals(book, result.get());
        Mockito.verify(bookRepository).findById(bookId);
    }

    @Test
    void findAllBooksTest() {
        Mockito.when(bookRepository.findAll()).thenReturn(bookList);
        List<Book> result = libraryManager.findAllBooks();

        Assertions.assertEquals(bookList, result);
        Mockito.verify(bookRepository).findAll();
    }

    @Test
    public void findAllBooks_EmptyListTest() {
        Mockito.when(bookRepository.findAll()).thenReturn(Collections.emptyList());
        List<Book> result = libraryManager.findAllBooks();
        Assertions.assertTrue(result.isEmpty());
        Mockito.verify(bookRepository).findAll();
    }

    @Test
    public void addBookTest() {
        Mockito.when(bookRepository.save(book)).thenReturn(book);
        Book result = libraryManager.addBook(book);
        Assertions.assertEquals(book, result);
        Mockito.verify(bookRepository).save(book);
    }

    @Test
    public void addBook_NullTitleTest() {
        Book invalidBook = new Book("1", null, "Author1", true);
        assertThrows(IllegalArgumentException.class, () -> libraryManager.addBook(invalidBook));
    }

    @Test
    public void addBook_NullAuthorTest() {
        Book invalidBook = new Book("1", "Book1", null, true);
        Assertions.assertThrows(IllegalArgumentException.class, () -> libraryManager.addBook(invalidBook));
    }

    @Test
    void deleteBookTest() {
        libraryManager.deleteBook(bookId);
        Mockito.verify(bookRepository).deleteById(bookId);
    }

    @Test
    void updateBookTest() {
        Book updatedBook = new Book(bookId, "Book13", "Merkel", true);
        Mockito.when(bookRepository.existsById(bookId)).thenReturn(true);
        Mockito.when(bookRepository.save(updatedBook)).thenReturn(updatedBook);

        Book result = libraryManager.updateBook(bookId, updatedBook);
        assertEquals(updatedBook, result);

        Mockito.verify(bookRepository).existsById(bookId);
        Mockito.verify(bookRepository).save(updatedBook);
    }

    @Test
    void updateBook_nonExistingBookTest() {
        String nonExistingBookId = "2";
        Book updatedBook = new Book(nonExistingBookId, "Book13", "Merkel", true);
        Mockito.when(bookRepository.existsById(nonExistingBookId)).thenReturn(false);
        Assertions.assertThrows(IllegalArgumentException.class, () -> libraryManager.updateBook(nonExistingBookId, updatedBook));
    }

    @Test
    void findBooksByAuthorTest() {
        String author = "Author1";
        Mockito.when(bookRepository.findByAuthor(author)).thenReturn(bookList);
        List<Book> result = libraryManager.findBooksByAuthor(author);
        Assertions.assertEquals(bookList, result);
        Mockito.verify(bookRepository).findByAuthor(author);
    }

    @Test
    void findBooksByAuthor_nonExistingAuthorTest() {
        String author = "asf";
        Mockito.when(bookRepository.findByAuthor(author)).thenReturn(Collections.emptyList());
        List<Book> result = libraryManager.findBooksByAuthor(author);
        Assertions.assertEquals(Collections.emptyList(), result);
        Mockito.verify(bookRepository).findByAuthor(author);
    }

    @Test
    void findBookByTitleTest() {
        String title = "Title";
        Mockito.when(bookRepository.findByTitle(title)).thenReturn(Optional.of(book));

        Optional<Book> result = libraryManager.findBookByTitle(title);
        Assertions.assertTrue(result.isPresent());

        Assertions.assertEquals(book, result.get());
        Mockito.verify(bookRepository).findByTitle(title);
    }

    @Test
    void findBooksByTitle_nonExistingTitleTest() {
        String title = "Title13";
        Mockito.when(bookRepository.findByTitle(title)).thenReturn(Optional.empty());

        Optional<Book> result = libraryManager.findBookByTitle(title);
        Assertions.assertFalse(result.isPresent());
        Mockito.verify(bookRepository).findByTitle(title);
    }

    @Test
    void findBooksContainingTitleTest() {
        String title = "Book1";
        Mockito.when(bookRepository.findContainingTitle(title)).thenReturn(bookList);

        List<Book> result = libraryManager.findBooksContainingTitle(title);
        Assertions.assertEquals(bookList, result);
        Mockito.verify(bookRepository).findContainingTitle(title);
    }
    @Test
    void findBooksContainingTitle_nonExistingTitleTest() {
        String title = "asdsdf";
        Mockito.when(bookRepository.findContainingTitle(title)).thenReturn(Collections.emptyList());

        List<Book> result = libraryManager.findBooksContainingTitle(title);
        Assertions.assertEquals(Collections.emptyList(), result);
        Mockito.verify(bookRepository).findContainingTitle(title);
    }


    @Test
    void lendBookTest() {
        String userId = "user1";
        Mockito.when(bookRepository.findById(bookId)).thenReturn(Optional.of(book));
        libraryManager.lendBook(bookId, userId);
        Mockito.verify(bookRepository).save(any(Book.class));
    }

    @Test
    void lendBook_BookAlreadyLentTest() {
        book.setLent(true);
        String userId = "user2";
        Mockito.when(bookRepository.findById(bookId)).thenReturn(Optional.of(book));
        Assertions.assertThrows(IllegalStateException.class, () -> libraryManager.lendBook(bookId, userId));
        Mockito.verify(bookRepository, never()).save(any());
    }


    @Test
    void returnBookTest() {
        book.setLent(true);
        Mockito.when(bookRepository.findById(bookId)).thenReturn(Optional.of(book));
        libraryManager.returnBook(bookId);
        Mockito.verify(bookRepository).save(any(Book.class));
    }
    @Test
    void returnBook_BookWasNotLentTest() {
        book.setLent(false);
        Mockito.when(bookRepository.findById(bookId)).thenReturn(Optional.of(book));
        Assertions.assertThrows(IllegalStateException.class, () -> libraryManager.returnBook(bookId));
        Mockito.verify(bookRepository, never()).save(any());
    }
}