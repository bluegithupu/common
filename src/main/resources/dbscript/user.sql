-- ----------------------------
-- Table structure for `user`
-- ----------------------------
-- DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
    `id` bigint(20) NOT NULL   AUTO_INCREMENT  COMMENT '自增长ID',  
    `open_id` varchar(30) NOT NULL   COMMENT '微信OpenID',  
    `phone` varchar(15) NOT NULL   COMMENT '手机号',  
    `email` varchar(30) NOT NULL   COMMENT '邮箱',  
    `password` varchar(18) NOT NULL   COMMENT '密码',  
    `nick_name` varchar(18) NOT NULL   COMMENT '昵称',  
    `grade` tinyint(2) NOT NULL   COMMENT '年级',  
    `avatar` varchar NOT NULL   COMMENT '头像url',  
    `adress` varchar(10) NOT NULL   COMMENT '省份+市区',  
    `status` tinyint(1) NOT NULL   COMMENT '是否冻结',  
    `sex` tinyint(1) NOT NULL   COMMENT '性别',  
    `create_by` varchar(10)    COMMENT '创建人',  
    `update_by` varchar(10)    COMMENT '更新人',  
    `create_at` bigint(20) NOT NULL   COMMENT '创建时间',  
    `update_at` bigint(20) NOT NULL   COMMENT '更新时间',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;





