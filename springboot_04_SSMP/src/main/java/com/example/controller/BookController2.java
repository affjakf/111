package com.example.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.domain.Book;
import com.example.sevice.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 */
/*@RestController*/
@RequestMapping("/books")
public class BookController2 {
    @Autowired
    private IBookService iBookService;

    @GetMapping
    public List<Book> getByAll() {
        return iBookService.list();
    }
    /*put为修改*/
    @PutMapping
    public Boolean update(@RequestBody Book book){
        return iBookService.update(book,null);
    }
    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Integer id){
        return iBookService.removeById(id);
    }
/*post为增加*/
    @PostMapping
    public Boolean save(@RequestBody Book book){
        return iBookService.save(book);
    }
    /*分页*/
    @GetMapping("{currentPage}/{PageSize}")
    public IPage<Book> getPage(@PathVariable int currentPage,@PathVariable int PageSize){
    return    iBookService.getPage(currentPage, PageSize);

    }
}
