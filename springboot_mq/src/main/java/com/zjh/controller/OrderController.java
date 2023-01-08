package com.zjh.controller;

import com.zjh.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: OrderController
 * @Description: TODO
 * @author: zjh
 * @date: 2023/1/8  21:46
 * @Version: 1.0
 */

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/{id}")
    public void order(@PathVariable String id){
        orderService.order(id);
    }

}
