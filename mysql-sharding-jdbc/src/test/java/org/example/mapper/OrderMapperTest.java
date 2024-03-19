package org.example.mapper;

import org.example.SpringTest;
import org.example.domain.Course;
import org.example.domain.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Yanni
 */
class OrderMapperTest extends SpringTest {

    @Autowired
    OrderMapper orderMapper;

    @Test
    void add() {
        Order order = new Order();
        order.setId(1L);
        order.setUserId(10086L);
        order.setOrderId(10086L);
        order.setUserName("admin");
        orderMapper.add(order);
    }
}