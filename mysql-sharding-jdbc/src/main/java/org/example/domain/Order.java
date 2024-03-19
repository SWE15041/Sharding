package org.example.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

/**
 * @author Yanni
 */
@TableName("t_order")
@Data
@ToString
public class Order {
    private Long id;
    private Long userId;
    private Long orderId;
    private String userName;
}
