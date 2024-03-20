CREATE DATABASE sharding_db CHARACTER SET 'utf8';
CREATE DATABASE sharding_db0 CHARACTER SET 'utf8';
CREATE DATABASE sharding_db1 CHARACTER SET 'utf8';


DROP TABLE IF EXISTS `t_order`;

CREATE TABLE `t_order` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `order_id` bigint DEFAULT NULL,
  `user_id` bigint DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `total_amount` DECIMAL(10, 2) DEFAULT NULL,
  `pay_time` DATETIME  DEFAULT NULL,
  `payment_method` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
