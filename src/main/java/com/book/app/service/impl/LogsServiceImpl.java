package com.book.app.service.impl;

import com.book.app.bean.Logs;
import com.book.app.dao.LogsDao;
import com.book.app.service.LogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：何汉叁
 * @date ：2023/12/19 15:01
 * @description：TODO
 */
@Service
public class LogsServiceImpl implements LogsService {
    @Autowired
    private static LogsDao logsDao;
    @Override
    public List<Logs> findLogsByPage(int page, int size) {
        return logsDao.findLogsByPage((page-1)*size, size);
    }
}
