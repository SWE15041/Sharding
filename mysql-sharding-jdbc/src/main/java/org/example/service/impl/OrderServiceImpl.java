package org.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.example.domain.Order;
import org.example.mapper.OrderMapper;
import org.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Yanni
 */
@Service()
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
        UpdateWrapper<Order> updateWrapper = Wrappers.update();
        updateWrapper.set("total_amount", order.getTotalAmount()).eq("id", id);
        int rows = orderMapper.update(updateWrapper);
        System.out.println("更新影响的行数：" + rows);
        return orderMapper.selectById(id);
    }

    @Override
    public List<Order> listByUserId(Long userId) {
        return orderMapper.listByUserId(userId);
    }
}
