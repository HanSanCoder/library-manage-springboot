package com.book.app.service;

import com.book.app.bean.Book;

import java.util.List;

public interface BookService {


    List<Book> listPager(int page,  int size, String bname);
    //统计分页记录数
    int count(String bname);
    //类型查找
    List<Book> findByCategory(String category);

    boolean remove(int bid);

    boolean update(Book book);

    boolean save(Book book);
}
