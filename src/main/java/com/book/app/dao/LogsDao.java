package com.book.app.dao;

import com.book.app.bean.Logs;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public interface LogsDao {
    List<Logs> findLogsByPage(@Param("page") int page, @Param("size") int size);
}
