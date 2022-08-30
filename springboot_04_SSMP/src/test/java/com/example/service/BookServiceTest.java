package com.example.service;

import com.example.sevice.IBookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 */
@SpringBootTest
public class BookServiceTest {
    @Autowired
    private IBookService iBookService;

    @Test
    void testService() {
        System.out.println(iBookService.getById(1));
    }
}
