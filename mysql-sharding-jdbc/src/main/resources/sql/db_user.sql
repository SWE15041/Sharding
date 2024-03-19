CREATE DATABASE ljw_user_db CHARACTER SET 'utf8';

USE sharding_db1;

CREATE TABLE `users` (
  `id` int NOT NULL,
  `username` varchar(255) NOT NULL COMMENT '用户昵称',
  `phone` varchar(255) NOT NULL COMMENT '注册手机',
  `PASSWORD` varchar(255) DEFAULT NULL COMMENT '用户密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';


CREATE TABLE `t_order_0` (
  `id` INT NOT NULL,
  `customer_name` VARCHAR(50) NOT NULL,
  `product_name` VARCHAR(50) NOT NULL,
  `quantity` INT(11) NOT NULL,
  `order_date` DATE NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单表';