-- ----------------------------
-- Table structure for `temporary_data`
-- ----------------------------
-- DROP TABLE IF EXISTS `temporary_data`;
CREATE TABLE `temporary_data` (
    `id` bigint(20) NOT NULL   AUTO_INCREMENT  COMMENT '自增长ID',  
    `open_id` varchar NOT NULL   COMMENT 'openID',  
    `access_token` varchar NOT NULL   COMMENT '授权token',  
    `email_code` int(5) NOT NULL   COMMENT '邮件激活码',  
    `phone_code` int(5) NOT NULL   COMMENT '手机激活码',  
    `email_code_times` tinyint(1) NOT NULL   COMMENT '邮件当天激活次数',  
    `phone_code_times` tinyint(1) NOT NULL   COMMENT '手机当天激活次数',  
    `create_by` varchar(10)    COMMENT '创建人',  
    `update_by` varchar(10)    COMMENT '更新人',  
    `create_at` bigint(20) NOT NULL   COMMENT '创建时间',  
    `update_at` bigint(20) NOT NULL   COMMENT '更新时间',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;





