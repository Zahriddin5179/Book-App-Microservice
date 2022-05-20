package uz.pdp.booklist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.booklist.model.BookDetails;

public interface BookDetailRepository extends JpaRepository<BookDetails,Integer> {

}
