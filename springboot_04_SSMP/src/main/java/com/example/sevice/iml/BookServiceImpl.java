package com.example.sevice.iml;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.dao.BookDao;
import com.example.domain.Book;
import com.example.sevice.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * extends ServiceImpl<BookDao,Book> 第一个参数为 实现的类  第二个为具体的实体类
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookDao, Book> implements IBookService {

@Autowired
private BookDao bookDao;
    @Override
    public IPage<Book> getPage(int currentPage, int PageSize) {
        IPage iPage=new Page(currentPage,PageSize);
        return bookDao.selectPage(iPage, null);

    }
}
