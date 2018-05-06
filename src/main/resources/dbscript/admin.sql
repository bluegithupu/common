-- ----------------------------
-- Table structure for `admin`
-- ----------------------------
-- DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
    `id` bigint(20) NOT NULL   AUTO_INCREMENT  COMMENT '自增长ID',  
    `role_id` bigint(20) NOT NULL   COMMENT '角色id',  
    `salt` varchar(255) NOT NULL   COMMENT '盐',  
    `username` varchar(20) NOT NULL   COMMENT '用户名',  
    `password` varchar(20) NOT NULL   COMMENT '密码',  
    `phone` varchar(15) NOT NULL   COMMENT '手机',  
    `create_by` varchar(10)    COMMENT '创建人',  
    `update_by` varchar(10)    COMMENT '更新人',  
    `create_at` bigint(20) NOT NULL   COMMENT '创建时间',  
    `update_at` bigint(20) NOT NULL   COMMENT '更新时间',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;





