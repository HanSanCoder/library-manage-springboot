package com.book.app.service.impl;

import com.book.app.bean.Borrow;
import com.book.app.dao.BorrowDao;
import com.book.app.service.BorrowServeice;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：何汉叁
 * @date ：2023/12/18 15:04
 * @description：TODO
 */
@Service
public class BorrowServiceImpl implements BorrowServeice {
    @Resource
    private BorrowDao borrowDao;

    @Override
    public List<Borrow> listPage(int page, int size, String bname, String uname) {
        return borrowDao.listPage((page-1)*size, size, bname, uname);
    }
    /**
     * @author 何汉叁
     * @description 查看记录数量
     * @date 2023/12/18 15:31
     */
    @Override
    public Long count(String bname, String uname) {
        return borrowDao.count(bname, uname);
    }
}
