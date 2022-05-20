package uz.pdp.booklist.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import uz.pdp.booklist.model.Author;
import uz.pdp.booklist.model.Book;
import uz.pdp.booklist.model.BookDetails;
import uz.pdp.booklist.model.Category;
import uz.pdp.booklist.repository.AuthorRepository;
import uz.pdp.booklist.repository.BookDetailRepository;
import uz.pdp.booklist.repository.BookRepository;
import uz.pdp.booklist.repository.CategoryRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    BookRepository bookRepository;
    @Autowired
    CategoryRepository categoryRepository;
    @Autowired
    BookDetailRepository bookDetailRepository;
    @Autowired
    AuthorRepository authorRepository;
    @Override
    public void run(String... args) throws Exception {
//        List<Category> categoryList = new ArrayList<Category>(Arrays.asList(
//           new Category("Cat 1"),
//           new Category("Cat 2")
//        ));
//        List<Category> savedCAtegoryList = categoryRepository.saveAll(categoryList);
//
//        List<Author> authorList = new ArrayList<>(Arrays.asList(
//           new Author("Otkir","Hoshimov"),
//           new Author("Avtor","Avtorov")
//        ));
//        List<Author> authors = authorRepository.saveAll(authorList);
//
//        Book book = new Book( "Ikki eshik orasi", "Very good", "Uzbek", 1, savedCAtegoryList,authors);
//        Book savedBook = bookRepository.save(book);
//
//        BookDetails bookDetails = new BookDetails("key", "Value", savedBook);
//        bookDetailRepository.save(bookDetails);
    }
}
