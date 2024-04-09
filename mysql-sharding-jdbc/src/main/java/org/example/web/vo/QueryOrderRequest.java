package org.example.web.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Yanni
 */
@Getter
@Setter
@AllArgsConstructor
public class QueryOrderRequest {
    private int pageNo = 1;
    private int pageSize = 10;
    private Long userId;
}
