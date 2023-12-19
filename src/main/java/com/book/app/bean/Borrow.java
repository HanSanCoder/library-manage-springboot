package com.book.app.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ：何汉叁
 * @date ：2023/12/18 14:19
 * @description：借阅信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Borrow {
    private Integer boid;
    private String name;
    private Integer bid;
    private String otime;//借出时间
    private String itime;
    private Integer quantity;
    private Integer deleted;
    private String tel;
    private Integer stat;
}
