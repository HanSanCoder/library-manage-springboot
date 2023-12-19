package com.book.app.controller;

import com.book.app.service.BorrowServeice;
import com.book.app.utils.CommonResult;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author ：何汉叁
 * @date ：2023/12/18 14:59
 * @description：TODO
 */

@Tag(name = "借阅图书信息管理")
@RestController
@CrossOrigin
@RequestMapping("/borrow")
public class BorrowController {
    @Resource
    private BorrowServeice borrowServeice;

    @Operation(summary = "获取借阅记录")
    @GetMapping("/list")
    public CommonResult list(int page, int size, String bname, String uname) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("data", borrowServeice.listPage(page, size, bname, uname));
        map.put("total", borrowServeice.count(bname, uname));
        return CommonResult.success(map);
    }
}
