package org.example.service;

import com.github.pagehelper.PageInfo;
import org.example.domain.Order;
import org.example.web.vo.QueryOrderRequest;

import java.util.List;

/**
 * @author Yanni
 */
public interface OrderService {

    PageInfo<Order> query(QueryOrderRequest req);

    Order save(Order order);

    Order update(Long id, Order order);

    List<Order> listByUserId(Long userId);
}
