package com.book.app.dao;

import com.book.app.bean.Borrow;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BorrowDao {

    List<Borrow> listPage(@Param("page") int page, @Param("size") int size,@Param("bname") String bname,@Param("uname") String uname);

    Long count(@Param("bname") String bname,@Param("uname") String uname);
}
