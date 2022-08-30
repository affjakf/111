package com.example.dao;

import com.example.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 */
@SpringBootTest
public class daoTest {
    @Autowired
    private BookDao bookDao;
    @Test
    void selectById(){
        System.out.println(bookDao.selectById(3));
    }
}
