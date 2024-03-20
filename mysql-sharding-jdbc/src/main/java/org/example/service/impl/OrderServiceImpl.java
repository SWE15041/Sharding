package org.example.service.impl;

import org.example.domain.Order;
import org.example.mapper.OrderMapper;
import org.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Yanni
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderMapper orderMapper;

    @Override
    public Order add(Order order) {
         orderMapper.insert(order);
        return order;
    }
}
