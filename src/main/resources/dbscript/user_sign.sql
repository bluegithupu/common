-- ----------------------------
-- Table structure for `user_sign`
-- ----------------------------
-- DROP TABLE IF EXISTS `user_sign`;
CREATE TABLE `user_sign` (
    `id` bigint(20) NOT NULL   AUTO_INCREMENT  COMMENT '自增长ID',  
    `user_id` bigint(20) NOT NULL   COMMENT '用户id',  
    `total_sign` int NOT NULL   COMMENT '累计签到数',  
    `max_sign` tinyint NOT NULL   COMMENT '最大连续签到',  
    `continuous_number` tinyint NOT NULL   COMMENT '连续签到',  
    `record_sign` char(35) NOT NULL   COMMENT '签到记录',  
    `bean` int NOT NULL   COMMENT '逆袭豆',  
    `create_by` varchar(10)    COMMENT '创建人',  
    `update_by` varchar(10)    COMMENT '更新人',  
    `create_at` bigint(20) NOT NULL   COMMENT '创建时间',  
    `update_at` bigint(20) NOT NULL   COMMENT '更新时间',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;





