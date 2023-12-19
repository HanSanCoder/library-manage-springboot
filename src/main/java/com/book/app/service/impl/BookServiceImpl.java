package com.book.app.service.impl;

import com.book.app.bean.Book;
import com.book.app.bean.Category;
import com.book.app.dao.BookDao;
import com.book.app.dao.CategoryDao;
import com.book.app.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookServiceImpl  implements BookService {
    @Autowired
    private BookDao bookDao;
    @Autowired
    private CategoryDao categoryDao;
    @Override
    public List<Book> listPager(int page, int size, String bname) {
        return bookDao.listPager((page-1)*size,size,bname);
    }

    @Override
    public int count(String bname) {
        return bookDao.count(bname);
    }

    @Override
    public List<Book> findByCategory(String category) {
        return null;
    }

    @Override
    public boolean remove(int bid) {
        return bookDao.remove(bid)>0;
    }
    @Transactional
    @Override
    public boolean update(Book book) {
//        Category category = categoryDao.findCategoryByCateid(book.getCateid());
//        category.setCatename(book.getCatename());
        return bookDao.update(book)>0;
    }

    @Override
    public boolean save(Book book) {
//        book.setCateid(categoryDao.findCategoryByCatename(book.getCatename()));
        return bookDao.save(book)>0;
    }
}
