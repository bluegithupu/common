-- ----------------------------
-- Table structure for `company`
-- ----------------------------
-- DROP TABLE IF EXISTS `company`;
CREATE TABLE `company` (
    `id` bigint NOT NULL   AUTO_INCREMENT  COMMENT '自增长ID',  
    `name` varchar(50)    COMMENT '公司名称',  
    `status` varchar(1)    COMMENT '状态 (1正常0禁用)',  
    `update_at` bigint NOT NULL   COMMENT '数据更新时间',  
    `create_at` bigint NOT NULL   COMMENT '数据创建时间',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;





