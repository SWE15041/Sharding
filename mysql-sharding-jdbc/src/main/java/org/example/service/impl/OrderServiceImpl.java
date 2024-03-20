package org.example.service.impl;

import org.example.domain.Order;
import org.example.mapper.OrderMapper;
import org.example.service.OrderService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Yanni
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderMapper orderMapper;

    @Override
    public Order save(Order order) {
        orderMapper.insert(order);
        return order;
    }

    @Override
    public Order update(Long id, Order order) {
        // TODO: 2024/3/20 error
        Order original = orderMapper.selectById(id);
        BeanUtils.copyProperties(order, original);
        original.setId(id);
        orderMapper.updateById(original);
        return original;
    }

    @Override
    public List<Order> listByUserId(Long userId) {
        return orderMapper.listByUserId(userId);
    }
}
