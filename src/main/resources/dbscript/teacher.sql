-- ----------------------------
-- Table structure for `teacher`
-- ----------------------------
-- DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
    `id` bigint(20) NOT NULL   AUTO_INCREMENT  COMMENT '自增长ID',  
    `nick_name` varchar(30) NOT NULL   COMMENT '昵称',  
    `avatar` varchar(255) NOT NULL   COMMENT '头像url',  
    `create_by` varchar(10)    COMMENT '创建人',  
    `update_by` varchar(10)    COMMENT '更新人',  
    `create_at` bigint(20) NOT NULL   COMMENT '创建时间',  
    `update_at` bigint(20) NOT NULL   COMMENT '更新时间',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;





