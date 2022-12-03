package com.zjh.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: Product
 * @Description: TODO
 * @author: zjh
 * @date: 2022/12/3  23:41
 * @Version: 1.0
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @TableId
    private int pid;
    private String pname;
    private String pdec1;
    private String pdec2;
    private String pdec3;
    private double pprice;
    private String pimg1;
    private String pimg2;
    private String pimg3;
}
