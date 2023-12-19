package com.book.app.service;

import com.book.app.bean.Borrow;

import java.util.List;

public interface BorrowServeice {
    List<Borrow> listPage(int page, int size, String bname, String uname);

    Long count(String bname, String uname);
}
