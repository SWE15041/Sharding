package org.example.service;

import org.example.domain.Order;

import java.util.List;

/**
 * @author Yanni
 */
public interface OrderService {

    Order save(Order order);

    Order update(Long id, Order order);

    List<Order> listByUserId(Long userId);
}
