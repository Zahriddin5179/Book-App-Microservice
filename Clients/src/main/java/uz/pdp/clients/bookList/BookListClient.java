package uz.pdp.clients.bookList;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import uz.pdp.booklist.model.Book;

import java.util.List;

@FeignClient("bookList")
public interface BookListClient {
    @GetMapping("/api/book")
    List<Book>getAllBooks();
}
