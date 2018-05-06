-- ----------------------------
-- Table structure for `department`
-- ----------------------------
-- DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
    `id` bigint NOT NULL   AUTO_INCREMENT  COMMENT '自增长ID',  
    `name` varchar(50)    COMMENT '部门名称',  
    `status` varchar(1)    COMMENT '状态 (1正常0禁用)',  
    `company_id` bigint    COMMENT '公司ID',  
    `update_at` bigint NOT NULL   COMMENT '数据更新时间',  
    `create_at` bigint NOT NULL   COMMENT '数据创建时间',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;





