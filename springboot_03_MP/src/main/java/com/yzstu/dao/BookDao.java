package com.yzstu.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yzstu.domain.tbl_book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.awt.print.Book;

/**
 *
 */
@Mapper
public interface BookDao extends BaseMapper<tbl_book> {


}
