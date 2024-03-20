package org.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.domain.Order;

import java.util.List;

/**
 * @author Yanni
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

    void add(Order order);

    List<Order> listAll();

    Order queryByOrderId(Long orderId);

    List<Order> listByUserId(Long userId);
}