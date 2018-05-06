-- ----------------------------
-- Table structure for `occupation`
-- ----------------------------
-- DROP TABLE IF EXISTS `occupation`;
CREATE TABLE `occupation` (
    `id` bigint(20) NOT NULL   AUTO_INCREMENT  COMMENT '自增长ID',  
    `name` varchar(50) NOT NULL   COMMENT '用户ID',  
    `status` int(10)    COMMENT '状态',  
    `` varchar(20)    COMMENT '职业类型',  
    `create_by` bigint NOT NULL   COMMENT '创建人ID',  
    `update_by` bigint NOT NULL   COMMENT '更新人ID',  
    `update_at` bigint NOT NULL   COMMENT '数据更新时间',  
    `create_at` bigint NOT NULL   COMMENT '数据创建时间',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;





