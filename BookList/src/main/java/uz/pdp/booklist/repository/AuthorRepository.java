package uz.pdp.booklist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.booklist.model.Author;
import uz.pdp.booklist.model.Category;

public interface AuthorRepository extends JpaRepository<Author,Integer> {
}
