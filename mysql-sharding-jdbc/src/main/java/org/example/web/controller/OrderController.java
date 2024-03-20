package org.example.web.controller;

import org.example.domain.Order;
import org.example.service.OrderService;
import org.example.web.vo.OrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Yanni
 */
@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping
    public Order save(@RequestBody Order order) {
        return orderService.save(order);
    }

    @PutMapping("/{id}")
    public Order update(@PathVariable("id") Long id, @RequestBody Order order) {
        return orderService.update(id, order);
    }

    @PutMapping
    @ResponseBody
    public List<Order> list(@RequestBody OrderVO vo) {
        return orderService.listByUserId(vo.userId);
    }
}
