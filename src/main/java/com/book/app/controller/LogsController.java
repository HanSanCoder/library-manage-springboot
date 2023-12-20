package com.book.app.controller;

import com.book.app.service.LogsService;
import com.book.app.utils.CommonResult;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：何汉叁
 * @date ：2023/12/19 14:58
 * @description：TODO
 */
@Tag(name = "日志管理")
@RestController
@CrossOrigin
@RequestMapping("/logs")
public class LogsController {
    @Resource
    private LogsService logsService;
    @GetMapping("/findLogsByPage")
    @Operation(summary = "查看日志")
    public CommonResult findLogsByPage(int page, int size) {
        return CommonResult.success(logsService.findLogsByPage(page, size));
    }
}
