package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.domain.Order;

import java.util.List;

/**
 * @author Yanni
 */
@Mapper
public interface OrderMapper {

    void add(Order order);

    List<Order> listAll();

    Order queryByOrderId(String orderId);
}