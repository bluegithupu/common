-- ----------------------------
-- Table structure for `module`
-- ----------------------------
-- DROP TABLE IF EXISTS `module`;
CREATE TABLE `module` (
    `id` bigint(20) NOT NULL   AUTO_INCREMENT  COMMENT '自增长ID',  
    `name` varchar(10) NOT NULL   COMMENT '模块名',  
    `url` varchar(255) NOT NULL   COMMENT 'url',  
    `parent_id` bigint(20) NOT NULL   COMMENT '父模块',  
    `create_by` varchar(10)    COMMENT '创建人',  
    `update_by` varchar(10)    COMMENT '更新人',  
    `create_at` bigint(20) NOT NULL   COMMENT '创建时间',  
    `update_at` bigint(20) NOT NULL   COMMENT '更新时间',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;





