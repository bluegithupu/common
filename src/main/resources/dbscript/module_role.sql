-- ----------------------------
-- Table structure for `module_role`
-- ----------------------------
-- DROP TABLE IF EXISTS `module_role`;
CREATE TABLE `module_role` (
    `id` bigint(20) NOT NULL   AUTO_INCREMENT  COMMENT '自增长ID',  
    `role_id` bigint(20) NOT NULL   COMMENT '角色id',  
    `module_id` bigint(20) NOT NULL   COMMENT '模块id',  
    `create_by` varchar(10) NOT NULL   COMMENT '创建人',  
    `update_by` varchar(10) NOT NULL   COMMENT '更新人',  
    `create_at` bigint(20) NOT NULL   COMMENT '创建时间',  
    `update_at` bigint(20) NOT NULL   COMMENT '更新时间',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;





