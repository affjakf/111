package com.itheima.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.awt.print.Book;

/**
 *
 */
@Mapper
public interface BookDao {

    void save();
    @Select("select * from tbl_book where id=${id}")

    Book getById(Integer id);
}
