package com.book.app.dao;

import com.book.app.bean.Book;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BookDao {

    List<Book> listPager(@Param("page") int page, @Param("size") int size,
                         @Param("bname")String bname);
    //统计分页记录数
    int count(@Param("bname")String bname);

    Integer remove(int bid);

    int update(Book book);

    int save(Book book);
}
