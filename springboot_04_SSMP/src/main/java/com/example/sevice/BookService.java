package com.example.sevice;

import com.example.domain.Book;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */

public interface BookService {
    Boolean Save(Book book);
    Boolean update(Book book);
    Boolean delete(Integer id);
    Book getById(Integer id);
    List<Book> getAll();
}
