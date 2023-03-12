CREATE TABLE `tb_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `code` varchar(32) NOT NULL COMMENT '用户编码',
  `name` varchar(100) DEFAULT NULL COMMENT '名称',
  `phone` varchar(16) DEFAULT NULL COMMENT '手机号码',
  `password` varchar(100) DEFAULT NULL COMMENT '密码',
  `salt` varchar(100) DEFAULT NULL COMMENT '盐值',
  `status` int(11) DEFAULT '1' COMMENT '状态（预留字段，暂未启用）',
  `createdAt` datetime DEFAULT NULL COMMENT '创建时间',
  `updatedAt` datetime DEFAULT NULL COMMENT '更新时间',
  `email` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `sex` varchar(2) DEFAULT NULL COMMENT '性别',
  `source` varchar(2) DEFAULT NULL COMMENT '来源',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uni_code` (`code`),
  UNIQUE KEY `uni_phone` (`phone`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户基础信息表';