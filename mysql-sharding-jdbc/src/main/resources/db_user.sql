CREATE DATABASE ljw_user_db CHARACTER SET 'utf8';

USE ljw_user_db;

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `username` varchar(255) NOT NULL COMMENT '用户昵称',
  `phone` varchar(255) NOT NULL COMMENT '注册手机',
  `PASSWORD` varchar(255) DEFAULT NULL COMMENT '用户密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';
