package com.zjh.domain;

import lombok.Data;

/**
 * @ClassName: Product
 * @Description: TODO
 * @author: zjh
 * @date: 2022/12/1  22:29
 * @Version: 1.0
 */

@Data
public class Product {
    private int pid;
    private String pname;
    private String pdec1;
    private String pdec2;
    private String pdec3;
    private float pprice;
    private String pimg1;
    private String pimg2;
    private String pimg3;
}
