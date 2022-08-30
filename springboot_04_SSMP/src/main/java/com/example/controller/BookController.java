package com.example.controller;

import cn.yzstu.service.IpCountService;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.controller.util.R;
import com.example.domain.Book;
import com.example.sevice.IBookService;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 */
@Slf4j//减少日志对象的声明操作
@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private IBookService iBookService;
    //获取到一个logger的对象
    //private static final Logger log = LoggerFactory.getLogger(BookController.class);

    @GetMapping
    public R getByAll() {
        List<Book> list = iBookService.list();
        return new R(true, list);
    }

    @GetMapping("/{id}")
    public R getById(@PathVariable Integer id) {
        log.error("这里面存放日志信息");
        return new R(true, iBookService.getById(id));
    }

    /*put为修改*/
    @PutMapping
    public R update(@RequestBody Book book) {
        UpdateWrapper<Book> bookUpdateWrapper = new UpdateWrapper<>();
        bookUpdateWrapper.eq("id", book.getId());
        return new R(iBookService.update(book, bookUpdateWrapper));
    }

    @DeleteMapping("/{id}")
    public R delete(@PathVariable Integer id) {
        return new R(iBookService.removeById(id));
    }

    /*post为增加*/
    @PostMapping
    public R save(@RequestBody Book book) {
        return new R(iBookService.save(book));
    }

    @Autowired
    private IpCountService ipCountService;

    /*分页*/
    @GetMapping("{currentPage}/{PageSize}")
    public R getPage(@PathVariable int currentPage, @PathVariable int PageSize) {
        ipCountService.count();
        //对查询结果进行校验，如果当前页码值大于最大页码值，使用最大页码值作为当前页码值重新查询
        return new R(true, iBookService.getPage(currentPage, PageSize));

    }
}
