package com.book.app.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author ：何汉叁
 * @date ：2023/12/19 14:57
 * @description：TODO
 */
@Data
public class Logs implements Serializable{
    private String methods;
    private String ip;
    private String opertime;
    private String ddesc;
}
