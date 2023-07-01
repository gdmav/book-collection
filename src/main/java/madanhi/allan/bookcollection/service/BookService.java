package madanhi.allan.bookcollection.service;

import madanhi.allan.bookcollection.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BookService {
    List<Book> getBookList();
    void add(Book book);
    void update(Book book);
    void delete(Long bookId);



}
