package com.book.app.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book  implements Serializable {
    private Integer bid;
    private String bnum;
    private String bname;
    private String ddesc;
    private Integer price;
    private String author;
    private Integer quantity;
    private String createtime;
    private String modifytime;
    private Integer deleted;
    private Integer cateid;
    private String catename;
}
