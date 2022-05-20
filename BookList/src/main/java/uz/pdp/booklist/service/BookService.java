package uz.pdp.booklist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.pdp.booklist.model.Book;
import uz.pdp.booklist.payload.ApiResponse;
import uz.pdp.booklist.repository.BookRepository;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public HttpEntity<?>getAllBooks(){
        List<Book> bookList = bookRepository.findAll();
        return ResponseEntity.ok(new ApiResponse("Success",true,bookList));
    }
}
