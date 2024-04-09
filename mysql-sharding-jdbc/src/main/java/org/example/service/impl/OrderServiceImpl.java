package org.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.example.domain.Order;
import org.example.mapper.OrderMapper;
import org.example.service.OrderService;
import org.example.web.vo.QueryOrderRequest;
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
    public PageInfo<Order> query(QueryOrderRequest req) {
        PageHelper.startPage(req.getPageNo(), req.getPageSize());
        LambdaQueryWrapper<Order> query = new LambdaQueryWrapper<>();
        if (req.getUserId() != null) {
            query.eq(Order::getUserId, req.getUserId());
        }
        List<Order> orders = orderMapper.selectList(query);
        return new PageInfo<>(orders);
    }

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
