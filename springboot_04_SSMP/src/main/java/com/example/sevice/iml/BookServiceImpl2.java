package com.example.sevice.iml;

import com.example.dao.BookDao;
import com.example.domain.Book;
import com.example.sevice.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class BookServiceImpl2 implements BookService {


    @Autowired
    private BookDao bookDao;

    @Override
    public Boolean Save(Book book) {
        return bookDao.insert(book) > 0;

    }

    @Override
    public Boolean update(Book book) {
        return bookDao.updateById(book)>0;
    }

    @Override
    public Boolean delete(Integer id) {
        return bookDao.deleteById(id)>0;
    }

    @Override
    public Book getById(Integer id) {
        return bookDao.selectById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookDao.selectList(null);
    }
}
