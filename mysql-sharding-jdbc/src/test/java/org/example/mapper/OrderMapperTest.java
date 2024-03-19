package org.example.mapper;

import org.example.SpringTest;
import org.example.domain.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Yanni
 */
class OrderMapperTest extends SpringTest {

    @Autowired
    OrderMapper orderMapper;

    @Test
    void add() {
        Order order = new Order();
        order.setUserId(10086L);
        order.setOrderId(10086L);
        order.setUserName("admin");
        orderMapper.add(order);
    }

    @Test
    void batchAdd() {
        for (long i = 0; i < 10000; i++) {
            Order order = new Order();
            order.setId(i);
            order.setUserId(i);
            order.setOrderId(i);
            order.setUserName("admin");
            orderMapper.add(order);
        }
    }

    @Test
    void listAll() {
        List<Order> orders = orderMapper.listAll();
        orders.forEach(order -> System.out.println(order.toString()));
    }
}