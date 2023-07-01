package madanhi.allan.bookcollection.service;

import madanhi.allan.bookcollection.model.Book;
import madanhi.allan.bookcollection.repository.BookRepository;

import java.util.List;
import java.util.Objects;

class BookServiceImpl implements  BookService{
    BookRepository bookRepository;
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository=bookRepository;
    }

    @Override
    public List<Book> getBookList() {

        return bookRepository.findAll();
    }

    @Override
    public void add(Book book) {
            bookRepository.save(book);
    }

    @Override
    public void update(Book book) {
       Book incollection = bookRepository.findById(book.getIsbn()).orElseThrow();
        if(!Objects.isNull(incollection)){
            incollection.setAuthor("");
            incollection.setCategory("");
            bookRepository.save(incollection);
        }
    }

    @Override
    public void delete(Long bookId) {
        bookRepository.findById(bookId)
                .ifPresent(book->bookRepository.delete(book));

    }
}
