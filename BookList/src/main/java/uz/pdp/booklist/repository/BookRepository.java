package uz.pdp.booklist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.booklist.model.Book;

public interface BookRepository extends JpaRepository<Book,Integer> {
    Book getBookByTitle(String title);
}
