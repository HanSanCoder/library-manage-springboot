package com.book.app.controller;

import com.book.app.bean.Category;
import com.book.app.service.CategoryService;
import com.book.app.utils.CommonResult;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Tag(name = "图书类别API文档")
@RestController
@RequestMapping("/category")
@CrossOrigin
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @Operation(summary = "查询图书类别信息")
    @GetMapping("/list")
    public CommonResult listPager(int page,int size,String catename){
        Map<String,Object> map=new HashMap<>();
        map.put("data",categoryService.listPager(page,size,catename));
        map.put("total",categoryService.count(catename));
        return CommonResult.success(map);
    }
    @Operation(summary = "查询所有图书类别信息")
    @GetMapping("/findAllCategory")
    public CommonResult findAllCategory(String catename) {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("data", categoryService.findAllCategory());
        map.put("total", categoryService.count(catename));
        return CommonResult.success(map);
    }

    @Operation(summary = "根据ID图书类别信息")
    @DeleteMapping("/remove")
    public CommonResult  remove(int cid){
     return CommonResult.success(categoryService.removeCategory(cid));
    }

    @Operation(summary = "添加图书类别信息")
    @PostMapping("/save")
    public   CommonResult save(@RequestBody Category category){
        return CommonResult.success(categoryService.saveCategory(category));
    }
    @Operation(summary = "修改图书类别信息")
    @PutMapping("/update")
    public   CommonResult update(@RequestBody Category category){
        return CommonResult.success(categoryService.updateCategory(category));
    }
}
