DROP TABLE IF EXISTS user ;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(20) NOT NULL COMMENT '姓名',
  `age` int(5) DEFAULT NULL COMMENT '年龄',
  `sex` int(5) DEFAULT NULL COMMENT '性别 0-女 1-男',
  `nickname` VARCHAR(20) DEFAULT NULL COMMENT '昵称',
  `birthday` DATETIME DEFAULT NULL COMMENT '生日',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;