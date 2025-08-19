package com.example.BookApplication.Controller;


import com.example.BookApplication.Entity.Book;
import com.example.BookApplication.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/book/v1")
public class BookController {


    //these 4 line constructor injection
    private final BookService bookService;
    @Autowired
    public BookController(BookService bookService){
        this.bookService = bookService;

    }

    @PostMapping("/addBook") //api name add book
    public ResponseEntity<Book> addBook(@RequestBody Book book){
      Book savedBook = bookService.addBook(book);
      return ResponseEntity.ok(savedBook);
    }


    @GetMapping("/getBook/{bookName}")
    public ResponseEntity<Book> getBookByName(@PathVariable("bookName") String name){
         final Book bookByName = bookService.getBookByName(name);
         return ResponseEntity.ok(bookByName);
    }


    @PutMapping("/updateBook") //api name add book
    public ResponseEntity<Book> updateBook(@RequestBody Book book){
        Book updatedBook = bookService.updateBook(book);
        return ResponseEntity.ok(updatedBook);
    }

    @DeleteMapping("/deleteBook/{id}")
    public ResponseEntity<Book> deleteBook(@PathVariable("id") Integer id){
         bookService.deleteBook(id);
        return ResponseEntity.ok().build();
    }


}
