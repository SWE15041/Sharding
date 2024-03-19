CREATE TABLE `t_course_1` (
  `cid` bigint(20) NOT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  `corder_no` bigint(20) DEFAULT NULL,
  `cname` varchar(50) DEFAULT NULL,
  `brief` varchar(50) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_course_2` (
  `cid` bigint(20) NOT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  `corder_no` bigint(20) DEFAULT NULL,
  `cname` varchar(50) DEFAULT NULL,
  `brief` varchar(50) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
