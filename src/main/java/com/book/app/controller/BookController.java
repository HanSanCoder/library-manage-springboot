package com.book.app.controller;

import com.book.app.bean.Book;
import com.book.app.bean.Category;
import com.book.app.service.BookService;
import com.book.app.utils.CommonResult;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Tag(name = "图书馆藏API文档")
@RestController
@RequestMapping("/book")
@CrossOrigin
public class BookController {
    @Autowired
    private BookService bookService;

    @Operation(summary = "查询馆藏图书信息")
    @GetMapping("/list")
    public CommonResult listPager(int page,int size,String bname){
        Map<String,Object> map=new HashMap<>();
        map.put("data",bookService.listPager(page,size,bname));
        map.put("total",bookService.count(bname));
        return CommonResult.success(map);
    }

    @Operation(summary = "查询根据类型馆藏图书信息")
    @GetMapping("/findByCategory")
    public CommonResult findByCategory(String category) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("data", bookService.findByCategory(category));
        return CommonResult.success(map);
    }

    @Operation(summary = "删除馆藏图书信息")
    @DeleteMapping("/remove")
    public CommonResult remove(int bid) {
        return CommonResult.success(bookService.remove(bid));
    }

    @Operation(summary = "增加馆藏图书信息")
    @PostMapping("/save")
    public CommonResult save(@RequestBody Book book) {
        return CommonResult.success(bookService.save(book));
    }

    @Operation(summary = "修改馆藏图书信息")
    @PutMapping("/update")
    public CommonResult update(@RequestBody Book book) {
        return CommonResult.success(bookService.update(book));
    }
}
