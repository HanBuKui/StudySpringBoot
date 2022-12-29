package com.zjh.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;

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
@Validated
public class Product {

    @TableId
    private int pid;
    private String pname;
    private String pdec1;
    private String pdec2;
    @NotEmpty(message = "pdec3 is empty")
    private String pdec3;
    @Max(value = 100,message = "太贵了！！！")
    private double pprice;
    private String pimg1;
    private String pimg2;
    private String pimg3;
}
