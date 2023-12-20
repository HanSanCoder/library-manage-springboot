package com.book.app.service;

import com.book.app.bean.Logs;

import java.util.List;

public interface LogsService {

    List<Logs> findLogsByPage(int page, int size);
}
