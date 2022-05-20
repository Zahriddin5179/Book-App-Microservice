package uz.pdp.booklist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.booklist.model.Category;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
